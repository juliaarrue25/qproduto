import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LeituraTest {

    private Leitura leitura = new Leitura();

    @Test
    public void shouldReadFileProperly() throws FileNotFoundException {
        Double resultado = leitura.calculaSomatorio("calculos.txt");
        assertEquals(new Double("3025.0"), resultado);
    }

    @Test
    public void shouldThrownFileNotFoundException() {
        assertThrows(FileNotFoundException.class, () -> leitura.calculaSomatorio("teste123"));
    }
}