package basicos4;
import java.util.*;
public class Ej3 {
	public static void main(String[] args) {
		 Scanner teclado=new Scanner(System.in);
		 int n,cont=0,total=0;
		 boolean primo;
		 System.out.println("Introducir numero");
		 n=teclado.nextInt();
		 for(int i=1;i<=n;i++){
		  cont=2;
		  primo=true;
		  while(cont<i && primo!=false){
		    if(i%cont==0)
		  	  primo=false;
		      cont++;
		    }
		    if (primo){
		      System.out.println("El numero "+i+" es primo ");	
		      total++;
		    } 
		  }
		 teclado.close();
		 System.out.println("Entre el 1 y el "+n+" hay "+total+" numeros primos");	
	     } 
}
