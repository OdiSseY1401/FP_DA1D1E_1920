package basicos1;
import java.util.Scanner;
public class Ej20 {
  public static void main(String[] args) {
	  Scanner teclado=new Scanner(System.in);
	  int i,n;
	  
	  do{
	     System.out.println("Introducir numero mayor que 2");
	     n=teclado.nextInt();
	  }while(n<=2);
	  
	  for(i=2;i<n;i++)//Ignoro el 1 y el mismo número porque así me lo piden
		  if(n%i==0) {
			  //System.out.println(i + " es divisor "); 
			  System.out.println(n/i + "*" + i + " ");  
		  }
	  	
	  teclado.close();
	}
}