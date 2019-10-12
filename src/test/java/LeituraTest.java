import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class LeituraTest {

    private Leitura leitura = new Leitura();

    @Test
    public void shouldThrownFileNotFoundException() {
        assertThrows(FileNotFoundException.class, () -> leitura.calculaSomatorio("teste123"));
    }
}