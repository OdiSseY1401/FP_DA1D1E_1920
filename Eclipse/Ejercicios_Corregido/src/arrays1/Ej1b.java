package arrays1;

public class Ej1b {
	public static void main(String[] args) {
		int[] B = new int[5];
		B[4]=1;
		B[B[4]]=2;
		B[B[B[4]]]=0;
		B[B[B[B[4]]]]=3;
		B[B[B[B[B[4]]]]]=4;  
		
		for (int i = 0; i < B.length; i++)		
				System.out.println("B[" + i + "]" + B[i]);
	}
	
}
