package Pruebas;

public class Ejemplo_Expresiones {
	public static void main(String[] args) {
		int x=5, y=4, a=3, b=2, c=6, d=7, e=8, u=1;
		
		System.out.println("El valor de x es: " + x + "\nEl valor de y es: "+ y);
		System.out.println("El valor de u es: " + u);
		System.out.println("El valor de a es: " + a + "\nEl valor de b es: "+ b);
		System.out.println("El valor de c es: " + c + "\nEl valor de d es: "+ d + "\nEl valor de e es: " + e + "\n");
		
		System.out.println("El valor de x**2 + y**4 es: " + (Math.pow(x, 2) + Math.pow(y, 4)));
		System.out.println("El valor de x**2 / (a**3 + b**3) es: " + (Math.pow(x, 2) / (Math.pow(a, 3) + Math.pow(b, 3))));
		System.out.println("El valor de u + (x**2 / y)" + (u + Math.pow(x, 2) / y));
		System.out.println("El valor de (a + b) / (a + c**2 / (d + e)) es: " + (a + b) / (a + Math.pow(c, 2) / (d + e)));
		
		System.out.println("\n1.- Deducir el valor de las expresiones siguientes: Siendo: A = 5; B = 25; C = 10 ");
		System.out.println("1. A + B "+ (a + b) / (a + Math.pow(c, 2) / (d + e)));
	}
}
