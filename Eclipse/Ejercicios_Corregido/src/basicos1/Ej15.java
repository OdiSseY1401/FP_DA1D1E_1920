package basicos1;

import java.util.Scanner;
public class Ej15 {
  public static void main(String[] args){
	  Scanner teclado=new Scanner(System.in);
	  int i,N,f=1;
	  
	  System.out.println("Introducir numero ");
	  N=teclado.nextInt();
	  
	  for(i=1;i<=N;i++)
	    f=f*i;
	  
	  System.out.println("El factorial de " + N + " es " + f);
	  
	  f=1;
	  for(i=N;i>1;i--)
		    f=f*i;
	  
	  System.out.println("El factorial de " + N + " es " + f);
	  teclado.close();
   }
}