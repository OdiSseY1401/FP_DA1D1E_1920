package funciones1;
import java.util.Scanner;

public class F1_1 {

	    public static void main(String[] args)
	    {
		    Scanner teclado;
		    
	    	teclado = new Scanner(System.in);
	        int n;
	 
	        n = leer_numero(teclado);
	        imp_n_veces(n, " MODULO EJECUTANDOSE ", " VECES");       
	    }
	 
	    public static int leer_numero(Scanner tec)
	    {
	        int numero;
	 
	        System.out.print("Indica el valor del número: ");
	        numero = tec.nextInt();
	 
	        return numero;
	    }
	    
	    public static void imp_n_veces(int num, String cad1, String cad2)
	    {
	        for(int i=1;i<=num;i++)
	        	System.out.println(cad1 + i + cad2);	
	    }

}
