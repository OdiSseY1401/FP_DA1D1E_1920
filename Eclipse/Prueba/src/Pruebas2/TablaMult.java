package Pruebas2;
import java.util.Scanner;
public class TablaMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int numero;
		System.out.println("¿Que número quieres que multiplique? ");
		numero = teclado.nextInt();
		tabla(numero);
		teclado.close();
	}
	
	static void tabla(int num) {
		for(int x = 0; x <= 10; x++) {
			System.out.println(num + "*" + x + "= " + (num * x));
		}
		
	}
}

