package cadenas;
import java.util.Scanner;

/*
 * Realiza un programa que lea 11 cadenas de caracteres, para mostrar la que contenga el
mayor numero de vocales, ya sean mayusculas o minusculas.
 */
public class MayorNumeroVocales_1
{
	public static void main(String[] args)
	{
		final int NUM = 5; //11
		int contVocales; // Contador de vocales de cada cadena
		int maxContVocales=0; // Maximo numero de vocales
		String mayorNumeroVocales="";
		String cadenaOriginal;
		
		Scanner teclado = new Scanner(System.in);
		for(int i=0; i<NUM; i++)
		{
			System.out.println("Introduce cadena " + (i+1) + ":");
			cadenaOriginal = teclado.nextLine();
			
			contVocales = numVocales(cadenaOriginal);
	
			if (contVocales > maxContVocales)
			{
				maxContVocales=contVocales;
				mayorNumeroVocales=cadenaOriginal;
			}
		}

		if(maxContVocales!=0)			
			System.out.println("La cadena con mas vocales introducida es\n" + mayorNumeroVocales + " tiene " + maxContVocales + " vocales.");
		else
			System.out.println("Ninguna cadena tenia vocales");
		
		teclado.close();
	}


	public static int numVocales(String cadenaOriginal) {
		String cadenaMinusculas;

		cadenaMinusculas = cadenaOriginal.toLowerCase();
		int nVoc = 0;
	
		for(int j=0; j<cadenaMinusculas.length(); j++) {
				switch(cadenaMinusculas.charAt(j))
				{
					case 'a':
					case 'á':
					case 'e':
					case 'é':
					case 'i':
					case 'í':
					case 'o':
					case 'ó':
					case 'u':
					case 'ú':
					case 'ü':
						nVoc++;
						break;
				}
		}
		
		return nVoc;
	}

}
