package EjerciciosClases;
import java.util.*;
public class Ejercicio4_MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Ejercicio4 cor1 = new Ejercicio4();
		darCoordenadas(teclado, cor1);
		System.out.println(cor1);
	}
	
	public static void darCoordenadas(Scanner teclado, Ejercicio4 cor1) {
		System.out.println("Dame la coordenada x:");
		cor1.ponX(teclado.nextInt());
		System.out.println("Dame la coordenada y:");
		cor1.ponY(teclado.nextInt());
	}
	
}
