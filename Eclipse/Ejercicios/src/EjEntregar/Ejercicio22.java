package EjEntregar;
import java.util.Scanner;
public class Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int bachi;
		
		System.out.println("¿Tienes el título de Bachillerato?: ");
		System.out.println("1 -> Sí // 2-> No");
		bachi = sc.nextInt();
		
		if ((bachi == 1)) {
			System.out.println("Puedes hacer el grado");
		}
		else{
			System.out.println("No puedes hacer el grado");
		}
		
		sc.close();
	}

}
