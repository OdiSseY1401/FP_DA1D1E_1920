package EJ_Funciones2;
import java.util.*;
public class Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		long num;
		System.out.println("1.Volteo");
		System.out.println("Dime un número que quieres que le dé la vuelta:");
		num = teclado.nextLong();
		System.out.println(voltea(num));
		System.out.println("");
		
		System.out.println("2.Es capicua");
		System.out.println("Dime un número que quieras que te diga si es capicua o no: ");
		num = teclado.nextLong();
		System.out.println(esCapicua(num));
		System.out.println("");
		
		System.out.println("3.Digitos");
		System.out.println("Dime un número y te diré cuántos digitos tiene: ");
		num = teclado.nextLong();
		System.out.println("Tiene " + digitos(num) + " digitos");
		System.out.println("");
		
		System.out.println("4.El dígito de la posiciónn");
		long cifras;
		System.out.println("Dime un número: ");
		num = teclado.nextLong();
		System.out.println("Dime una posición y te diré que cifra del número es: ");
		cifras = teclado.nextInt();
		System.out.println("La cifra de esa posición es " + digitoN(num, cifras));
		System.out.println("");
		
		System.out.println("5.Posición del dígito");
		System.out.println("Dime un número: ");
		num = teclado.nextLong();
		System.out.println("Dime una cifra y te diré en que posición del número está:"); 
		cifras = teclado.nextInt();
		System.out.println("Está en la posición " + posicionDeDigito(num, cifras));
		System.out.println("");
		
		System.out.println("6.Quitar cifras por detrás");
		System.out.println("Dime un número: ");
		num = teclado.nextLong();
		System.out.println("Dime la cantidad de cifras que quieres que le quitemos al número:"); 
		cifras = teclado.nextInt();
		System.out.println("El número ahora es " + quitaPorDetras(num, cifras));
		System.out.println("");
		
		System.out.println("7.Quitar cifras por delante");
		System.out.println("Dime un número: ");
		num = teclado.nextLong();
		System.out.println("Dime la cantidad de cifras que quieres que le quitemos al número:"); 
		cifras = teclado.nextInt();
		System.out.println("El número ahora es " + quitaPorDelante(num, cifras));
		System.out.println("");
		
		System.out.println("8.Añadir un número por detrás");
		System.out.println("Dime un número: ");
		num = teclado.nextLong();
		System.out.println("¿Qué número quieres añadir por detras?:"); 
		cifras = teclado.nextInt();
		System.out.println("El número ahora es " + añadirPorDetras(num, cifras));
		System.out.println("");
		
		System.out.println("9.Añadir un número por delante");
		System.out.println("Dime un número: ");
		num = teclado.nextLong();
		System.out.println("¿Qué número quieres añadir por delante?:"); 
		cifras = teclado.nextInt();
		System.out.println("El número ahora es " + añadirPorDelante(num, cifras));
		System.out.println("");
		
		System.out.println("10.Trozo de un número:");
		System.out.println("Dime un número: ");
		num = teclado.nextLong();
		System.out.println("El número ahora es " + trozoDeNumero(num));
		System.out.println("");
		
		System.out.println("11.Pegar números:");
		System.out.println("Dime un número: ");
		num = teclado.nextLong();
		System.out.println("¿Qué número quieres juntar?:"); 
		cifras = teclado.nextInt();
		System.out.println("El número ahora es " + juntaNumeros(num, cifras));
		System.out.println("");
	}

	public static long voltea(long n) {
		long resto, invertido=0;
		while(n> 0) {
			resto = n%10;
			invertido = invertido*10 + resto;
			n/=10;
		}
		return invertido;
	}
	
	public static boolean esCapicua (long n) {
		long aux=n, inverso=0, cifra;
		boolean capi=true;
		while(aux != 0) {
			cifra = aux%10;
			inverso=inverso*10+cifra;
			aux/=10;
		}
		if(n == inverso) {
			return capi;
		}
		else {
			capi=false;
			return capi;
		}
	}
	
	public static long digitos (long n) {
		long cifras=0;
		while(n!=0) {
			n/=10;
			cifras++;
		}
		return cifras;
	}
	
	public static long digitoN (long n, long cif) {
		long resto=0;
		int cont=0;
		n=voltea(n);
		while (cont < cif) {
			resto=n%10;
			n=n/10;
			cont++;
		}
		return resto;
	}
	
	public static long posicionDeDigito (long n, long cif) {
		long resto=0;
		int cont=0;
		n=voltea(n);
		while (resto != cif) {
			resto=n%10;
			n=n/10;
			cont++;
		}
		return cont;
	}
	
	public static long quitaPorDetras (long n, long cif) {
		long resto=0;
		int cont=0;
		while (cont < cif) {
			resto=n%10;
			n=n/10;
			cont++;
		}
		return n;
	}
	
	public static long quitaPorDelante (long n, long cif) {
		long resto=0;
		int cont=0;
		n=voltea(n);
		while (cont < cif) {
			resto=n%10;
			n=n/10;
			cont++;
		}
		n=voltea(n);
		return n;
	}
	
	public static long añadirPorDetras (long n, long cif) {
		long resto=0;
		cif=voltea(cif);
		while (cif!=0) {
			resto=cif%10;
			cif=cif/10;
			n=n*10+resto;
		}
		return n;
	}
	
	public static long añadirPorDelante (long n, long cif) {
		long resto=0;
		n=voltea(n);
		while (cif!=0) {
			resto=cif%10;
			cif=cif/10;
			n=n*10+resto;
		}
		n=voltea(n);
		return n;
	}
	
	public static long trozoDeNumero (long n) {
		long resto=0;
		n=voltea(n);
		resto=n%10;
		n=n/10;
		n=voltea(n);
		resto=resto*10+n%10;
		return resto;
	}
	
	public static long juntaNumeros (long n, long cif) {
		long resto=0;
		cif=voltea(cif);
		while (cif!=0) {
			resto=cif%10;
			cif=cif/10;
			n=n*10+resto;
		}
		return n;
	}
}