package basicos1;

import java.util.Scanner;
public class Ej7_3 {
  public static void main(String[] args){
	  //Mientras el num sea distinto de cero
	  Scanner teclado=new Scanner(System.in);
	  int suma=0,num;	  
	 
	  // Lectura adelantada porque el usuario introduce el dato
	  // que forma la condición
	  System.out.println("Introducir numero");
	  num=teclado.nextInt();
	 
	  while(num!=0){	   
	    suma+=num;
	    //Después de las sentencias pongo la lectura para la siguiente
	    //ejecución del bucle
	    System.out.println("Introducir numero");
	    num=teclado.nextInt();
	  }
	  
	  System.out.println("La suma de los numeros es "+suma);
	  teclado.close();
   }
}
