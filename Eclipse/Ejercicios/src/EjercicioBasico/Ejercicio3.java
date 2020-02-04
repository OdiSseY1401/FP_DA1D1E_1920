package EjercicioBasico;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String piesS;
		double pies, pulgadas=2.54, yardas=0.9144;
		
		System.out.println("Dime una medida en 'pies': ");
		piesS = sc.nextLine();
		pies = Double.parseDouble(piesS);
		
		System.out.println("Son: " + (pies * (pulgadas * 12)) + "cm");
		System.out.println("Son: " + ((pies * (pulgadas * 12)) / 100) + "m");
		System.out.println("Son: " + ((pies * (pulgadas * 12)) / pulgadas) + " pulgadas");
		System.out.println("Son: " + (((pies * (pulgadas * 12)) / 100) / yardas) + " yardas");
	}

}
