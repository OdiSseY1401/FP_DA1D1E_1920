package EjEntregar;
import java.util.Scanner;
public class Ejercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int top, num=0, acum=0;
		System.out.println("Dime hasta donde quieres calcular: ");
		top = sc.nextInt();
		
		while (num < top) { //se pone < porque busca igualarlo, entonces al iniciar en 0, haria 1+2+3(no queremos eso)
			num++;
			acum = (acum + num);
		}
		System.out.println("La suma de todos los numeros es: " + acum);
		sc.close();
	}

}
