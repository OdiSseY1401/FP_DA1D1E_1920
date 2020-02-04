package EjEntregar;
import java.util.Scanner;
public class Ejercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int trabaj, horas, salario, x=0, acum=0, salario_fin;
		System.out.println("Dime cuantos trabajadores hay: ");
		trabaj = sc.nextInt();
		System.out.println("Dime el salario/horas: ");
		salario = sc.nextInt();
		while (x < trabaj) {
			System.out.println("Dime las horas que trabajas: ");
			horas = sc.nextInt();
			System.out.println("Trabajas: " + horas + (" horas"));
			salario_fin = (horas * salario);
			System.out.println("El trabajador cobrará en total: " + salario_fin);
			acum = (salario_fin + acum);
			x = (x + 1);
			System.out.println(" ");
		}
		System.out.println("El salario total del grupo es: " + acum);
		sc.close();
	}

}
