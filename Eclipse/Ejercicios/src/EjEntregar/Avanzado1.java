package EjEntregar;
import java.util.Scanner;
public class Avanzado1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int hora1, hora2, min1, min2, total1, total2;
		
		System.out.println("Dime las horas en formato 24: ");
		hora1 = sc.nextInt();
		System.out.println("Dime los minutos: ");
		min1 = sc.nextInt();
		System.out.println("Dime las horas en formato 24: ");
		hora2 = sc.nextInt();
		System.out.println("Dime los minutos: ");
		min2 = sc.nextInt();
		total1=(hora1 * 60 +min1);
		total2=(hora2 * 60 +min2);
		if (total1 > total2) {
			System.out.println("Esta es la diferencia: " + (hora1 - hora2) + "h y " + (min1 -min2) + "min");
		}
		else {
			System.out.println("Esta es la diferencia: " + (hora2 - hora2) + "h y " + (min2 -min1) + "min");
		}
		sc.close();
	}

}
