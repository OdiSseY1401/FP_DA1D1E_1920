package basicos1;

import java.util.Scanner;
public class Ej2_printf{
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double l,g;
		System.out.println("Introducir el numero de galones ");
		g=teclado.nextDouble();
		l=3.7854*g;
			
		System.out.printf(" %.2f galones equivalen a %n %.2f litros ", g , l);
		
		teclado.close();
	}
}