package explicacion;
import java.util.*;
public class Arrays {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 
		int i, valor; 
		int [] a = new int[10]; 
		System.out.print("Posición: "); 
		i = teclado.nextInt(); 
		System.out.print("Valor: "); 
		valor = teclado.nextInt(); 
		if (i>=0 && i < a.length) 
		a[i] = valor;

		
		/*
		double[] notas = {2.3, 8.5, 3.2, 9.5, 4, 5.5, 7.0}; 
		for (int i = 0; i< notas.length; i++) 
		System.out.print(notas[i] + " ");
*/
	}

}
