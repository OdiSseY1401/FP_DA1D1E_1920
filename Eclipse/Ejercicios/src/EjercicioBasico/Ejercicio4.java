package EjercicioBasico;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int anio;
		
		System.out.println("Dime un año: ");
		anio = sc.nextInt();
		
		if (( anio % 400 == 0) ||(anio % 4 == 0) && (anio % 100 != 0)) {
			System.out.println(anio + " es un año bisiesto");
		}
		else{
			System.out.println(anio + " no es un año bisiesto");
		}
	}

}
