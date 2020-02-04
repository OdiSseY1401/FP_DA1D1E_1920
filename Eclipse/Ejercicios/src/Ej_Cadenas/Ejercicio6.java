package Ej_Cadenas;
import java.util.*;
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String buscar, buscado,buscarUpper;
		System.out.println("Pon una frase: "); 
		buscado = teclado.nextLine(); // Donde vamos a buscar la palabra
		System.out.println("Dime algo de la frase y lo cambiaré a mayus: ");
		buscar = teclado.nextLine(); // Palabra que vamos a buscar
		
		buscarUpper= buscar.toUpperCase();
		System.out.println(buscado.replace(buscar, buscarUpper));
	}
}
