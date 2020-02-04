package Ej_Funciones;
import java.util.*;
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double euros;
		String divisa;
		System.out.println("¿A que moneda (dolares, yenes o libras) quieres convertirlo?:  ");
		divisa = teclado.nextLine();
		System.out.println("Dime la cantidad en euros que quieres convertir: ");
		euros = teclado.nextDouble();
		
			
		if (divisa.equals ("dolares")) {
			Dolares(euros);
		}else if (divisa.equals ("yenes")) {
			Yenes(euros);
		}else {
		Libras(euros);
		}
		teclado.close();
	}
	public static void Dolares(double euros) {
		euros=euros * 1.28611;
		System.out.println("El cambio es: " + euros);
		
	}
	public static void Yenes(double euros) {
		euros=euros * 129.852;
		System.out.println("El cambio es: " + euros);
		
	}
	public static void Libras(double euros) {
		euros=euros * 0.86;
		System.out.println("El cambio es: " + euros);
		
	}
}