package basicos2;
import java.util.*;
public class Ej9 {
 public static void main(String[] args) {
	 Scanner teclado=new Scanner(System.in);
		int n1,n2,suma=0;
		
		System.out.println("Introducir primer numero");
		n1=teclado.nextInt();
		System.out.println("Introducir segundo numero");
		n2=teclado.nextInt();
		for(int i=1;i<=n1;i++)
		  suma=suma+n2;	
		System.out.println("El producto de "+n1+"*"+n2+" es "+suma); 
		teclado.close();
		/*
		 * for(int i=1;i<=n2;i++)
		     suma=suma+n1; 
		 */

	}

}