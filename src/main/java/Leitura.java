import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Leitura {

    private ArrayList<ResultFile> result;
    private Double somatorio;

    public Leitura() {
        this.result = new ArrayList<>();
        this.somatorio = new Double("0");
    }

    public Double calculaSomatorio(String fileName) throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String linha;
        try {
            while ((linha = reader.readLine()) != null) {
                String[] numeros = linha.split(":");
                ResultFile resultFile = new ResultFile(
                        Double.valueOf(numeros[0]),
                        Double.valueOf(numeros[1]),
                        Double.valueOf(numeros[2]));

                result.add(resultFile);
            }

            for (ResultFile resultFile : result) {

                somatorio = somatorio + resultFile.getCubo();
            }
            return new Double("10");
        } catch (IOException ignored) {
            return new Double("0");
        }
    }
}