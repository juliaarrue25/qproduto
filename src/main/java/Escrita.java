import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escrita {

    public File file;

    public Escrita() {
    }

    public File getFile() {
        return file;
    }

    public void writeFile(String fileName) {
        try {
            file = new File(fileName);
            FileWriter fw;
            fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                bw.write(i + ":" + Math.pow(i, 2) + ":" + Math.pow(i, 3) + "\n");
            }

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
