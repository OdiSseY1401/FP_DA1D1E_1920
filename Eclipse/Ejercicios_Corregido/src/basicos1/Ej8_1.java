package basicos1;

import java.util.Scanner;
public class Ej8_1 {
  public static void main(String[] args){
	  Scanner teclado=new Scanner(System.in);
	  int suma=0,num,i=1,N;
	  
	  System.out.println("Cuantos numeros desea sumar?");
	  N=teclado.nextInt();
	  
	  while(i<=N){
	    System.out.println("Introducir numero");
	    num=teclado.nextInt();
	    suma=suma+num;
	    i++;
	  }
	  
	  System.out.println("La suma de los numeros es "+suma);
	  teclado.close();
   }
}
