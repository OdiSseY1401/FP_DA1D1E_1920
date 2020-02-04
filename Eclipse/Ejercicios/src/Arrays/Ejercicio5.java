package Arrays;
import java.util.*;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int x,n=0;
		System.out.println("Dime cuantas personas se van a medir (cm):");
		x=teclado.nextInt();
		int [] numero = new int [x];
		while (n<numero.length){
			System.out.println("Dime un número");
			numero[n]=teclado.nextInt();
			n++;
		}
			System.out.println("La media de todas las alturas es de: " + media(numero) + "cm");
			System.out.println("");
			menoresMedia(numero);
			System.out.println("");
			mayoresMedia(numero);
	}
	public static int media(int[] alturas) {
		int suma=0, media;
		for (int n = 0; n < alturas.length; n++) {
			suma=suma+alturas[n];
		}
		media = suma/alturas.length;
		return media;
	}
	
	public static void menoresMedia(int[] alturas) {
		for (int n = 0; n < alturas.length; n++) {
			if (alturas[n]<media(alturas)) {
				System.out.println("La altura de la posición "+ n + " es menor que " + media(alturas));
			}
		}
	}
	
	public static void mayoresMedia(int[] alturas) {
		for (int n = 0; n < alturas.length; n++) {
			if (alturas[n]>media(alturas)) {
				System.out.println("La altura de la posición "+ n + " es mayor que " + media(alturas));
			}
		}
	}
}
