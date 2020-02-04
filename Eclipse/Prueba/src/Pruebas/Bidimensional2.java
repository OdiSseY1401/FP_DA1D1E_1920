package Pruebas;
import java.util.*;
public class Bidimensional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int FILAS = 5, COLUMNAS = 4;
		Scanner teclado = new Scanner(System.in);
		int[][] A = new int[FILAS][COLUMNAS];
		
		rellenarArray(teclado, A);
		System.out.println("----------------------------------------");
		valoresIntroducidos(A);
		System.out.println("----------------------------------------");
		mayorMenor(A);
	}
	
	public static void rellenarArray (Scanner teclado, int[][] array) {
		final int FILAS=5, COLUMNAS=4;
		System.out.println("Lectura de elementos de la matriz: ");
		for (int i = 0; i < FILAS ; i++)
			for (int j = 0; j < COLUMNAS; j++) {
				System.out.print("A[" + i + "][" + j + "]= ");
				array[i][j] = teclado.nextInt();
			}	
	}
	public static void valoresIntroducidos(int[][] array) {
		for (int i = 0; i< array.length ; i++) {
			for (int j = 0; j < array[i].length; j++) 
				System.out.print(array[i][j] + " ");
				System.out.println();
		}
	}
	public static void mayorMenor(int[][] array) {
		int mayor, menor, filMay, filMen, colMay, colMen;
		mayor = array[0][0];
		menor = array[0][0];
		filMay=filMen=colMay=colMen=0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > mayor) {
					mayor = array[i][j];
					filMay = i;
					colMay = j;
				} else if (array[i][j] < menor) {
					menor = array[i][j];
					filMen = i;
					colMen= j;
				}
			}
		}
		String cadena,SMayor,SMenor,SFilMen,SFilMay,SColMen,SColMay;
		System.out.print("Elemento mayor: " + mayor + "-");
		System.out.println(" Fila: "+ filMay + " Columna: " + colMay + "-");
		System.out.print("Elemento menor: " + menor + "-");
		System.out.println(" Fila: "+ filMen+ " Columna:" + colMen + "-");


	}
}
