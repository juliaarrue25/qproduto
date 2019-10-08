package trabalho2.pucrs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class Leitura {
	
	
	public Double leitura() {
		try {
			ArrayList<ResultFile> result = new ArrayList<ResultFile>();
			FileReader ler = new FileReader("calculos.txt");
			BufferedReader reader = new BufferedReader(ler);
			String linha;
			Double somatorio = new Double("0");
			while((linha = reader.readLine()) != null) {
				String[] numeros = linha.split(":");
			ResultFile resultFile = new ResultFile(
					Double.valueOf(numeros[0]),
					Double.valueOf(numeros[1]),
					Double.valueOf(numeros[2]));
			
			result.add(resultFile);
			}
			
			for(ResultFile resultFile: result) {
				
				somatorio = somatorio + resultFile.getCubo();
			}
			
			System.out.println(somatorio);
			return somatorio;
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
