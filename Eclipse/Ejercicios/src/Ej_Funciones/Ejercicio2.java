package Ej_Funciones;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int N1;
		int N2;
		System.out.println("Dime un n�mero: ");
		N1= sc.nextInt();
		System.out.println("Dime otro n�mero: ");
		N2 = sc.nextInt();
		
		operaciones (N1, N2);
		sc.close();
	}
	static void operaciones(int Num1, int Num2) {
		System.out.println("Suma: " + (Num1 + Num2) + "\n");
		System.out.println("Resta: "+ (Num1 - Num2) + "\n");
		System.out.println("Multiplicacion: " + (Num1 * Num2) + "\n");
		System.out.println("Divisi�n: " + (Num1 / Num2));
		System.out.println("Resto: " + (Num1 % Num2) + "\n");
		
	}
}
