package explicacion;

import java.util.Scanner;

public class EjercicioOperaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int N1;
		int N2;
		String op; 
		System.out.println("Dime un número: ");
		N1= Integer.parseInt(sc.nextLine());
		System.out.println("Dime otro número: ");
		N2 = Integer.parseInt(sc.nextLine());
		System.out.println("¿Qué operación quieres hacer?: ");
		op = sc.nextLine();
		Operacion(N1, N2, op);
		sc.close();
	}
	public static void Operacion (int Num1, int Num2, String ope) {
		int sol;
		if (ope.equals("+")) {
			sol= Num1 + Num2;
			System.out.println(sol);
		}
		else if (ope.equals("-")) {
			sol= Num1 - Num2;
			System.out.println(sol);
		}
		else if (ope.equals("*")) {
			sol= Num1 * Num2;
			System.out.println(sol);
		}
		else if (ope.equals("/")) {
			sol= Num1 / Num2;
			System.out.println(sol);
		}
		
	}
}
