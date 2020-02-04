package cadenas;

import java.util.Scanner;

public class NumeroCapicua_2
{
	public static void main(String[] args)
	{
		Integer num;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce numero:");
		num = teclado.nextInt();
		
		teclado.close();
		
		if (esCapicua(num))
			System.out.println("Es capicua");
		else
			System.out.println("No es capicua");
		
		if (esCapicua2(num))
			System.out.println("Es capicua");
		else
			System.out.println("No es capicua");
		
		if (esCapicua3(num))
			System.out.println("Es capicua");
		else
			System.out.println("No es capicua");
	}


	public static boolean esCapicua(int n) {
		
		String strNumero = Integer.toString(n);
		boolean esCapicua = true;
		int longitud = strNumero.length();
		
		for(int i=0; i<longitud/2 && esCapicua; i++)
		{
			if(strNumero.charAt(i) != strNumero.charAt(longitud-1-i))
				esCapicua = false;
		}
		
		return esCapicua;
	}
	
// Otra forma sería usar la clase StringBuilder StringBuffer que tiene un método que da la vuelta a la cadena parámetro
public static boolean esCapicua2(int n) {
	String cadena = Integer.toString(n);
    StringBuilder sb = new StringBuilder(cadena);
    String reverse = sb.reverse().toString();
    
    return cadena.equalsIgnoreCase(reverse);
	}

//Otra forma sería usar la clase StringBuilder StringBuffer que tiene un método que da la vuelta a la cadena parámetro
public static boolean esCapicua3(int n) {
		
		String cadena = Integer.toString(n);
	    StringBuffer sb = new StringBuffer(cadena);
	    String reverse = sb.reverse().toString();
	    
	    return cadena.equalsIgnoreCase(reverse);
	        	
	}
}
