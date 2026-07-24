package es.gob.aapp.libreriaENI.util.file;

import javax.activation.FileDataSource;
import java.io.IOException;
import java.io.InputStream;

// FileDataSource que usa un FileInputStream que borra el archivo tras cerrarlo
public class TemporaryFileDataSource extends FileDataSource {

    public TemporaryFileDataSource(String string) {
        super(string);
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return new TemporaryFileInputStream(this.getFile());
    }

}
