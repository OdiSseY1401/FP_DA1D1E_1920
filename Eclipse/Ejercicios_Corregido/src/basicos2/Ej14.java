package basicos2;
import java.util.*;
public class Ej14 {
	public static void main(String[] args) {
		 Scanner teclado=new Scanner(System.in);
		 double base;
		 double potencia=1;
		 int exponente;
		 
		 System.out.println("Introducir base");
		 base=teclado.nextDouble();
		 
		 do{
		  System.out.println("Introducir exponente");
		  exponente=teclado.nextInt();
		 }while(exponente<0);
		 	 
		 System.out.println((int)base+ " elevado a "+exponente+" es "+potencia(base, exponente));	
		 teclado.close(); 
	}
	
	public static double potencia(double b, int e) {
		double pot = 1;
		
		for(int i=1;i<=e;i++)
			pot *= b;
		
		return pot;
	}
}
