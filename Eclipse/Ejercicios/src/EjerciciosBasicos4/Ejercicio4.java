package EjerciciosBasicos4;
import java.util.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n,cont=1,max;
		System.out.println("Introduce un numero");
		n = teclado.nextInt();
		max=n;
		while(n>=0) {
			if (n>max) {
				max=n;
				cont=1;
			}
			else if (n==max) {
				cont++;
			}
			System.out.println("Introducir un numero");
			n=teclado.nextInt();
		}
		System.out.println("Has introducido un numero negativo");
	}

}
