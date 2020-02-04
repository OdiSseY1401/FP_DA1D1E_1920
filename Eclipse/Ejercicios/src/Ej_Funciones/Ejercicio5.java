package Ej_Funciones;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		float num1;
		float num2;
		String op;
		do {
			System.out.println("¿Que operacion quieres realizar?: ");
			op = teclado.nextLine();
			if (op.equals("Suma") || op.equals("Resta") || op.equals("Multiplicacion") || op.equals("Division")) {
				
			}else {
				System.out.println("Error");
			}
		} while (!op.equals("Suma") && !op.equals("Resta") && !op.equals("Multiplicacion") && !op.equals("Division"));

		System.out.println("Dime un numero: ");
		num1 = teclado.nextFloat();
		System.out.println("Dime otro numero: ");
		num2 = teclado.nextFloat();
		operacion(op,num1,num2);
		teclado.close();
	}
	static void operacion(String ope, float nume1, float nume2) {
		switch (ope) {
		case "Suma":
			System.out.println("Ha elegido suma");
			float suma;
			suma = nume1 + nume2;
			System.out.println("La suma es: " + suma);
			break;
		case "Resta":
			System.out.println("Ha elegido resta");
			float resta;
			resta = nume1 - nume2;
			System.out.println("La resta es: " + resta);
			break;
		case "Multiplicacion":
			System.out.println("Ha elegido multiplicacion");
			float multiplicacion;
			multiplicacion = nume1 * nume2;
			System.out.println("La multiplicacion es: " + multiplicacion);
			break;
		case "Division":
			System.out.println("Ha elegido division");
			float division;
			division= nume1 / nume2;
			System.out.println("La division es: " + division);
		}
	}
}

