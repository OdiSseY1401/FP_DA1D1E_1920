package basicos1;

import java.util.Scanner;
public class Ej7 {
  public static void main(String[] args){
	  final int N = 10;
	  Scanner teclado=new Scanner(System.in);
	  int suma=0,num,i;
	  
	  for(i=1;i<=N;i++){
	    System.out.println("Introducir numero");
	    num=teclado.nextInt();
	    suma+=num;
	  }
	  System.out.println("La suma de los " + N + " numeros es "+suma);
	  teclado.close();
   }
}
