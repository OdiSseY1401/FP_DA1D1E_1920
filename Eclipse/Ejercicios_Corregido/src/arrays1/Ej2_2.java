package arrays1;

import java.util.Scanner;

// En esta versión, los arrays los creamos dentro de los métodos y devolvemos su dirección para
// que sean apuntados por las variables creadas en el main
public class Ej2_2 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce el tamaño del array ");
		int tam=teclado.nextInt();
		int[] array_a, array_b;
		
		array_a = crear_a(tam);
        escribir(array_a);
        System.out.println();
        
        array_b =crear_b(tam);
        escribir(array_b);
        System.out.println();
        
        boolean[] array_c;
        array_c = crear_c(tam);
        escribir(array_c);
        
        teclado.close();
	}
	
	 /*  Un procedimiento que recibe el tamaño de un array
	 *  y devuelve un array de enteros con ese tamaño y le asigna 
	 *  a cada componente los valores 0,3,6,..,3*n
     *   donde n es la longitud del array.  
     */
    static int [] crear_a(int n){
    	int [] a = new int[n];
    	
    	for(int i=0; i<a.length; i++){
    		a[i]=i*3;
    	}
    	
    	return a;
    }
    
    /*  Un procedimiento que recibe el tamaño de un array
   	 *  y devuelve un array de enteros con ese tamaño y le asigna  
     *  a cada componente  los valores n-1, n-2, ..., 2, 1, 0
     *  donde n es la longitud del array.
     */
    static int[] crear_b( int n){  	
    	int [] a = new int[n];
    	
    	for(int i=0; i<a.length; i++){
    		a[i]=--n;
    	}
    	
    	return a;	
    }
    /*  Un procedimiento que recibe el tamaño de un array
   	 *  y devuelve un array de booleanos con ese tamaño y le asigna  
     *  a cada componente alternativamente los valores true y false.
     */
    static boolean[] crear_c(int n){  	
    	boolean [] a = new boolean[n];
    	
    	for(int i=0; i<a.length; i++){
    		if (i%2==0)	a[i]=true;
    		else a[i]=false;
    	}
    	return a;
    }
    
    static void escribir(int[] a){
    	for(int i=0;i<a.length;i++){
    		System.out.print(a[i]+" ");
    		
    	}
    }
    static void escribir(boolean[] a){
    	for(int i=0;i<a.length;i++){
    		System.out.print(a[i]+" ");
    		
    	}
    }
    
}
