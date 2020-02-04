package Pruebas;

public class Operadores {
	public static void main(String[] args) {
		int calculo, num1, num2;
		
		
		System.out.println("Esto devuelve un boleano");
		System.out.println("4 > 3 " + (4>3)); //Muestra true
		System.out.println("7 <= 2 " + (7 <= 2));
		System.out.println("5 + 2 == 4 + 3 " + (5 + 2 == 4 + 3));
		System.out.println("4 * 3 != 12 " + (4 * 3!=12));
		
		System.out.println("4 > 3 && 5 <= 5 " + (4 > 3 && 5<= 5) );
		System.out.println("4 > 3 && 5 != 5 " + (4 > 3 && 5 != 5));
		System.out.println("4 > 3 || 5 != 5 " + (4 > 3 || 5 != 5 ));
		System.out.println("4 > 3 && !(5 != 5)" + (4 > 3 && !(5 != 5))); 
		//La ! es un not, es decir da la vuelta al resultado
		
		//Operadores matematicos:
		calculo = 5;
		calculo += 6;
		System.out.println(calculo);
		
		calculo *=2;
		System.out.println(calculo);
		
		num1 =3;
		num2 = 7;
		num1 ++;
		System.out.println(num1);
		num2 --;
		System.out.println(num2);
	}	

}
