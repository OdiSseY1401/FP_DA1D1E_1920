package Pruebas;

public class Ejercicio4_Expresiones {
	public static void main(String[] args) {
		float a=1, b=-5, c=6, m=4, n =6, p=7, q=8, r=3;
		
	System.out.println("4.- Realizar las conversiones de expresiones matemáticas a expresiones algorítmicas indicando el orden de ejecución de cada una de ellas ");
	System.out.println("1. (m + n) / (p - q)" + ((m + n) / (p - q)));
	System.out.println("2. (-b + Raiz cuadrada b**2 -4ac) / 2a)" + ((-b + (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / 2 * a));
	System.out.println("2. (-b + Raiz cuadrada b**2 -4ac) / 2a)" + ((-b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / 2 * a));
	System.out.println("3. (M + N /P) / (A - R / 5)= " + ((m + n / p)/(a - r / 5)));
	}
}
