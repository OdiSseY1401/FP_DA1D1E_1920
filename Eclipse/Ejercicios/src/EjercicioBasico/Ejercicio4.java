package EjercicioBasico;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int anio;
		
		System.out.println("Dime un a�o: ");
		anio = sc.nextInt();
		
		if (( anio % 400 == 0) ||(anio % 4 == 0) && (anio % 100 != 0)) {
			System.out.println(anio + " es un a�o bisiesto");
		}
		else{
			System.out.println(anio + " no es un a�o bisiesto");
		}
	}

}
