package arrays1;
import java.util.*;


public class Ej3 {
	public static void main(String[] args) {		
		Scanner teclado=new Scanner(System.in);
		
		int [] array = creaYRellenaArray(teclado);
		
        escribir(array);
        System.out.println();
        System.out.println("Apdo a");
        System.out.println("El array tiene " + cuentaCeros(array) + " ceros.");
     
        System.out.println("Apdo b");
        System.out.println("La suma de los contenidos pares del array es " + sumaPares(array));
        
        System.out.println("Apdo c");
    	System.out.println("Introduce el número a contar sus repeticiones ");
		int numero = teclado.nextInt();
		System.out.println("El número de veces que se repite " + numero + " en el array es " + numRepeticiones(array, numero));
		
		System.out.println("Apdo d");
		System.out.println("Introduce el valor antiguo ");
		int i = teclado.nextInt();
		System.out.println("Introduce el valor nuevo ");
		int j = teclado.nextInt();
		sustituye(array, i, j);
		escribir(array);
		
		System.out.println("Apdo e-1: Intercambia contenidos.");
		System.out.println("Introduce 1º contenido a cambiar ");
		i = teclado.nextInt();
		System.out.println("Introduce 2º contenido a cambiar ");
		j = teclado.nextInt();
		intercambia1(array, i, j);
		escribir(array);
		
		System.out.println("Apdo e-2: Intercambia posiciones.");
		
		System.out.println("Introduce 1ª posición a cambiar ");
		i = teclado.nextInt();
		System.out.println("Introduce 2ª posición a cambiar ");
		j = teclado.nextInt();
		intercambia2(array, i, j);
		escribir(array);
		
		
		System.out.println("Apdo f");
        System.out.println();
		
		array = invierte2(array);
		escribir(array);
		invierte(array);		
		escribir(array);
		
		System.out.println("Apdo g");
		System.out.println();
		rotaDerecha(array);
		System.out.println();
		escribir(array);
    	System.out.println();
		int [] array2 = creaYRellenaArray(teclado);
		System.out.println("Apdo h");
		if (iguales(array, array2))
			System.out.println("Los arrays son iguales.");
		else
			System.out.println("Los arrays no son iguales.");
		
		teclado.close();
	}
	
    public static int[] creaYRellenaArray(Scanner sc){     			 	
		System.out.println("Introduce el tamaño del array ");
		int tam=sc.nextInt();
		int[] a = new int[tam];
		int num;
		
    	for(int i=0; i<a.length; i++){
    		System.out.println("Introduce el valor en la posición " + i);
    		num=sc.nextInt();
    		a[i]=num;
    	}
    
        return a;
    }
    
    /*  a - Un procedimiento que recibe un array de enteros y
     *  devuelve el número de ceros que se encuentran dentro del array. 
     */
    public static int cuentaCeros ( int arr[ ] ) {
    	int sumCeros = 0;
    	
    	for(int i=0; i<arr.length; i++){
    		if (arr[i] == 0) sumCeros++ ;
    	}
    	return sumCeros;
    }
    
    /* b - El método public int sumaPares ( int arr[ ] ) que recibe un array de enteros y devuelve
     *  el resultado de sumar solo los números pares que hay dentro del array. 
     */
    
    public static  int sumaPares ( int arr[ ] ) {
    	int sumPar = 0;
    	
    	for(int i=0; i<arr.length; i++){
    		if (arr[i]%2 == 0) sumPar += arr[i];
    	}
    	return sumPar;
    }
    /* c - El método public int cuentaRepeticiones ( int arr[ ], int x ) que recibe un array de enteros y un valor entero x.
     *  El método devuelve el número de veces que se repite el valor de x en el array.   
    */
     public static int numRepeticiones ( int arr[ ], int x ) {
    	int numR = 0;
    	
    	for(int i=0; i<arr.length; i++){
    		if (arr[i] == x) numR++;
    	}
    	
    	return numR;
    }
    
    /* d - El método public void sustituye (int arr[ ], int old, int new) que recibe un array de enteros y dos valores enteros
     *  old y new. El método debe reemplazar todos los valores old del array por el valor de new.  
     */
     public static void sustituye (int arr[ ], int viejo, int nuevo) {
    	
    	for(int i=0; i<arr.length; i++){
    		if (arr[i] == viejo) arr[i] = nuevo;
    	}
    	
    }
     
