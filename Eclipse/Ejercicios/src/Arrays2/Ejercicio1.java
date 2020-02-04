package Arrays2;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=101;
		int [] enteros = new int [N];
		rellenarArray(enteros);
		escribirInverso(enteros);
	}
	public static void rellenarArray(int[] enteros){
		for (int i = 0; i < enteros.length; i++) {
			enteros[i]=i;
		}
	}
	public static void escribirInverso(int[] enteros){
		for(int contador=enteros.length-1; contador>=1; contador--)
			System.out.println(enteros[contador]);
	}
}
