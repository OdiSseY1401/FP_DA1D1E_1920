package EjEntregar;
import java.util.Scanner;
public class Ejercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Dime un n�mero entero: ");
		numero = sc.nextInt();
		
		if ((numero % 2 == 0)) {
			System.out.println("Tu n�mero es par.");
		}
		else{
			System.out.println("Tu n�mero es impar");
		}
		
		sc.close();
	}

}
