package explicacion;
public class Ejemplo3 {

	public static void main(String[] args) {
		String mens = " Primer ejemplo";
		int nSub = 16;
			
	    subrayar(mens, nSub);
	   	  
 
	    subrayar(" Segundo ejemplo", 17);
	     	    
		 
	    subrayar(" Tercer ejemplo", 16);
	     
	}
	
	static void subrayar(String texto, int cantidad) {
		System.out.println( texto);
	    for (int x = 1; x < cantidad; x++) {
	    	
	    	System.out.print(" -");
	    }
	    System.out.println();  
	}
		
	}

