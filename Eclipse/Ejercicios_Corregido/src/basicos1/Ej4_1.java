package basicos1;
import java.util.Scanner;
import java.util.GregorianCalendar;

public class Ej4_1{
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int anio;
		
		System.out.println("Introducir el anio ");
		anio=teclado.nextInt();
		
		if ((anio%4==0 && anio%100!=0) || anio%400==0)
		  System.out.println("El anio "+anio+" es bisiesto");
		else
		  System.out.println("El anio "+anio+" no es bisiesto");
		
		// Haciendo uso de la clase GregorianCalendar:
		GregorianCalendar calendar = new GregorianCalendar();
	     
	    if (calendar.isLeapYear(anio))
	    	System.out.println("El año es bisiesto");
	    else
	    	System.out.println("El año no es bisiesto");
		teclado.close();
	}
}

