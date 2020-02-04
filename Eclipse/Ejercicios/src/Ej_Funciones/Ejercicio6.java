package Ej_Funciones;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int radio;
		int base;
		int altura;
		int lado;
		String op;
		do {
			System.out.println("De estas figuras (Círculo, cuadrado o triángulo), ¿Que área quieres calcular?:  ");
			op = teclado.nextLine();
			if (op.equals("Circulo") || op.equals("Cuadrado") || op.equals("Triangulo")) {
				
			}else {
				System.out.println("Error");
			}
		} while (!op.equals("Circulo") && !op.equals("Cuadrado") && !op.equals("Triangulo"));
		if (op.equals("Circulo")) {
			System.out.println("Dime el radio");
			radio = teclado.nextInt();
			Circulo(op, radio);
		}else if (op.equals("Cuadrado")) {
			System.out.println("Dime un lado");
			lado = teclado.nextInt();
			Cuadrado(op,lado);
		}else {
			System.out.println("Dime la altura");
		altura = teclado.nextInt();
		System.out.println("Dime la base");
		base = teclado.nextInt();
		Triangulo(op,base,altura);
		}
		teclado.close();
	}
	public static void Circulo(String ope, int rad) {
		double PI = 3.14;
		System.out.println("El área de tu circulo es: " + (Math.pow(rad, 2) * PI));
	}
	public static void Cuadrado(String ope, int lado) {
		System.out.println("El área de tu cuadrado es: " + ((lado * lado)/2));
	}
	public static void Triangulo(String ope, int base, int altura) {
		System.out.println("El área de tu triangulo es: " + (base * altura) / 2);
	}
}
