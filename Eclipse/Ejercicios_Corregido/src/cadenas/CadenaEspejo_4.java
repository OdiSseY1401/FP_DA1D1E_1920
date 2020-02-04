package cadenas;
import java.util.Scanner;

public class CadenaEspejo_4{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String palabra;

		
		System.out.println("Introduzca la palabra");
		palabra = scan.next(); // Es una palabra sin espacios
		
		System.out.println("Palabra espejo: " + espejar(palabra));
		System.out.println("Palabra espejo: " + espejar2(palabra));
		
		scan.close();
	}

	public static String espejar(String cadena) {
		int posicion;
		char caracter;
		
		posicion = cadena.length() - 2;
		while (posicion >= 0) {
			caracter = cadena.charAt(posicion);
			cadena += caracter;
			posicion--;
		}

		return cadena;
	}

	public static String espejar2(String cadena) {
		int posicion;
		
		posicion = cadena.length() - 2;
		while (posicion >= 0) {
			cadena += cadena.charAt(posicion--);
		}

		return cadena;
	}
}