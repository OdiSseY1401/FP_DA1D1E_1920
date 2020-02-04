package arrays2;

import java.util.Scanner;
public class Ej3_2 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int n,d;
		
		do{
		   System.out.println("Introducir numero de componentes del array ");
		   n=teclado.nextInt();
		}while(n<=0);
		
		int[] array1=new int[n];
        
		rellenar(array1);
        escribir(array1);
        
        do{
          System.out.println("Introducir digito ");
 		  d=teclado.nextInt();
        }while(d<0 && d>9);
        
        n=contar(array1,d);
        
        if(n==0)
          System.out.println("No hay ningun valor que acabe en ese digito");
        else{
          int[] array2=new int[n];
          rellenarB(array1,d,array2);
          escribir(array2);
        }
        
        teclado.close();
   	}
    static void rellenar(int[] a){
    	//Scanner teclado=new Scanner(System.in);
    	for(int i=0;i<a.length;i++)
    		/*System.out.println("Introducir valor de la componente "+i);
    		a[i]=teclado.nextInt();*/
    		a[i]=(int)(Math.random()*300+1);
    }
    
    static void escribir(int[] a){
    	for(int i=0;i<a.length;i++)
    		System.out.print(a[i]+" ");
    	System.out.println();
    }
    
    static void rellenarB(int[] a,int dg,int b[]){
    	int j=0;
    	for(int i=0;i<a.length;i++)
    		if(a[i]%10==dg){
    			b[j]=a[i];
    			j++;
    		}
    	  
    }
    static int contar(int[] a,int dg){
    	int j=0;
    	for(int i=0;i<a.length;i++)
    		if(a[i]%10==dg)
    			j++;
    	return j;	
    }
 }
