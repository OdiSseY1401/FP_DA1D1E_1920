package Arrays2;
import java.util.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int dni= rellenarDNI(tec);
		char [] vocales = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P','D','X','B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		char letra= adivinarLetra(dni, vocales);
		System.out.println("La letra de tu DNI, es: " + letra);
		System.out.println("Tu DNI es: " + dni + letra);
	}
	public static int rellenarDNI(Scanner teclado) {
		int num;
		System.out.println("Dime los 8 números de tu DNI:");
		num=Integer.parseInt(teclado.nextLine());
		return num;
	}
	public static char adivinarLetra(int numeros, char[] letras) {
		int resul= numeros%23;
		char letra=letras[resul];
		return letra;
	}
}
