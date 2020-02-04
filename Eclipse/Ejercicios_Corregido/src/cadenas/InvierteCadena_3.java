package cadenas;
import java.util.Scanner;

public class InvierteCadena_3{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String original;
		//String original = new String();
		
		System.out.println("Introduzca la cadena");
		original = scan.nextLine();

		System.out.println("Cadena invertida: " + invierte(original));
		System.out.println("Cadena invertida: " + invierte2(original));
		System.out.println("Cadena invertida: " + invierte3(original));
	
		scan.close();
	}
	
	public static String invierte(String cadena) {
	String invertida = new String();
	int posicion;
	char caracter;
	
		posicion = cadena.length() - 1;
		while (posicion >= 0) {
			caracter = cadena.charAt(posicion);
			invertida = invertida + caracter;
			posicion--;
		}
		
		return invertida;
	}

	public static String invierte2(String cadena) {
	String invertida = new String();
	//int posicion;
	
		//posicion = cadena.length() - 1;
		//while (posicion >= 0)
			//invertida = invertida + cadena.charAt(posicion--);
		
		for (int x=cadena.length()-1;x>=0;x--)
			invertida += cadena.charAt(x);
			
		
		return invertida;

	}
	
	public static String invierte3(String cadena) {
		StringBuilder builder=new StringBuilder(cadena);

		//Ejecutamos el .reverse() del StringBuffer y convertirmos el StringBuffer en una cadena mediante el m�todo .toString()

		return builder.reverse().toString();
	}
}