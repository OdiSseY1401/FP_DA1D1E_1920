package EjerciciosBasicos2;
import java.util.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		double cap;
		double acum;
		int cont=0;
		
		System.out.println("Dime el numero 1: ");
		cap=teclado.nextDouble();
		acum=cap;
		do {
			cont++;
			acum=acum + (cap * 0.06);
		} while (acum<=cap*3);
		System.out.println("El capital se triplica en " + cont + " meses");
		teclado.close();
	}

}
