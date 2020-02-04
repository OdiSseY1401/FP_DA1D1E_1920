package EjEntregar;
import java.util.Scanner;
public class Avanzado2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double sueldo1, sueldo2, sueldoto;
		
		System.out.println("Dime tu sueldo: ");
		sueldo1 = sc.nextDouble();
		
		if (sueldo1<=1000) {
			sueldo2 = (sueldo1 * 0.1);
			sueldoto = ( sueldo1 - sueldo2);
			System.out.println("Tu sueldo es de: " + sueldoto);
		}
		else if ((sueldo1 > 1000) && (sueldo1 <= 2000)) {
			sueldo2 = (sueldo1 * 0.05);
			sueldoto = ( sueldo1 - sueldo2);
			System.out.println("Tu sueldo es de: " + sueldoto);
		}
		else if (sueldo1 > 2000) {
			sueldo2 = (sueldo1 * 0.03);
			sueldoto = ( sueldo1 - sueldo2);
			System.out.println("Tu sueldo es de: " + sueldoto);
		}
		sc.close();
	}

}
