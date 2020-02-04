package EjerciciosBasicos2;
import java.util.*;
public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		double n1;
		int n2;
		System.out.println("Dime el numero 1: ");
		n1=teclado.nextInt();
		do {
			System.out.println("Dime el numero 2: ");
			n2=teclado.nextInt();
		} while (n2<1);
		
		System.out.println("El resultado será " + elevar(n1, n2));
		teclado.close();
	}
	
	public static Double elevar (double num1, int num2) {
		int x=0;
		double acum=1;
		 do {
				x++;
				acum=acum*num1;
			} while (x<num2);
		 return acum;
	 }

}
	

