package EjerciciosBasicos2;
import java.util.*;
public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int top;
		System.out.println("Dame un número para hacer el triángulo de Floyd:");
		top = teclado.nextInt();

		for (int y = 0; y <= top; y++) {
			for (int x = 1; x <= y; x++) {
				System.out.print( x + " ");
				
			}
			System.out.println(" ");
		}
	}

}
