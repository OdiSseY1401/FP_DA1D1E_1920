package EjerciciosBasicos2;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma=0;
		int num1=10;
		int num2=50;
		for (int i = num1; i<=num2; i++) {
			if (i % 2 == 0) {
				suma = suma+i;
			}
		}
		System.out.println("La suma de los números pares es: " + suma);
	}

}
