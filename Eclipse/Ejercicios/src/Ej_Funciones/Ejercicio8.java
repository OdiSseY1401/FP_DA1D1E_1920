package Ej_Funciones;
import java.util.*;
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double num;
		do {
		System.out.println("Dime un n�mero y te dir� sus cifras:");
		num=teclado.nextDouble();
		}while(num<0);
		
		System.out.println("El n�mero de cifras de tu n�mero es de " + cifras(num));
		
	}

	public static int cifras (double n) {
		int i=0;
		do {
			n = n / 10;
			i++;
		} while (n>1);
		return i;
	}
}
