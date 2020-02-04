package EjerciciosBasicos4;
import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int horas, salario=15,horas_obli=35;
		double salario_ex=22, salario_fin1;
		String rep="Si";
		System.out.println("Dime las horas que trabajas: ");
		horas = teclado.nextInt();
		do {
		if (horas > 35) {
			System.out.println("Tienes que cobrar 22€ por cada hora extra");
			horas=horas-horas_obli;
			salario_fin1=525+(horas*salario_ex);
			System.out.println("Tu sueldo es: " + salario_fin1);
		}
		else {
			salario_fin1=horas*salario;
			System.out.println("Tu salario es de: " + salario_fin1);
		}
		
		System.out.println("¿Quieres calcular otro salario? Si/No");
		rep = teclado.nextLine();
		
	} while  (rep.compareTo("Si")==0);
	}
}
