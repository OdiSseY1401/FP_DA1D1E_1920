package Ej_Cadenas;
import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int NUM=2;
		int contVocales=0; //contar� las vocales
		int maxVocales=0; //Tendr� el mayor numero de vocales
		String mayorNumeroVocales=""; //Guarda la frase con mas vocales
		String cadenaOriginal=""; //Guardar� la cadena original
		Scanner tecaldo= new Scanner (System.in);
		for (int i = 0; i < NUM; i++) {
			System.out.println("Dime frase " + (i+1) + " :");
			cadenaOriginal = teclado.nextLine();
			contVocales = numVocales(cadenaOriginal);
		}
		if (contVocales > maxVocales) {
			maxVocales=contVocales;
			mayorNumeroVocales = cadenaOriginal;
		}
		if (maxVocales != 0) {
			System.out.println("La cadena con m�s vocales es: " + mayorNumeroVocales + " con " + maxVocales + " vocales");
		}
		else {
			System.out.println("En ninguna cadena hab�a vocales.");
		}
		teclado.close();
	}
	
	public static int numVocales (String cadenaOriginal) {
		String cadenaMinusculas;
		cadenaMinusculas = cadenaOriginal.toLowerCase();
		int nVoc=0;
		for (int i = 0; i < cadenaMinusculas.length(); i++) {
			switch (cadenaMinusculas.charAt(i)) {
			case 'a':
			case '�':
			case 'e':
			case '�':
			case 'i':
			case '�':
			case 'o':
			case '�':
			case 'u':
			case '�':
			case '�':	
				nVoc++;
				break;
			}
		}
		return nVoc;
	}

}
