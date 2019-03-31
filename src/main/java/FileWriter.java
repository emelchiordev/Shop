import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriter implements Writer {

    Path chemin = Paths.get("c:/ocr/factures.txt");
    public String ligne;

    @Override
    public void start() {
    ligne ="";
    }

    @Override
    public void writeLine(String line) {
    ligne += line +"%n";
    }

    @Override
    public void stop() {
        try {
        Files.write(chemin, String.format(ligne).getBytes());
    }catch (IOException e) {
        System.out.println("Impossible d'écrire dans le fichier");
    }
    }

}