import java.io.FileNotFoundException;

public class Application {

    public static void main(String[] args) {
      /*  Escrita escrita = new Escrita();

        escrita.writeFile();*/

        Leitura leitura = new Leitura();

        try {
            leitura.calculaSomatorio("calculos.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
