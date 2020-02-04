package cadenas;
import java.util.Scanner;

public class SubStringMayus_6{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String cadena, subcadena;
		
		System.out.println("Introduzca la cadena en la que buscar");
		cadena = scan.nextLine();
		System.out.println("Introduzca la subcadena a buscar");
		subcadena = scan.nextLine();

		System.out.println(ponerMayuscula(cadena, subcadena ));
		scan.close();
	}

	public static String ponerMayuscula(String cad, String subCad) {
	String subcadenaUpper;

		subcadenaUpper = subCad.toUpperCase();
		return cad.replace(subCad, subcadenaUpper);
	}
}