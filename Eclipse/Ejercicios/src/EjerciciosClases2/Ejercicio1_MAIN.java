package EjerciciosClases2;
import java.util.*;
public class Ejercicio1_MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner(System.in);
		Ejercicio1 l1= new Ejercicio1();
		
		System.out.println("Dime el titulo del libro");
		l1.setTitulo(tec.nextLine());
		System.out.println("DIme el autor del libro");
		l1.setAutor(tec.nextLine());
		System.out.println("Dime los ejemplares totales del libro: ");
		l1.setEjemplares(Integer.parseInt(tec.nextLine()));
		l1.prestamo();
		l1.devolucion();
		System.out.println(l1);
	}

}
