package trabalho2.pucrs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Escrita {
	
	public File file;


	public void writeFile(){
		try {
			file = new File("calculos.txt");
			FileWriter fw;
			fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
		for(int i = 1;i <= 10; i++){
			System.out.println(i);
			bw.write(i + ":" + Math.pow(i, 2) + ":" + Math.pow(i, 3) + "\n");
		}
		
	bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
