import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegrationTest {

    @Test
    public void writeAndReadFileTest() throws FileNotFoundException {
        Escrita escrita = new Escrita();
        Leitura leitura = new Leitura();

        escrita.writeFile("calculos.txt");
        Double resultado = leitura.calculaSomatorio("calculos.txt");

        assertEquals(new Double("3025.0"), resultado);
    }
}
