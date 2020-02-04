package Ej_Funciones;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.println("Dime un numero para hacer su factorial: ");
		num = teclado.nextInt();
		factorial(num);
		teclado.close();
	}
	static void factorial(int num) {
		int sum;
		int acum = 0;
		for (int x = 1;x <= num; x++) {
			sum =num * x;
			acum= sum + acum;
		}
		System.out.println("Su factorial es: " + acum);
	}
}
