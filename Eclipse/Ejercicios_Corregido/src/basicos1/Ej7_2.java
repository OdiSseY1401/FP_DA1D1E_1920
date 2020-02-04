package basicos1;


import java.util.Scanner;
public class Ej7_2 {
  public static void main(String[] args){
	  final int N = 10;
	  Scanner teclado=new Scanner(System.in);
	  int suma=0,num,i;
	  
	  i=1;
	  
	  while(i<=N){
	    System.out.println("Introducir numero");
	    num=teclado.nextInt();
	    suma+=num;
	    i++;
	  }
	  
	  System.out.println("La suma de los " + N + " numeros es "+suma);
	  teclado.close();
   }
}
