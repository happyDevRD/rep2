package com.greenaall.util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.UUID;

import javax.imageio.ImageIO;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.greenaall.exception.FirmaExistenteException;
import com.greenaall.exception.NoFirmafException;
import com.greenaall.models.ge.dto.DatosFirma;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfSignatureAppearance;
import com.itextpdf.text.pdf.PdfSignatureAppearance.RenderingMode;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.security.BouncyCastleDigest;
import com.itextpdf.text.pdf.security.DigestAlgorithms;
import com.itextpdf.text.pdf.security.ExternalDigest;
import com.itextpdf.text.pdf.security.ExternalSignature;
import com.itextpdf.text.pdf.security.MakeSignature;
import com.itextpdf.text.pdf.security.MakeSignature.CryptoStandard;
import com.itextpdf.text.pdf.security.PrivateKeySignature;

public class FirmaServidor {

	public static String firmaServidor(DatosFirma datosFirma, String sInstalacion, String sPasswordCertificado, String sMunicipio,  
			String sTipoFirma, String sUrlVerifica, String sRuta) {
		
		Security.addProvider(new BouncyCastleProvider());
		int iNumeroPaginas = 0; 

		try {		
			File oFicheroDestino = new File(sRuta);
	        File to = Fichero.dameFicheroTemporal(".pdf");
	 
	        try {
	        	Files.copy(oFicheroDestino.toPath(), to.toPath(), StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
	            System.out.println("Archivo copiado!.");
	        }
	        catch (IOException ex) {
	        	throw new NoFirmafException();
	        }
				
			PdfReader reader = new PdfReader(to.getAbsolutePath());
			iNumeroPaginas = reader.getNumberOfPages();
			
			KeyStore ks = KeyStore.getInstance("pkcs12");
			ks.load(new FileInputStream(sInstalacion), sPasswordCertificado.toCharArray());
			String alias = (String)ks.aliases().nextElement();
			PrivateKey key = (PrivateKey)ks.getKey(alias, sPasswordCertificado.toCharArray());
            java.security.cert.Certificate[] chain = ks.getCertificateChain(alias);
            Calendar fechaHoy = GregorianCalendar.getInstance();                      
            X509Certificate cert = (X509Certificate) chain[0];          
            File archivo = Fichero.dameFicheroTemporal(".pdf");
            File archivoQR = Fichero.dameFicheroTemporal(".jpg");
            String sNombreFicheroOut = archivo.getAbsolutePath();
            String sNombreFichero = "";
         	int i = 0;
         	UUID uuid = UUID.randomUUID();
         	String s = java.util.Base64.getEncoder().encodeToString(asByteArray(uuid));
    		String cve = s.split("=")[0];
    		sUrlVerifica = sUrlVerifica + "buscarDocumento.egim?cve=" + cve;
    		BufferedImage imagen = crearQR(sUrlVerifica, 50, 50);
            ImageIO.write(imagen, "jpg", archivoQR);
            String pathQR = archivoQR.getAbsolutePath();
            FileOutputStream fout;
        	do  {
		         i++;
		         String numCadena= String.valueOf(i);
		         fout = new FileOutputStream(sNombreFicheroOut);
		         PdfStamper stp = PdfStamper.createSignature(reader, fout, PdfWriter.VERSION_1_7, null, true);
		         PdfSignatureAppearance sap = stp.getSignatureAppearance();
		         sap.setRunDirection(PdfWriter.SIGNATURE_EXISTS); 
		         sap.setSignDate(fechaHoy); 
		         sap.setReason(datosFirma.getAsunto());
		         sap.setLocation(sMunicipio);
		         sap.setCertificate(chain[0]);
		         sap.setCertificationLevel(PdfSignatureAppearance.NOT_CERTIFIED);
		         sap.setSignatureGraphic(Image.getInstance(pathQR));
		         sap.setRenderingMode(RenderingMode.GRAPHIC_AND_DESCRIPTION);
		         sap.setLayer2Font(new Font(FontFamily.TIMES_ROMAN));
		         sap.setLayer2Text("Firmado Digitalmente por:\n" + datosFirma.getTexto() + "\n" + datosFirma.getAsunto() + "\n" + "CVE: " + cve);    
		         if(sTipoFirma.equals("2")) {
		        	 sap.setVisibleSignature(new Rectangle(450, 60, 130, 10), i, "Firma"+numCadena);
		         }else {
		        	 setVisibleSignatureRotated(stp, sap, new Rectangle(20, 450, 170, 670), i, "Firma"+numCadena, pathQR);
		         }
		         ExternalDigest digest = new BouncyCastleDigest();
		         BouncyCastleProvider provider = new BouncyCastleProvider();
		         ExternalSignature signature = new PrivateKeySignature(key, DigestAlgorithms.SHA256, provider.getName());
		         MakeSignature.signDetached(sap, digest, signature, chain, null, null, null, 0, CryptoStandard.CMS);
		         if(i != iNumeroPaginas ) {
		        	 sNombreFichero = sNombreFicheroOut;
			         reader = new PdfReader(sNombreFichero);
			         archivo = Fichero.dameFicheroTemporal(".pdf");
			         sNombreFicheroOut = archivo.getAbsolutePath();
		         } 
        	} while (i < iNumeroPaginas);
        	fout.close();
        	reader.close();
        	return sNombreFicheroOut;
		} catch (IllegalArgumentException e) {
			throw new FirmaExistenteException();
		} catch (Exception e) {
			throw new NoFirmafException();
		}
	}
	
	private static void setVisibleSignatureRotated(PdfStamper stamper, PdfSignatureAppearance appearance, Rectangle pageRect, int page, String fieldName, String pathQR) 
			 throws DocumentException, IOException {
	        float height = pageRect.getHeight();
	        float width = pageRect.getWidth();
	        float llx = pageRect.getLeft();
	        float lly = pageRect.getBottom();
	        appearance.setVisibleSignature(new Rectangle(llx, lly, llx + height, lly + width), page, null);
	        appearance.getAppearance();
	        appearance.setVisibleSignature(new Rectangle(llx, lly, llx + width, lly + height), page, fieldName);
	        appearance.getTopLayer().setWidth(width);
	        appearance.getTopLayer().setHeight(height);
	        PdfTemplate n2Layer = appearance.getLayer(2);
	        n2Layer.setWidth(width);
	        n2Layer.setHeight(height);
	        PdfTemplate t = PdfTemplate.createTemplate(stamper.getWriter(), height, width);
	        com.itextpdf.text.pdf.ByteBuffer internalBuffer = t.getInternalBuffer();
	        internalBuffer.write(n2Layer.toString().getBytes());
	        n2Layer.reset();
	        Image textImg = Image.getInstance(t);
	        Image bidi = Image.getInstance(pathQR);
	        textImg.setInterpolation(true);
	        textImg.scaleAbsolute(height, width);
	        textImg.setRotationDegrees((float) 90);
	        textImg.setAbsolutePosition(0, 0);
	        bidi.setRotationDegrees((float) 90);
	        bidi.setAbsolutePosition(0, 0);
	        n2Layer.addImage(bidi);
	        n2Layer.addImage(textImg);
	 }
	
	private static byte[] asByteArray(UUID uuid) {

        long msb = uuid.getMostSignificantBits();
        long lsb = uuid.getLeastSignificantBits();
        byte[] buffer = new byte[16];

        for (int i = 0; i < 8; i++) {
                buffer[i] = (byte) (msb >>> 8 * (7 - i));
        }
        for (int i = 8; i < 16; i++) {
                buffer[i] = (byte) (lsb >>> 8 * (7 - i));
        }

        return buffer;
	}
	
	public static BufferedImage crearQR(String datos, int ancho, int altura) throws WriterException {
	    BitMatrix matrix;
	    Writer escritor = new QRCodeWriter();
	    matrix = escritor.encode(datos, BarcodeFormat.QR_CODE, ancho, altura);
	         
	    BufferedImage imagen = new BufferedImage(ancho, altura, BufferedImage.TYPE_INT_RGB);
	         
	    for(int y = 0; y < altura; y++) {
	        for(int x = 0; x < ancho; x++) {
	            int grayValue = (matrix.get(x, y) ? 0 : 1) & 0xff;
	            imagen.setRGB(x, y, (grayValue == 0 ? 0 : 0xFFFFFF));
	        }
	    } 
	    return imagen;        
	}
}
