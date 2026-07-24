package com.greenaall.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.Key;
import java.security.MessageDigest;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import com.greenaall.exception.CtrError;

public class Codificador {

	public static final String ENCRYPT_KEY = "Gos12345Gos12345";

	public static synchronized String encriptar(String psCadena) {
		MessageDigest oMD = null;

		try {
			oMD = MessageDigest.getInstance("SHA");
			oMD.update(psCadena.getBytes("UTF-8"));
		} catch (Exception e) {
		}
		byte raw[] = oMD.digest();
		String sResultado = new String(Base64.getEncoder().encode(raw));
		return sResultado;
	}

	public static synchronized String decrypt(String encrypted) throws Exception {
		byte[] encryptedBytes = com.greenaall.util.Base64.decode(encrypted.replace("\n", ""));

		Key aesKey = new SecretKeySpec(ENCRYPT_KEY.getBytes(), "AES");

		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.DECRYPT_MODE, aesKey);

		String decrypted = new String(cipher.doFinal(encryptedBytes));

		return decrypted;
	}

	public static String codificarB64(File fichero) throws Exception {
		String contenidoBase64 = null;

		try {
			FileInputStream in = new FileInputStream(fichero);
			try {
				byte[] buffer = null;

				/* Obtenemos el tamaño del archivo */

				buffer = new byte[(int) fichero.length()];

				in.read(buffer);

				/* Codificar el contenido del fichero en Base 64 */
				contenidoBase64 = Base64.getEncoder().encodeToString(buffer);

			} finally {
				try {
					if (in != null) {
						in.close();
					}
				} catch (IOException e) {
					System.err.println("Error cerrando fichero. " + e.getMessage());
				}
			}
		} catch (Exception e) {
			/* Error en el contenido del documento */

			throw new CtrError("Error extrayendo contenido del documento", e);
		}

		return contenidoBase64;
	}

	public static void decodificarB64(String contenidoBase64, File ficheroDestino) throws IOException {
		FileOutputStream out = new FileOutputStream(ficheroDestino);
		try {
			byte[] contenido = Base64.getDecoder().decode(contenidoBase64);

			out.write(contenido);
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				System.err.println("Error cerrando fichero");
			}
		}
	}

}
