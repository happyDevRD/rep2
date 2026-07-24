package es.gob.aapp.libreriaENI.util.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

// FileInputStream que simplemente borra un archivo tras cerrarlo
public class TemporaryFileInputStream extends FileInputStream {
    File file;

    public TemporaryFileInputStream(File file) throws FileNotFoundException {
        super(file);
        this.file = file;
    }

    @Override
    public void close() throws IOException {
        super.close();
        Files.delete(file.toPath());
    }
}
