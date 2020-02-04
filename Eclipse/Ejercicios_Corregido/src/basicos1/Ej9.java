package basicos1;

import java.util.Scanner;
public class Ej9 {
  public static void main(String[] args){
	  final int N = 100;
	  Scanner teclado=new Scanner(System.in);
	  int i;
	  System.out.println("GALONES         LITROS\n");
	  
	  for(i=1;i<=N;i++){
		 System.out.println("   "+i+"\t\t"+(i*3.7854));
	     if(i%10==0) 
			System.out.println();	    
	  }
	  
	  teclado.close();
   }
}
