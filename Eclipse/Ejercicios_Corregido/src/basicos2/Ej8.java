package basicos2;
import java.util.*;
public class Ej8 {
 public static void main(String[] args) {
	 Scanner teclado=new Scanner(System.in);
		int n;
		System.out.println("Introducir numero");
		n=teclado.nextInt();
		
		for(int i=1;i<=n;i++)
		  System.out.println(i+" "+i*i+" "+i*i*i); 
		/*
		 * System.out.println(i+" "+Math.pow(i,2)+" "+Math.pow(i,3)); 
		 */
		teclado.close();
	}
}
