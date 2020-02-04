package arrays1;
import java.util.Scanner;

public class Ej4 {
	final static int TAM=10;
	
	public static void main(String[] args) {
		int[] array=new int[TAM];
		Scanner sc = new Scanner(System.in);
        
		//rellenar(array);
		rellenar(array, sc);
        escribir(array);
        
        System.out.println();
        System.out.println("La media de los numeros positivos es " + mediaPos(array));
        System.out.println("La media de los numeros negativos es " + mediaNeg(array));
        
        sc.close();
	}
   
	
	static void rellenar(int[] a) {
    	for(int i=0;i<a.length;i++)   		
    		a[i]=(int)(Math.random()*101-50);   //genera entre -50 y 50	
    }
    
	
	static void rellenar(int[] a, Scanner teclado) {    	
    	for(int i=0;i<a.length;i++) {
    		System.out.println("Introducir valor de la componente "+i);
    		a[i]=teclado.nextInt();  		
    	}
    	
    }
	
    static void escribir(int[] a) {
    	for(int i=0;i<a.length;i++) 
    		System.out.print(a[i]+" ");    		
    }
    
    static double mediaPos(int[] a){
    	int suma=0,cont=0;
    	double media=0;
    	
    	for(int i=0;i<a.length;i++)
    		if(a[i]>=0){
    		  suma=suma+a[i];
    		  cont++;
    		}

    	if (cont==0)
    	  System.out.println("No hay numeros positivos en el array");
    	else
    		media=(double)suma/cont;
    	
    	return media;
    }
    
    static double mediaNeg(int[] a){
    	int suma=0,cont=0;
    	double media=0;
    	for(int i=0;i<a.length;i++)
    		if(a[i]<0){
    		  suma=suma+a[i];
    		  cont++;
    		}
    	
    	if (cont==0)
    	  System.out.println("No hay numeros negativos en el array");
    	else
    		media=(double)suma/cont;
    	return media;
    }
}

