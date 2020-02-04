package funciones1;

import java.util.Scanner;

public class F4_1 {

	    public static void main(String[] args)
	    {
		 Scanner teclado;	
		 teclado = new Scanner(System.in);
		 int numero;
		 
	     numero = leerNumero(teclado, "Indica el valor del número: ");
	     
	     System.out.println("El factorial de " + numero + " es " + factorial(numero) );
	  
	     teclado.close();
	    }
	    
	    public static int leerNumero(Scanner tec, String nombreNumero)
	    {
	 
	        System.out.print("Indique el " + nombreNumero + " : ");
	        
	        return tec.nextInt();
	    }
	    
	    public static double factorial(int num)
	    {
	    	double fact=1;
	    	
	    	for(int i=num; i>0; i--) {
			    fact = fact*i;
			    /*if (i!=1)
			    	System.out.print(i + ".");
			    else
			    	System.out.print(i);*/
			}
	    	return fact;
	    }
}
