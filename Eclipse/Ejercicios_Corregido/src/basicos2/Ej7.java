package basicos2;

public class Ej7 {
 public static void main(String[] args) {
	int suma=0;
	final int LInf = 10, LSup = 50;
	
	for(int i=LInf; i <= LSup; i++)
	   if(i%2==0)
		 suma=suma+i;
	
	System.out.println("La suma es "+suma);		  
			
	/* OTRA FORMA DE EXPRESARLO
	 * for(int i=LInf;i<=LSup;i=i+2)
	 * 	 suma=suma+i;
	 */				

	}

}