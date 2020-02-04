package Arrays2;
import java.util.*;

import javax.swing.JOptionPane;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner(System.in);
		final int N=10, MAX=100, MIN=1;
		int [] aleatorio = new int[N];
		int posicion, valor;
		rellenarNumeroAleatorio(aleatorio, MAX, MIN);
		posicion=leerPosicion(tec);
		JOptionPane.showMessageDialog("En la posición" + posicion + " hay un valor de: " + valor);
	}
	public static void rellenarNumeroAleatorio(int[] lista, int a, int b){
		for (int i = 0; i < lista.length; i++) {
			lista[i]=(int)(Math.random()*(b-a+1)+a);	
		}
	}
	public static int leerPosicion(Scanner teclado) {
		int pos;
		
	}
}
