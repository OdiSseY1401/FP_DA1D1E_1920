package EjerciciosClases;
import java.util.*;
public class Ejercicio3_MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Ejercicio3 c1 = new Ejercicio3();
		SoloRadio(teclado, c1);
		System.out.println();
		ConTodo(teclado, c1);
		teclado.close();
	}
	
	public static void SoloRadio(Scanner teclado, Ejercicio3 c1){
		System.out.println("1.Ejercicio solo poniendo el radio de la circunferencia");
		System.out.println("Dime el radio de la circunferencia");
		c1.ponRadio(teclado.nextDouble());
		System.out.println(c1);
	}
	public static void ConTodo(Scanner teclado, Ejercicio3 c1){
		System.out.println("2.Ejercicio solo poniendo las cordenadas y el radio de la circunferencia");
		System.out.println("Dime la cordenada X");
		c1.ponX(teclado.nextDouble());
		System.out.println("Dime la cordenada Y");
		c1.ponY(teclado.nextDouble());
		System.out.println("Dime el radio de la circunferencia");
		c1.ponRadio(teclado.nextDouble());
		System.out.println(c1);
	}
	
}
