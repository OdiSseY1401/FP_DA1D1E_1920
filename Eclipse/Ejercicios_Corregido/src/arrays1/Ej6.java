package arrays1;

import java.util.Scanner;

public class Ej6 {
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int n;
		double media;
		
		n = leerNPersonas(teclado, "Introduce el numero de personas");
		
		//Este ejercicio lo hacemos creando el array dentro del metodo
		      
		double[] array = rellenar(teclado, "Introducir valor de la componente ", n);
        
		escribir(array);
        System.out.println();
        
        media=media(array);
        System.out.println("La media de las estaturas es "+media);
        contar(array, media);
       
        teclado.close();
   	}
	
	
	public static int leerNPersonas(Scanner sc, String msg) {
		int num;
		do{
		   System.out.println(msg);
		   num=sc.nextInt();
		}while(num<=0);
	
		return num;	
	}
	
	
    static double[] rellenar(Scanner sc, String msg, int tam){
    	double[] a = new double[tam];
    	
    	for(int i=0;i<a.length;i++){
    		System.out.println(msg +i);
    		a[i]=sc.nextInt();
    	}
    	
    	return a;
    }
    
    
    static void rellenar(double[] a){
    	for(int i=0;i<a.length;i++)
    		a[i]=Math.random()*211; //genera entre 0 y 210
    }
    
    
    static void escribir(double[] a){
    	for(int i=0;i<a.length;i++)
    		System.out.print(a[i]+" ");
    }
    
    
    static double media(double[] a){
    	double suma=0, media=0;
    	
    	for(int i=0;i<a.length;i++)
    	  suma=suma+a[i];
    	
    	media=suma/a.length;
    	
    	return media;
    }
    
    
    static void contar(double[] a,double m){
    	int amy=0,amn=0;
    	
    	for(int i=0;i<a.length;i++)
    	  if(a[i]>m)
    		amy++;
    	  else if(a[i]<m)
    		amn++;
    	
    	System.out.println("Hay "+amy+" personas con una altura superior a la media");
    	System.out.println("Hay "+amn+" personas con una altura inferior a la media");
    }//Modificar para que devuelva los dos valores
 }

