package Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Esto es el apartado a");
		a();
		System.out.println();
		
		System.out.println("Este es el apartado b");
		b();
		System.out.println();
		
		System.out.println("Este es el apartado c");
		c();
		System.out.println();
		}
	
	static void a () {
		int [] numero = new int [5];
		int [] numero2 = new int [5];
		for (int i=0; i<numero.length; i++) {
			numero[i]=3*i;
			System.out.print(numero[i] + " ");
		}
		System.out.println();
		for (int i=0; i<numero.length; i++) {
			numero2[i]=3*numero[i]-1;
			System.out.print(numero2[i] + " ");
		}
	}
	static void b () {
		int [] numero = new int [5];
		int n=0;
		for (int i=1; i<=numero.length; i++) {
			numero[n]=i-1;
			System.out.print(numero[n] + " ");
		}
		System.out.println();
	}
	static void c () {
		boolean [] booleano = new boolean [5];
		booleano[0] = true;
		for (int i=1; i<booleano.length; i++) {
			if (booleano[i-1] == true) {
				booleano[i]=false;	
			}
			else {
				booleano[i]=true;
			}
			System.out.print(booleano[i] + " " + "/" + " ");
		}
	}
}
