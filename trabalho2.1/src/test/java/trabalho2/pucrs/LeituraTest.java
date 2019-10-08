package trabalho2.pucrs;

import junit.framework.TestCase;

public class LeituraTest extends TestCase {
	
	private Leitura leitura = new Leitura();
	
	 public void testApp()
	    {
		  
		 Double resultado = leitura.leitura();
		 
		 assertEquals(new Double("3025.0"), resultado);
	    }
}