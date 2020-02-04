package funciones1;
import java.util.Scanner;

public class F5_1{
	
	static float suma(float n1, float n2)
	{
		return n1 + n2;
	
	}
	static float resta(float n1, float n2)
	{
		return n1 - n2;
	
	}
	static float multiplica(float n1, float n2)
	{
		return n1 * n2;
	
	}
	static float divide(float n1, float n2)
	{
		return n1 / n2;
	
	}
	
	static String menu(Scanner sc)
	{
		String opcion_menu;
		
		System.out.println();
	    System.out.println("\tSumar");
		System.out.println("\tRestar");
		System.out.println("\tMultiplicar");
		System.out.println("\tDividir");
		System.out.println("\tSalir.");
		
		System.out.print("\n\n\tElija opcion:");
		opcion_menu=sc.next().toLowerCase();
	
	    return opcion_menu;
	}
	
	public static int leerNumero(Scanner tec, String nombreNumero)
	{
	        int numero;
	 
	        System.out.print("Indique el " + nombreNumero + " : ");
	        numero = tec.nextInt();
	 
	        return numero;
	}
	
	public static void main(String args[]){
		
	   String opcion="";
	   
	   Scanner sc = new Scanner(System.in);
	  
	   while (!opcion.equals("salir"))
		{
			
		   opcion = menu(sc);
		   float numero1 = leerNumero(sc, "Indica el valor del número 1: ");
		   float numero2 = leerNumero(sc, "Indica el valor del número 2: ");
		   switch (opcion)
		   {
	         case "sumar":	 				
	 				System.out.print("Suma de " + numero1 + " y " + numero2 + " es ");
	                System.out.println(suma(numero1, numero2));
	                break;
	         case "restar":
	        	 	System.out.print("Resta de " + numero1 + " y " + numero2 + " es ");
	                System.out.println(resta(numero1, numero2));
	                break;
	         case "multiplicar":   
		        	System.out.print("Multiplicacion de " + numero1 + " y " + numero2 + " es ");
		            System.out.println(multiplica(numero1, numero2));
		            break;
		     case "dividir":  	 
			    	System.out.print("Division de " + numero1 + " y " + numero2 + " es ");
		            System.out.println(divide(numero1, numero2));
		            break;
		     case "salir":
		    	 	System.out.print("El programa termina.");
		    	 	break;
		     default:  System.out.println("Valor no válido.");
	     	}
	     }
	     sc.close();
	   }
	
}

