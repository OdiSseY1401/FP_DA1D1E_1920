package basicos1;

import java.util.Scanner;
public class Ej17 {
  public static void main(String[] args){
	  Scanner teclado=new Scanner(System.in);
	  int numero,suma=0,i;
	  
	  System.out.println("Introducir el numero a comprobar ");
	  numero=teclado.nextInt();
	  
	  while (numero != 0) {		  
		  // Comprobamos hasta el número anterior a numero si es divisible
		  for(i=1; i<numero; i++) {
			if (numero%i==0) // i es divisor
				suma=suma+i; // Suma de los divisores
		  }
		  
		  if (numero==suma)
		     System.out.println("El mumero " + numero +" es perfecto. ");
		  else
			 System.out.println("El mumero " + numero +" no es perfecto. ");  

		  System.out.println("Introducir el numero a comprobar ");
		  numero=teclado.nextInt();
		  suma=0;
	  }
	  
	  System.out.println("El programa termina. ");
	  teclado.close();
   }
}
