import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class EscritaTest {

    @Test
    public void writeInFile() {
        Escrita escrita = new Escrita();

        escrita.writeFile("calculos.txt");

        assertTrue(escrita.getFile().exists());
        assertTrue(escrita.getFile().length() > 0);
    }
}