package basicos2;
import java.util.*;
public class Ej14_2 {
	public static void main(String[] args) {
		 Scanner teclado=new Scanner(System.in);
		 double base,potencia=1;
		 int exponente;
		 System.out.println("Introducir base");
		 base=teclado.nextDouble();
		 
		 do{
		  System.out.println("Introducir exponente");
		  exponente=teclado.nextInt();
		 }while(exponente<0);
		 
		 for(int i=1;i<=exponente;i++)
			potencia=potencia*base;
		 
		 System.out.println((int)base+ " elevado a "+exponente+" es "+(int)potencia);	
		 teclado.close(); 
	}

}
