package basicos2;
public class Ej1 {
	public static void main(String[] args){
		int suma=0,cont=1;
		final int MAX = 1800;
		
		for(int i=2;i<=MAX;){
			suma=suma+i;
			System.out.print(i+" ");
			if(cont%2==0)
			  i=i+2;
			else 
			  i=i+3;
			cont++;
		}
		
		System.out.println("\nLa suma de la serie es "+suma);
	}

}