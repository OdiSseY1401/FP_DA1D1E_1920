package Ej_Cadenas;
import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		int Numero;
		System.out.println("Dime un n�mero y te dire si es capicua: ");
		Numero=teclado.nextInt();
		System.out.println(esCapicua(Numero));
	}
	
	public static boolean esCapicua (int n) {
		boolean capi=true; //Empezamos diciendo que el boolean es verdadero
		String num=Integer.toString(n); //Tenemos que pasar a cadena e numero
		int longitud=num.length(); //Tendremos que saber la longitud del n�mero para saber si tenemos que comparar todos los numeros
		for (int i=0; i<longitud/2 && capi; i++) {
			if (num.charAt(i) != num.charAt(longitud-1-i)) {
				capi=false;
			}
		}
		
		return capi;
	}
}
