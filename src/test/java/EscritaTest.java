import junit.framework.TestCase;

public class EscritaTest extends TestCase {


    private Escrita escrita = new Escrita();

    public void testApp() {
        escrita.writeFile();

        assertTrue(escrita.file.exists());
        assertTrue(escrita.file.length() > 0);
    }
}
