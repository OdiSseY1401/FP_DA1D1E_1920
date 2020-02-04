package Ej_Funciones;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int N;
		String mens= "Módulo ejecutandose";
		System.out.println("Dime el número de veces que se repita: ");
		N = sc.nextInt();
		repite(mens, N);
		sc.close();
	}

	
	static void repite(String texto, int cantidad) {
		// TODO Auto-generated method stub
		int x = 0;
		do {
			System.out.println(texto);
			System.out.println(" ");
			x++;
		} while (x < cantidad);
	}
}
