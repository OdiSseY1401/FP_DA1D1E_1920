package basicos1;

import java.util.Scanner;
import java.util.GregorianCalendar;

public class Ej4_2 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int anio;
		
		do {
			System.out.println("Introducir el anio (-1 para terminar)");
			anio=teclado.nextInt();
			
			System.out.println("FORMA 1\n\n");
			if (anio%4==0 && anio%100 != 0)
				  System.out.println("El anio "+anio+" es bisiesto");
			else if (anio%400 == 0)
				  System.out.println("El anio "+anio+" es bisiesto");
			else 
				System.out.println("El anio "+anio+" no es bisiesto");
			System.out.println("FORMA 2\n\n");
			if (anio%4==0 && ( anio%100!=0 || anio%400==0 ))
			  System.out.println("El anio "+anio+" es bisiesto");
			else
			  System.out.println("El anio "+anio+" no es bisiesto");
			
			System.out.println("FORMA 3\n\n");
			// Haciendo uso de la clase GregorianCalendar:
			GregorianCalendar calendar = new GregorianCalendar();
		     
		    if (calendar.isLeapYear(anio))
		    	System.out.println("El anio "+anio+" es bisiesto");
		    else
		    	System.out.println("El anio "+anio+" no es bisiesto");
		} while (anio >= 0);
		
		teclado.close();
	}
}

