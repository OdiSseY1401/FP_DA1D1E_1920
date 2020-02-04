package basicos1;

import java.util.Scanner;
public class Ej19{
  public static void main(String[] args){
	  Scanner teclado=new Scanner(System.in);
	  int i,filas,j;
	  
	  System.out.println("Introducir numero de filas");
	  filas=teclado.nextInt();
	  
	  for(i=1;i<=filas;i++){
	    for(j=1;j<=i;j++)
		  System.out.print("*");
	    System.out.println();
	  }
	  
	  teclado.close();
   }
}