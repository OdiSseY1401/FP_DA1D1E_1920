package Pruebas2;
import java.util.Scanner;
public class Nombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //crea un objeto escaner
		String nombre; //indica como se va a llamar la variable
		double radio;
		int n;
		System.out.print("Dime tu nombre: ");
		nombre = sc.nextLine(); //leer un String/línea
		System.out.println("Hola " + nombre + "!!!");
		
		System.out.print("Introduzca el rado de la circunferencia: ");
		radio = sc.nextDouble(); //leer un double
		System.out.println("Longitud de la circunferencia: " + 2*Math.PI*radio);
		
		System.out.print("Introduzca un número entero: ");
		n = sc.nextInt(); //lee un entero
		System.out.print("El cuadrado es: " + Math.pow(n, 2));
		
		sc.close();
	}

}
