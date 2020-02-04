package Ej_Cadenas;
import java.util.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String cadena;
		System.out.println("Dime una frase y le daré la vuelta:");
		cadena=teclado.nextLine();
		System.out.println(cadenaInvertida(cadena));
	}
	public static String cadenaInvertida (String frase) {
		StringBuilder invertido = new StringBuilder(frase);
		return invertido.reverse().toString();
	}
}
