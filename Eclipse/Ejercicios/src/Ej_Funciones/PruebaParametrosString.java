package Ej_Funciones;

public class PruebaParametrosString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "hola";
		
		System.out.println(frase);
		
		cambia(frase);
		
		System.out.println(frase);
		
		frase = cambiaReturn(frase);
		
		System.out.println(frase);
	}
	public static void cambia (String frase) {
		frase = "adios";
	}
	public static String cambiaReturn(String frase) {
		frase = "adios";
		return frase;
}
}
