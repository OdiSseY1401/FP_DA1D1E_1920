package Arrays;
import java.util.*;
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int N=10;
		Scanner teclado = new Scanner(System.in);
		double [] notas = new double [N];
		String [] alumnos = new String[N];
		String [] notasString= new String[N];
		for (int x = 0; x < notas.length; x++) {
			notas[x]=dameNumero(teclado);
			alumnos[x]=dameNombre(teclado);
			notasString[x]=resultadoNotas(notas[x]);
		}
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println(alumnos[i] + " ha sacado un " + notas[i] + " y tiene un " + notasString[i]);
		}
		
	}
	public static double dameNumero(Scanner tec) {
		double numero;
		do {
			System.out.println("Dime una nota entre 0 y 10: ");
			numero=Double.parseDouble(tec.nextLine()); //Pa que no se desborde el bufffffffffer
		} while (numero < 0 || numero > 10);
		return numero;
	}
	public static String dameNombre(Scanner tec) {
		String nombre;
		System.out.println("Dime el nombre del alumno: ");
		nombre=tec.nextLine();
		return nombre;
	}
	public static String resultadoNotas(double nota) {
		String resultado="";
		if (nota < 5) {
			resultado="Suspenso";
		}
		else if (nota < 7) {
			resultado="Bien";
		}
		else if (nota < 9) {
			resultado="Notable";
		}
		else {
			resultado="Sobresaliente";
		}
		return resultado;
	}
}
