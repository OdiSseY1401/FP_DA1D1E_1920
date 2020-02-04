package EjEntregar;
import java.util.Scanner;
public class Ejercicio28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int trabaj, horas, salario, x=0, horas_ex, horas_obli=40;
		double salario_ex, salario_fin1, salario_fin2, acum=0;
		
		System.out.println("Dime cuantos trabajadores hay: ");
		trabaj = sc.nextInt();
		
		System.out.println("Dime el salario/horas: ");
		salario = sc.nextInt();
		
		salario_ex = (salario * 1.5);
		
		while (x < trabaj) {
			System.out.println("Dime las horas que trabajas: ");
			horas = sc.nextInt();
			
			horas_ex = (horas - horas_obli);
			salario_fin1=((horas_ex * salario_ex) + (salario * horas_obli));
			salario_fin2=(salario * horas);
			
			if (horas > horas_obli) {
				System.out.println("Tienes que cobrar un 50% más, tu sueldo será: " + salario_fin1);
				acum=(salario_fin1 + acum);
				x=(x+1);
			}
			
			else {
				System.out.println("Tu sueldo será de: " + salario_fin2);
				acum=(salario_fin2 + acum);
				x=(x+1);
			}
			
			System.out.println(" ");
		}
		System.out.println("El salario total del grupo es: " + acum);
		sc.close();
	}

}
