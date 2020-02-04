package arrays1;

import java.util.Scanner;
public class Ej7 {
	final static int TAM=10;
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double[] notas=new double[TAM];
		String[] nombres=new String[TAM];
		String[] notaalf=new String[TAM];
		
        rellenar(notas, teclado);
        escribir(notas);
        
        rellenar(nombres, teclado);
        escribir(nombres);
        
        rellenar(notas,notaalf);
        
        escribir(nombres,notas,notaalf);
        teclado.close();
   	}
	
    static void rellenar(double[] a, Scanner teclado){
    	for(int i=0;i<a.length;i++)
    	  do{	
    		System.out.println("Introducir nota numerica "+(i+1));
    		a[i]=teclado.nextDouble();
    	  }while(a[i]<0 || a[i]>10);
    }
    
    static void rellenar(String[] a, Scanner teclado){
    	teclado.nextLine();
    	for(int i=0;i<a.length;i++){
    	  System.out.println("Introducir nombre "+(i+1));
    	  a[i]=teclado.nextLine();
    	} 
    }
    
    static void rellenar(double[] n,String[] a){
    	for(int i=0;i<n.length;i++){
    	  if(n[i]<5)
    		a[i]="Suspenso";
    	  else if(n[i]<7)
    		a[i]="Bien";
    	  else if(n[i]<9)
 		    a[i]="Notable";
    	  else
    	    a[i]="Sobresaliente";
    	} 
    }
    
    static void escribir(double[] a){
    	for(int i=0;i<a.length;i++)
    		System.out.print(a[i]+" ");
    	System.out.println();
    }
    
    static void escribir(String[] a){
    	for(int i=0;i<a.length;i++)
    		System.out.print(a[i]+" ");
    	System.out.println();
    }
    
    static void escribir(String[] n,double[] a,String[] na){
    	for(int i=0;i<a.length;i++)
    		System.out.println(n[i]+" "+a[i]+" "+na[i]);
    }
}

