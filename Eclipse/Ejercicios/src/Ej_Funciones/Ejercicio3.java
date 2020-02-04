package Ej_Funciones;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int n1;
		int n2;
		System.out.println("Dime un número: ");
		n1= teclado.nextInt();
		System.out.println("Dime otro número: ");
		n2 = teclado.nextInt();
		
		operacion(n1, n2);
		teclado.close();
	}
	static void operacion(int Num1, int Num2) {
		System.out.println("Suma: " + (Num1 + Num2) + "\n");
	}
}