   /* e-1 - El método public void intercambia1(int arr[ ], int x, int y), que recibe un array de enteros y dos valores enteros
    *  que corresponden a dos componentes del array e intercambie los valores de las componentes del array.
    *  int x, int y suponemos son contenidos del array.
    */
     /* public static void intercambia1 (int arr[ ], int x, int y) {

	 	 for(int i=0; i<arr.length; i++){
	 	     if (arr[i] == x) arr[i]=y;
	 	     else if (arr[i] == y) arr[i]=x;   				     		
	 	 }
      		
     } 
     Si uno de los valores no está contenido en el array, no debe realizarse ningún cambio
     */
     
    public static void intercambia1 (int arr[ ], int x, int y) {
     	boolean existeX=false, existeY=false;
     	
     	for(int i=0; i<arr.length; i++){
     		if (arr[i] == x) existeX = true;    			
     		if (arr[i] == y) existeY = true;   
     	}
     	
     	if (existeX && existeY)
	     	for(int i=0; i<arr.length; i++){
	     		if (arr[i] == x) arr[i]=y;
	     		else if (arr[i] == y) arr[i]=x;   				     		
	     	}
     	else
     		System.out.println("No existen los dos contenidos en el array, no se produce intercambio.");
     	
     }
	 
     /* e-2 El metodo public void intercambia2(int arr[ ], int x, int y), que recibe un array de enteros y dos valores enteros
      *  que corresponden a dos componentes del array e intercambie los valores de las componentes del array 
      *  int x, int y suponemos son posiciones del array  (empiezan en 1)
     */
     public static void intercambia2 (int arr[ ], int x, int y) {
      
      	if (x>=0 && x < arr.length && y>=0 && y < arr.length) {     			      	
	      		int aux = arr[x-1];    			
	      		arr[x-1] =arr[y-1]; 
	      		arr[y-1] = aux;
	    }
      	else System.out.println("No existen las dos posiciones en el array");   	
    }
     /* f- recibe un array de enteros e invierte la secuencia de valores del array.
     * 
     */
	 /*
    public static void invierte (int arr[ ]){
    	int posI, posF=arr.length-1, aux;
    	
    	for(posI = 0, posF=arr.length-1; posI<arr.length/2;posI++, posF--){		
    		aux = arr[posI];
    		arr[posI] = arr[posF];
    		arr[posF] =aux;
    	}
    }
	*/
	
    /* f- recibe un array de enteros e invierte la secuencia de valores del array.
     * 
     */
    public static void invierte (int arr[ ]){
    	int posI, posF=arr.length-1, aux;
    	for(posI = 0;posI<arr.length/2;posI++){		
    		aux = arr[posI];
    		arr[posI] = arr[posF];
    		arr[posF] =aux;
    		posF--;
    	}
    }
    
	// Con esta segunda opcion, lo que hago es crear un nuevo array donde invierto los elementos
	/*
    public static int[] invierte2 (int arr[ ]){
    	int [] aux = new int[arr.length];
  	
    	for(int j=0, i = arr.length-1; i>=0; i--, j++){		
    		aux[j] = arr[i];
    	}

    	return aux;
    }
	*/
	
    // Con esta segunda opción, lo que hago es crear un nuevo array donde invierto los elementos
    public static int[] invierte2 (int arr[ ]){
    	int [] aux = new int[arr.length];
    	int j=0;
    	
    	for(int i = arr.length-1; i>=0; i--){		
    		aux[j++] = arr[i];
    	}

    	return aux;
    } 
    
    /* g - rotaDerecha recibe un array de enteros y mueve a cada elemento una posición adelante,
     *  colocando el último valor del array en la primera componente del array resultante.
    */
    public static void rotaDerecha (int arr[ ]){   
    	int aux;
    	
    	aux = arr[arr.length-1];
    	
    	for (int i = arr.length-1; i>0; i--){		
    		arr[i] = arr[i-1];
    	}
    	
    	arr[0] = aux;
    	
    } 
    
    /* h - public boolean iguales (int a1[ ], int a2[ ]), que recibe dos arrays de enteros y
     *  devuelve true si los dos arrays contienen la misma secuencia de valores y false de otra manera. 
     */
    public static boolean iguales (int a1[ ], int a2[ ]){   
    	boolean aIguales=true;
    	
    	if (a1.length != a2.length) aIguales=false;
    	else
	    	for (int i=0, j=0; i<a1.length  && aIguales; i++, j++){		
	    		if (a1[i] != a2[j])	aIguales=false;
	    	}
    	
    	return aIguales;   	
    } 
    
    /* Método que escribe el contenido del array */
    public static void escribir(int[] arr){
    	for(int i=0;i<arr.length;i++){
    		System.out.print(arr[i]+" ");
    		
    	}
    	System.out.println();
    }
   
    
}

