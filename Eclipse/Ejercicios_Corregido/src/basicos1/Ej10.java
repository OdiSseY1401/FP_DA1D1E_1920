package basicos1;

import java.util.Scanner;
public class Ej10 {
  public static void main(String[] args){
	  final int N = 100;
	  Scanner teclado=new Scanner(System.in);
	  int i=1,c=0;
	  
	  while(c<N){
		 if(i%2==0){
			System.out.println(i);
		    c++;
		 }
		 i++;
	  }
	  
	  teclado.close();
   }
}
