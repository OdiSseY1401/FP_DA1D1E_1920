package funciones1;

import java.util.Scanner;

public class F1 {

	    public static void main(String[] args)
	    {
		 Scanner teclado;	
		 teclado = new Scanner(System.in);
		 int numero;
		 
	     System.out.print("Indica el valor del número: ");
	     numero = teclado.nextInt();
	     imp_n_veces(numero); 
	     
	     teclado.close();
	    }
	    
	    public static void imp_n_veces(int num)
	    {
	        for(int i=1;i<=num;i++)       
	            System.out.println(" MODULO EJECUTANDOSE " + i + " VECES");	      
	    }
}
