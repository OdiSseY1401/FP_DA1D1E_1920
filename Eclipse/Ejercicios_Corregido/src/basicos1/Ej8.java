package basicos1;

import java.util.Scanner;
public class Ej8 {
  public static void main(String[] args){
	  Scanner teclado=new Scanner(System.in);
	  int suma=0,num,i,N;
	  System.out.println("¿Cuantos numeros desea sumar?");
	  N=teclado.nextInt();
	  
	  for(i=1;i<=N;i++){
	    System.out.println("Introducir numero");
	    num=teclado.nextInt();
	    suma=suma+num;
	  }
	  System.out.println("La suma de los numeros es "+suma);
	  teclado.close();
   }
}