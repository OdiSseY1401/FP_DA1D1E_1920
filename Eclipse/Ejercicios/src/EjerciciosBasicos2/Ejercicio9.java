package EjerciciosBasicos2;
import java.util.*;
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		int n1, n2;
		int cont=0;
		int acum=0;
		System.out.println("Dime el numero 1: ");
		n1=teclado.nextInt();
		System.out.println("Dime el numero 2: ");
		n2=teclado.nextInt();
		
		do {
			cont++;
			acum=acum+n1;
		} while (cont<n2);
		System.out.println("El resultado de la multiplicación: " +acum);
		
		/*
		 * for(int i=1;i<=n1;i++){
		 * acum=acum+n2;
		 * System.out.print(n2 + (i!=n1?"+":""))}
		 * System.out.println("El producto de "+n1+"*"+n2+" es "+sumna);
		 */
	}

}
