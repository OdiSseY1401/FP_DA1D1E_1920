package basicos1;

import java.util.Scanner;
public class Ej11 {
  public static void main(String[] args){
	  Scanner teclado=new Scanner(System.in);
	  int N,a=1,b=1,s=0,i;
	  
	  System.out.println("Introducir cantidad de terminos");
	  N=teclado.nextInt();
	  
	  System.out.print(a+" "+b);
	  for(i=3;i<=N;i++){
	     s=a+b;
	     System.out.print(" "+s);
	     a=b;
	     b=s;
	  }
	  teclado.close();
	}
}
