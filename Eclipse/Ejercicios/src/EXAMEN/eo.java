package EXAMEN;

public class eo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] C= new int[4];
	       int y;
	       for (int i=C.length-1; i>=0; i--) {
	           C[i] = i/2; 
	           System.out.println("c " + C[i]);
	       }
	       y = C[0]+C[1]+C[2]+C[3]; 
			System.out.println(y);
	}

}
