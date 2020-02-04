package Pruebas;

import java.text.DecimalFormat;

public class Tipos {
	
	public static void main(String args[]) { 
		
		// En java un numero entero, por defecto es int
		System.out.println(2147483647 * 2 ); 
		System.out.println(2147483647L * 2 );
		
		// 2147483647 es el valor mas grande que se puede almacenar en una variable de tipo int, 4 bytes
		// es representacion con signo. En el primer caso se desborda.
		int x = 2147483647;
		
		System.out.println("1.- x " + x * 2 ); 
		
		x = x * 2;
		
		System.out.println("2.- x " + x);
		
		long y = 2147483647;
		
		System.out.println("1.- y " + y * 2 ); 

		y = y * 2;
		
		System.out.println("2.- y " + y);
		
		// Representacion en hexadecimal:
		System.out.println("Hexadecimal " + 0x11C);
		// Representacion en octal:
		System.out.println("Octal " + 025);
		
		int numOctal = 025;
		System.out.println("Octal (variable)" + numOctal);
		
		//Representacion cientifica:
		System.out.println(7.433e6);
		
		// En java un numero real, por defecto es double
		System.out.println(21843.83F); // Se almacena usando 32 bits
		System.out.println(21843.83);  // Se almacena usando 64 bits
		
		//float f = 3.14; error!!!
		
		float f = (float)3.14;
		System.out.println("Float cast " + f );
		
		f = 3.14F;
		f = 3.14f;
		System.out.println("Float F/f " + f);
		
		double v1 = 300000.0;  // notacion normal
		System.out.println(v1);
		double v2 = 3.0e+5;     // notacion cientifica
		System.out.println(v2);
		v2 = 3e+5;     // notacion cientifica
		System.out.println(v2);
		
		//Caracteres especiales
		char arroba = '\u0040';
		System.out.println(arroba);
		
		System.out.println((char)('A' + 1)); // valor de 'A' es 65 en UNICODE -> B
		System.out.println('A' + 1); // valor de 'A' es 65 en UNICODE -> 66
		System.out.println("'A'" + 1); // valor de 'A' es 65 en UNICODE
		
		char A = '\u0041';
		System.out.println("'A' " + A);
		
		// Uso de constantes
		final double PI = 3.1415926536;
		float radio = 20.3f;
		System.out.println("Longitud circunferencia = " + 2*PI*radio);
		
		// Una forma de formatear:
		double z=25.324178787878787878645454;
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(df.format(z));
	 
	} 
}