package basicos1;

import java.util.Scanner;
public class Ej16 {
  public static void main(String[] args){
	  Scanner teclado=new Scanner(System.in);
	  int N,a,r,s,i;
	  System.out.println("Introducir numero de terminos ");
	  N=teclado.nextInt();
	  System.out.println("Introducir el primer termino ");
	  a=teclado.nextInt();
	  System.out.println("Introducir la razon ");
	  r=teclado.nextInt();
	  
	  s=a;
	  System.out.print(a);
	  
	  for(i=1;i<N;i++){
		a=a*r; // T�rminos de la serie
		System.out.print(" "+a);
		s=s+a; // Suma de los t�rminos de la serie
	  }
	  
	  teclado.close();
	  System.out.println("\nLa suma de los terminos de la serie es "+s);
   }
}
