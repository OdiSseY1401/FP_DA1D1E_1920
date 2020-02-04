package EjEntregar;
import java.util.Scanner;
public class Ejercicio26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int top, num=0, acum=0, cont=1;
		System.out.println("Dime hasta donde quieres calcular: ");
		top = sc.nextInt();
 
		
		while (cont <= top) {
			num=(num + 2);
			acum = (acum + num);
			System.out.println("EEEEEEEEEEOOOOOOOOOOOOO: " + acum);
			cont++; //ponemos un contador para que se repita atntas veces como el numero de top
		}
		System.out.println("La suma de todos los numeros es: " + acum);
		sc.close();
	}

}
