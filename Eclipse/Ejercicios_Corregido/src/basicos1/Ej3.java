package basicos1;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double pies,yardas,pulgadas,cm,metros;
		
		System.out.println("Introducir el numero de pies ");
		pies=teclado.nextDouble();
		
		// Un pie tiene 12 pulgadas
		pulgadas=pies*12;
		
		// Una pulgada son 2.54 cm
		cm=2.54*pulgadas;
		
		// 1 metro tiene 100 cm
		metros=cm/100;
		
		//Una yarda son 0.9144 cm
		yardas=cm*0.9144;
		
		System.out.println(pies+ " pies equivale a "+pulgadas+" pulgadas "+yardas+" yardas "+cm+" cm y "+metros+" metros");
		
		teclado.close();
	}
}
