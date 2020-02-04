package Ej_Cadenas;
import java.util.*;
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String buscar, buscado;
		int contador=0;
		System.out.println("Pon una frase: "); 
		buscado = teclado.nextLine(); // Donde vamos a buscar la palabra
		System.out.println("Pon una palabra de la frase anterior y te diré cuantas veces aparece: ");
		buscar = teclado.nextLine(); // Palabra que vamos a buscar
		System.out.println("Ha salido " + contador(buscar, buscado) + " veces.");
	}
	public static int contador(String cad, String subCad) {
		int posicion=0, cont=0;
		while (posicion>= 0) {
			posicion=cad.indexOf(subCad, posicion);
			if (posicion>=0) {
				posicion += subCad.length();
				cont++;
			}
		}
		return cont;
	}
}
