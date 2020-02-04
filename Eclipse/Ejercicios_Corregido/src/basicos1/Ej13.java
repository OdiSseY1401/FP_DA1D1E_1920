package basicos1;

import java.util.Scanner;
public class Ej13 {
  public static void main(String[] args){
	  Scanner teclado=new Scanner(System.in);
	  int suma=0,n,i,N,producto=1;
	  System.out.println("Introducir cantidad de numeros");
	  N=teclado.nextInt();
	  
	  for(i=1;i<=N;i++){
	    System.out.println("Introducir numero");
	    n=teclado.nextInt();
	    if(n%2==0)
	    	suma=suma+n;
	    else
	    	producto=producto*n;
	  }
	  
	  System.out.println("La suma de los pares "+suma+" y el producto de los impares es "+producto);
	  teclado.close();
   }
}
