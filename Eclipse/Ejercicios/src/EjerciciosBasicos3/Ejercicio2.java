package EjerciciosBasicos3;
import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int a,b,sumaA,sumaB;
		System.out.println("Introducir un numero");
		a=teclado.nextInt();
		System.out.println("Introducir otro numero");
		b=teclado.nextInt();
		sumaA= sumaDivisores(a);
		sumaB= sumaDivisores(b);
	if (sumaA==b && sumaB==a)
		System.out.println();
	else
		System.out.println();
	}
	public static int sumaDivisores(int a) {
		int sa =0;
		for (int i=1;i<a;i++) {
			if (a%i==0)
				sa =sa+i;
		}
		return sa;
	}
}
