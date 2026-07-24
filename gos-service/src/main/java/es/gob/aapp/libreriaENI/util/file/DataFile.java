package es.gob.aapp.libreriaENI.util.file;


import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class DataFile {

    private DataFile(){}

    /** Formato ficheros TEMPORALES */
    private static final String FORMAT_TEMP = ".tmp";

    private static final String INI_TEMP = "-GENERATED-";


    /**
     * Funcionalidad que escribe el contenido InputStream en el fichero indicado
     * @param contenido contenido en DataHandler
     * @param fichero fichero donde se escribirá el contenido
     * @return fichero
     * @throws IOException IOException
     */
    public static File writePathData(InputStream contenido, File fichero) throws IOException {

        FileUtils.copyInputStreamToFile(contenido, fichero);

        return fichero;
    }

    /**
     * Funcionalidad para crear un fichero temporal
     * @param identificador identificador del fichero que se crea.
     * @return fichero
     * @throws IOException IOException
     */
    public static File createTempFile(String identificador) throws IOException {

        File ficheroTemporal = File.createTempFile(identificador+INI_TEMP, FORMAT_TEMP);
        ficheroTemporal.deleteOnExit();
        return ficheroTemporal;
    }
}
