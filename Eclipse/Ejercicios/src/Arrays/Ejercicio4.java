package Arrays;
import java.util.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in); 
		int x=10, n=0, cont=0, suma=0;
		int [] numero = new int [x];
		while (n<numero.length){
			System.out.println("Dime un número");
			numero[n]=teclado.nextInt();
			n++;
		}
		
		for (n = 0; n < numero.length; n++) {
			if (n%2==0) {
				suma = suma + numero[n];
				cont++;
			}
		}
		System.out.println("La media de los números pares que has introducido es: " + (suma/cont));
		teclado.close();
	}
	
	static void rellenar (int[] a) {
		
	}
	static double medaiaPos(int[] a) {
		
	}
}
		
