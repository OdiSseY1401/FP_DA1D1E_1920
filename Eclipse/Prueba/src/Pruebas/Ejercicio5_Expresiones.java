package Pruebas;

public class Ejercicio5_Expresiones {
	public static void main(String[] args) {
		double a=3, b=4, c=2, d=2, e=5, f=3, g=5, h=4, i=2, j=3, k=1, l=4, m=10, PI=3.141592, n=2.718281, o=5, p=4, q=3, r=0.05, s=2.3;
	System.out.println("5.- Evaluar las expresiones lógicas aplicando la jerarquía de operadores.");
	System.out.println("((a * b) <(b + c)) && (a == c)= " + (((a * b) < (b + c)) && (a == c)));
	System.out.println("((d + e) > f) || ((e / g > e))");
	System.out.println("(h / i) * j + (h / i)");
	System.out.println("PI * k * k > l || 2 * PI * k <= m");
	System.out.println("k > 3 && l == 4 || k + l <= m");
	System.out.println("k > 3 && (l == 4 || k + l <=m)");
	System.out.println("!(l / 2 == 2 *k) && !(l < PI - n * m)");
	System.out.println("o == p % q");
	System.out.println("6 / q < q % 6");
	System.out.println("q + p - 1 ! = o || p >= -p * o && o * o <= 10");
	System.out.println("p % o / q");
	System.out.println("!(r * o > s / p)");
	}
}
