package EjerciciosBasicos3;
import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		String intentosS, numS;
		int aleatorio = (int)(Math.random()*200+1);
		int intentos, num, x=0;
		System.out.println("¿Cuantos intentos quieres tener?");
		intentosS=teclado.nextLine();
		intentos=Integer.parseInt(intentosS);
	
		do {
			System.out.println("intenta adivinar el número:");
			numS=teclado.nextLine();
			num=Integer.parseInt(numS);
			
			if (num < aleatorio) {
				System.out.println("Tu numero es menor");
				x++;
			}
			else if (num > aleatorio) {
				System.out.println("Tu numero es mayor");
				x++;
			}
			else {
				x++;
			}
		} while (x<intentos && num != aleatorio);
		
		if (x == intentos ) {
			System.out.println("No has conseguido adivinar el número." + " El número era: " + aleatorio);
		}
		else if (num == aleatorio) {
			System.out.println("Has adivinado el número en el intento: " + x + " El número era: " + aleatorio);
			
		}
	}

}
