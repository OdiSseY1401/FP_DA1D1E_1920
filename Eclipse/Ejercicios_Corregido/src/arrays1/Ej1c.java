package arrays1;

public class Ej1c {
	public static void main(String[] args) {
		int[] C= new int[4];
	       int y;
	    for (int i=C.length-1; i>=0; i--)  
	           C[i] = i/2; 
	    y = C[0]+C[1]+C[2]+C[3];
	    
	    System.out.println("y " + y);
	    for (int i = 0; i < C.length; i++)		
			System.out.println("C[" + i + "]" + C[i]);
	}
	
}
