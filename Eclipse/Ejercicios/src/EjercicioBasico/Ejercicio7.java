package EjercicioBasico;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int N=10;
		Scanner teclado = new Scanner(System.in);
		int suma=0, num, i;
		
		for(i=1;i<=N;i++) {
			System.out.print("Dime un número: ");
			num=teclado.nextInt();
			suma+=num;
		}
		System.out.print("El resultado es: " + suma);
	}
}
