package Ej_Cadenas;
import java.util.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		String cadena;
		System.out.println("Dime una frase y le daré la vuelta con efecto espejo:");
		cadena=teclado.nextLine();
		System.out.println(invertidoEspejo(cadena));
	}
	public static String invertidoEspejo(String frase) {
		int posicion;
		posicion = frase.length() - 2;
		while(posicion>=0){
			frase += frase.charAt(posicion--);
		}
		return frase;
	}
}
