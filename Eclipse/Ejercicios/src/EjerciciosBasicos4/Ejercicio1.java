package EjerciciosBasicos4;
import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num, i=1;
		System.out.println("Dime un n�mero: ");
		num = teclado.nextInt();
		
		while (num>0) {
			System.out.println("Hasta que no haya un n�mero negativo no paro");
			System.out.println("Dime un n�mero: ");
			num = teclado.nextInt();
			i++;
		}
		System.out.println("Intento n�: " + i);
	}

}
