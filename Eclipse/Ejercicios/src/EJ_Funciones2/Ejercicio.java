package EJ_Funciones2;
import java.util.*;
public class Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		long num;
		System.out.println("1.Volteo");
		System.out.println("Dime un n�mero que quieres que le d� la vuelta:");
		num = teclado.nextLong();
		System.out.println(voltea(num));
		System.out.println("");
		
		System.out.println("2.Es capicua");
		System.out.println("Dime un n�mero que quieras que te diga si es capicua o no: ");
		num = teclado.nextLong();
		System.out.println(esCapicua(num));
		System.out.println("");
		
		System.out.println("3.Digitos");
		System.out.println("Dime un n�mero y te dir� cu�ntos digitos tiene: ");
		num = teclado.nextLong();
		System.out.println("Tiene " + digitos(num) + " digitos");
		System.out.println("");
		
		System.out.println("4.El d�gito de la posici�nn");
		long cifras;
		System.out.println("Dime un n�mero: ");
		num = teclado.nextLong();
		System.out.println("Dime una posici�n y te dir� que cifra del n�mero es: ");
		cifras = teclado.nextInt();
		System.out.println("La cifra de esa posici�n es " + digitoN(num, cifras));
		System.out.println("");
		
		System.out.println("5.Posici�n del d�gito");
		System.out.println("Dime un n�mero: ");
		num = teclado.nextLong();
		System.out.println("Dime una cifra y te dir� en que posici�n del n�mero est�:"); 
		cifras = teclado.nextInt();
		System.out.println("Est� en la posici�n " + posicionDeDigito(num, cifras));
		System.out.println("");
		
		System.out.println("6.Quitar cifras por detr�s");
		System.out.println("Dime un n�mero: ");
		num = teclado.nextLong();
		System.out.println("Dime la cantidad de cifras que quieres que le quitemos al n�mero:"); 
		cifras = teclado.nextInt();
		System.out.println("El n�mero ahora es " + quitaPorDetras(num, cifras));
		System.out.println("");
		
		System.out.println("7.Quitar cifras por delante");
		System.out.println("Dime un n�mero: ");
		num = teclado.nextLong();
		System.out.println("Dime la cantidad de cifras que quieres que le quitemos al n�mero:"); 
		cifras = teclado.nextInt();
		System.out.println("El n�mero ahora es " + quitaPorDelante(num, cifras));
		System.out.println("");
		
		System.out.println("8.A�adir un n�mero por detr�s");
		System.out.println("Dime un n�mero: ");
		num = teclado.nextLong();
		System.out.println("�Qu� n�mero quieres a�adir por detras?:"); 
		cifras = teclado.nextInt();
		System.out.println("El n�mero ahora es " + a�adirPorDetras(num, cifras));
		System.out.println("");
		
		System.out.println("9.A�adir un n�mero por delante");
		System.out.println("Dime un n�mero: ");
		num = teclado.nextLong();
		System.out.println("�Qu� n�mero quieres a�adir por delante?:"); 
		cifras = teclado.nextInt();
		System.out.println("El n�mero ahora es " + a�adirPorDelante(num, cifras));
		System.out.println("");
		
		System.out.println("10.Trozo de un n�mero:");
		System.out.println("Dime un n�mero: ");
		num = teclado.nextLong();
		System.out.println("El n�mero ahora es " + trozoDeNumero(num));
		System.out.println("");
		
		System.out.println("11.Pegar n�meros:");
		System.out.println("Dime un n�mero: ");
		num = teclado.nextLong();
		System.out.println("�Qu� n�mero quieres juntar?:"); 
		cifras = teclado.nextInt();
		System.out.println("El n�mero ahora es " + juntaNumeros(num, cifras));
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
	
	public static long a�adirPorDetras (long n, long cif) {
		long resto=0;
		cif=voltea(cif);
		while (cif!=0) {
			resto=cif%10;
			cif=cif/10;
			n=n*10+resto;
		}
		return n;
	}
	
	public static long a�adirPorDelante (long n, long cif) {
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