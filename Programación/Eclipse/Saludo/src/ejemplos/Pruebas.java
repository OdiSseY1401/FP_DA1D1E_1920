package ejemplos;

public class Pruebas {
	public static void main(String[] args) {
		String cadena = "Hola a todos";
		
		char unaLetra, letra = 'p';
		
		System.out.println("Contenido de cadena es: " + cadena);
		
		System.out.println("longitud de la cadena es: " + cadena.length());
		
		System.out.println("En la posici�n 0: " + cadena.charAt(0));
		System.out.println("En la posici�n ultima: " + cadena.charAt(cadena.length()-1));

		
		unaLetra = cadena.charAt(1);
	
		System.out.println("En la posici�n 1: " + unaLetra);
		
		System.out.println("Conetnido de  letra es: " + letra);
	}

}
