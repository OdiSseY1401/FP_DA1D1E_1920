package arrays1;
import java.util.*;

public class Ej2 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce el tamaño del array ");
		int tam=teclado.nextInt();
		int[] array=new int[tam];
		
        crear_a(array);
        escribir(array);
        System.out.println();
        crear_b(array);
        escribir(array);
        System.out.println();
        
        boolean[] arrayB=new boolean[tam];
        crear_c(arrayB);
        escribir(arrayB);
        teclado.close();
	}
	
	 /*  Un procedimiento que recibe un array de enteros y le asigna a cada componente los
     *  valores 0,3,6,..,3*n donde n es la longitud del array.  
     */
    static void crear_a(int[] a){  	
    	for(int i=0; i<a.length; i++){
    		a[i]=i*3;
    	}
    }
    
    /* Un procedimiento que recibe un array de enteros y le asigna a cada componente los valores 
     * n-1, n-2, ...,2,1,0 donde n es la longitud del array.
     */
    static void crear_b(int[] a){  	
    	int n = a.length;
    	for(int i=0; i<a.length; i++){
    		a[i]=--n;
    	}
    }
    /*Un procedimiento que recibe un array de valores booleanos y le asigna de manera intercalada
     *  los valores true y false.
     */
    static void crear_c(boolean[] a){  	
    
    	for(int i=0; i<a.length; i++){
    		if (i%2==0)	a[i]=true;
    		else a[i]=false;
    	}
    }
    static void escribir(int[] a){
    	for(int i=0;i<a.length;i++){
    		System.out.print(a[i]+" ");
    		
    	}
    }
    /* Java es capaz de "saber" cuál es el método que tiene que ejecutar por tipo y número de argumentos */
    static void escribir(boolean[] a){
    	for(int i=0;i<a.length;i++){
    		System.out.print(a[i]+" ");
    		
    	}
    }
    
}
