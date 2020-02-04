package basicos3;

import java.util.Scanner;
public class Ej2 {
  public static void main(String[] args){
	  Scanner teclado=new Scanner(System.in);
	  int a,b,sa=0,sb=0,i;
	  System.out.println("Introducir numero a comprobar ");
	  a=teclado.nextInt();
	  System.out.println("Introducir el otro numero ");
	  b=teclado.nextInt();
	  for(i=1;i<a;i++){
		if (a%i==0)
		 sa=sa+i;
	  }
	  for(i=1;i<b;i++){
		if (b%i==0)
			 sb=sb+i;
	  }
	  teclado.close();
	  if (sa==b && sb==a)
	     System.out.println("Los numeros "+a+" y "+b+" son amigos");
	  else
		  System.out.println("Los numeros "+a+" y "+b+" no son amigos");
   }
}
