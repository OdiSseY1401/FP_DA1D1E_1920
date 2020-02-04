package basicos3;

import java.util.Scanner;
public class Ej2F {
  public static void main(String[] args){
	  Scanner teclado=new Scanner(System.in);
	  int a,b,sumaA,sumaB;
	  
	  System.out.println("Introducir numero a comprobar ");
	  a=teclado.nextInt();
	  System.out.println("Introducir el otro numero ");
	  b=teclado.nextInt();
	  sumaA = sumaDivisores(a);
	  sumaB = sumaDivisores(b);
	  teclado.close();
	  
	  if (sumaA==b && sumaB==a)
	     System.out.println("Los numeros "+a+" y "+b+" son amigos");
	  else
		  System.out.println("Los numeros "+a+" y "+b+" no son amigos");
   }
  
   public static int sumaDivisores(int a) {
	   int sa = 0;
	   for(int i=1;i<a;i++){
			if (a%i==0)
				sa=sa+i;
	   }   
	   
	   return sa;
   }
   
}
