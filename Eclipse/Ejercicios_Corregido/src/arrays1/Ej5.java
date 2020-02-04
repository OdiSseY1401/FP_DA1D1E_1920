package arrays1;

import java.util.Scanner;

public class Ej5 {
final static int TAM=10;
	
	public static void main(String[] args) {
		int[] array=new int[TAM];
		Scanner teclado=new Scanner(System.in);
		
		rellenar(array);
		rellenar(array, teclado);
        escribir(array);
        System.out.println();
        System.out.println("La media de los numeros en posicion par es "+mediaPar(array));
        
        teclado.close();
   	}
    
	
	static void rellenar(int[] a){
    	//
    	for(int i=0;i<a.length;i++){
    		/*System.out.println("Introducir valor de la componente "+i);
    		a[i]=teclado.nextInt();*/
    		a[i]=(int)(Math.random()*101);
    		
    	}
    	
    }
	
	
	static void rellenar(int[] a, Scanner sc){
    	for(int i=0;i<a.length;i++){
    		System.out.println("Introducir valor de la componente "+i);
    		a[i]=sc.nextInt();		
    	}
    }
	
	
    static void escribir(int[] a){
    	for(int i=0;i<a.length;i++)
    		System.out.print(a[i]+" ");
    }
    
    
    static double mediaPar(int[] a){
    	int suma=0,cont=0;
    	double media=0;
    	for(int i=0;i<a.length;i++){
    		if(i%2==0){// Ojo, que lo que es par es la posicion, no el contenido
    		  suma=suma+a[i];
    		  cont++;
    		}
    	}
    	
    	media=(double)suma/cont;
    	return media;
    }
 }
