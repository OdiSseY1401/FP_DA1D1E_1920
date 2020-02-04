package cadenas;
import java.util.Scanner;

public class CuentaCadena_5{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String cadena, subcadena;
		
		System.out.println("Introduzca la cadena en la que buscar");
		cadena = scan.nextLine();
		System.out.println("Introduzca la subcadena a buscar");
		subcadena = scan.nextLine();
		System.out.println();
			
		System.out.println("Aparece " + cuentaVeces(cadena, subcadena)+ " veces");
		System.out.println("Aparece " + cuentaVeces2(cadena, subcadena)+ " veces");
		
		scan.close();
	}


	public static int cuentaVeces(String cad, String subCad) {
	int posicion=0, apariciones=0;

		while (posicion>=0) {				
			posicion = cad.indexOf(subCad, posicion);			
			if (posicion >= 0){
				//posicion++;
				posicion += subCad.length();
				apariciones++;
			}
		}	
		
		return apariciones;
	}
	
	
	
	
	public static int cuentaVeces2(String cad, String subCad) {
		int pos=0, apariciones=0;
		int lenCad= cad.length();
		int lenSubCad = subCad.length();
		
		String obtenida = "";
		while (pos<=lenCad-lenSubCad) {				
			obtenida = cad.substring(pos, pos + lenSubCad);			
			if (obtenida.equals(subCad)){
					pos += lenSubCad;
					apariciones++;
			}
			else pos++;
		}	
			
		return apariciones;
	}
}