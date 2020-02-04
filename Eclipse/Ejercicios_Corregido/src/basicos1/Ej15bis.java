package basicos1;

import java.util.Scanner;
public class Ej15bis {
  public static void main(String[] args){
	  Scanner teclado=new Scanner(System.in);
	  int i,N,f=1;
	 
	  System.out.println("Introducir numero ");
	  N=teclado.nextInt();
	  
	  System.out.print(N + "! es ");
	  for(i=N;i>0;i--) {
	    f=f*i;
	    
	    if (i!=1)
	    	System.out.print(i + "*");
	    else
	    	System.out.print(i);
	  }
	  
	  System.out.println(" = " + f);
	  teclado.close();
   }
}
