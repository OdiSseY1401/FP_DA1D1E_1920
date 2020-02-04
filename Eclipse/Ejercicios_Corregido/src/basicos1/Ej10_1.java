package basicos1;

import java.util.Scanner;
public class Ej10_1 {
  public static void main(String[] args){
	  final int N = 100;
	  Scanner teclado=new Scanner(System.in);
	  int i=0,c=0;
	  
	  System.out.println("**************************");
	  while(c<N*2){
		System.out.println(i=i+2);
		c+=2;		
	  }
	  
	  System.out.println("********Otra forma********");
	  
	  i=1;
	  c=1;
	  
	  do { 						
			i = c*2;
			c++;
			System.out.println(i);
	  } while (c<=N);
	  
	  teclado.close();
   }
}
