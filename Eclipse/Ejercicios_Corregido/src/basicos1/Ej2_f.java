package basicos1;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Ej2_f{
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double l,g;
		System.out.println("Introducir el numero de galones ");
		g=teclado.nextDouble();
		l=3.7854*g;
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println(g+ " galones equivalen a "+df.format(l)+" litros");
		teclado.close();
	}
}