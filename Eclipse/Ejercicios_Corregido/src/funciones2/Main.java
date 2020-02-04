package funciones2;
/*
Crea una biblioteca de funciones matemáticas que contenga las siguientes funciones. Recuerda que puedes usar unas dentro de otras si es necesario. Los números serán todos long. Todas las funciones devuelven al código llamante lo que se pide.

1.- voltea: Le da la vuelta a un número.

2.- esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.

3.- digitos: Cuenta el número de dígitos de un número.

4.- digitoN: Devuelve el dígito que está en la posición n de un número. Se empieza contando por el 0 y de izquierda a derecha.

5.- posicionDeDigito: Da la posición de la primera ocurrencia de un dígito dentro de un número. Si no se encuentra, devuelve -1.

6.- quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).

7.- quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda).

8.- pegaPorDetras: Añade un número a otro número por detrás.

9.- pegaPorDelante: Añade un número a otro número por delante.

10.- trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.

11.- juntaNumeros: Pega dos números para formar uno. Este es a efectos de apoyar pegaPorDetras y pegaPorDelante

*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("voltea \n");
		System.out.println(FMatematicas.voltea(1998));
		
		System.out.println(" \nesCapicua \n");
		System.out.println(FMatematicas.esCapicua(1998));
		System.out.println(FMatematicas.esCapicua(8991998));
		
		if (FMatematicas.esCapicua(1998))	
			System.out.println("Es capicua");
		else
			System.out.println("No es capicua");
		
		if (FMatematicas.esCapicua(8991998))	
			System.out.println("Es capicua");
		else
			System.out.println("No es capicua");
		
		System.out.println("\ndigitos \n");
		System.out.println(FMatematicas.digitos(8991998));
		
		System.out.println("\ndigitoN \n");
		System.out.println(FMatematicas.digitoN(8991998, 5));
		System.out.println(FMatematicas.digitoN(8991998, 5)+1);
		
		System.out.println("\nposicionDeDigito \n");
		System.out.println(FMatematicas.posicionDeDigito(8991998, 1));
		System.out.println(FMatematicas.posicionDeDigito(8991998, 1)+1);
		
		System.out.println("\nquitaPorDetras  \n");
		System.out.println(FMatematicas.quitaPorDetras(8991998, 3));
		
		System.out.println("\nquitaPorDelante  \n");
		System.out.println(FMatematicas.quitaPorDelante(8991998, 3));
		
		System.out.println("\npegaPorDetras  \n");
		System.out.println(FMatematicas.pegaPorDetras(1998, 345));
		
		System.out.println("\npegaPorDelante  \n");
		System.out.println(FMatematicas.pegaPorDelante(1998, 345));
				
		System.out.println("\ntrozoDeNumero  \n");
		System.out.println(FMatematicas.trozoDeNumero(8991998, 1, 3));	
		
		System.out.println("\npotencia  \n");
		System.out.println(FMatematicas.potencia(34, 0));
		System.out.println(FMatematicas.potencia(34, -1));
		System.out.println(FMatematicas.potencia(34, 2));
	}

}
