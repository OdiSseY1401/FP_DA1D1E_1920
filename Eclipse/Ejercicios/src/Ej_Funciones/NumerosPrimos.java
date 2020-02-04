package Ej_Funciones;
import java.util.Scanner;
public class NumerosPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.println("Dime un número: ");
		num = teclado.nextInt();
		System.out.println("El numero "+ num + " " + Primo(num));
		
	}
	
	public static boolean Primo(int Num) {
		boolean primo = true;
		for (int i=2; i < Num && primo == true; i++)
			if ((Num % i) == 0) {
			primo = false;
			}
		return primo;
		
	}
}