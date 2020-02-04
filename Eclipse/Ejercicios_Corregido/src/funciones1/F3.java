package funciones1;
import java.util.Scanner;

public class F3 {

	 public static void main(String[] args)
	 {
		Scanner teclado;	
		teclado = new Scanner(System.in);
		int numero1, numero2;
		 
	    System.out.print("Indica el valor del número 1: ");
	    numero1 = teclado.nextInt();
	    System.out.print("Indica el valor del número 2: ");
	    numero2 = teclado.nextInt();
	     
	    System.out.println("La suma de " + numero1 + " y " + numero2 + " es " + calcSuma(numero1, numero2) );
	     	     
	    teclado.close();
	  }
	    
	  public static int calcSuma(int num1, int num2)
	  {
	        return (num1 + num2);
	  }
}