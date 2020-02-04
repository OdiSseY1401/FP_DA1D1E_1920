package arrays1;

public class Ej1a {

	public static void main(String[] args) {
		double[] A= new double[3];
		double x;
		for (int i=0; i<A.length; i++) 
			A[i] = i*3;
		
		x=A[0]+A[1]+A[2];  
		System.out.println("Suma de los 3 valores del array " + x);

	}

}
