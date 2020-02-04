package basicos1;

import java.util.Scanner;
public class Ej14 {
  public static void main(String[] args){
	  Scanner teclado=new Scanner(System.in);
	  int n,m,resto,num1,num2;
	  
	  System.out.println("Introducir primer numero");
	  n=teclado.nextInt();
	  System.out.println("Introducir segundo numero");
	  m=teclado.nextInt();
	  
	  // Los guardo porque los voy a manipular
	  num1=n;
	  num2=m;
	  
	  resto=n%m;
	  
	  while(resto!=0){
		  n=m;
		  m=resto;
		  resto=n%m;
	  }
	  
	  System.out.println("MCD("+num1+","+num2+")= "+m);
	  teclado.close();
	}
}
