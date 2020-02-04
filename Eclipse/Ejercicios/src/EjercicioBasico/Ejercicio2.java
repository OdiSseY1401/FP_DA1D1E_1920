package EjercicioBasico;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String galonesS;
		double galones;
		

		System.out.print("Dime cuantos galones hay: ");
		galonesS = sc.nextLine();
		galones = Double.parseDouble(galonesS);
		
		System.out.print("Si cada galon lleva en total 3.7854 litros, hay un total de: " + (galones * 3.7854));
	}

}
