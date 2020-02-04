package EjerciciosClases;
import java.util.*;
public class Ejercicio5_MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner(System.in);
		Ejercicio5 coche1 = new Ejercicio5();
		crearCoche(tec, coche1);
		System.out.println(coche1);
		System.out.println();
		cambiarColor(tec, coche1);
		System.out.println(coche1);
	}
	public static void crearCoche(Scanner tec, Ejercicio5 coche1) {
		System.out.println("¿De cuantas puertas quieres el coche?");
		coche1.ponPuertas(Integer.parseInt(tec.nextLine()));
		System.out.println("¿De que color quieres el coche?");
		coche1.ponColor(tec.nextLine());
		System.out.println("¿De que marca quieres el coche?");
		coche1.ponMarca(tec.nextLine());
		System.out.println("¿Qué matrícula quieres en el coche?");
		coche1.ponMatricula(tec.nextLine());
	}
	
	public static void cambiarColor(Scanner tec, Ejercicio5 coche1) {
		System.out.println("¿De que color quieres pintarlo?");
		coche1.PintaCoche(tec.nextLine());
	}
	
}
