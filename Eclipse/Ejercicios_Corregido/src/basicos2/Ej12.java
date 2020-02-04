package basicos2;
import java.util.*;
public class Ej12 {
  public static void main(String[] args) {
	 Scanner teclado=new Scanner(System.in);
	 int n,cont=0;
	 System.out.println("Introducir numero");
	 n=teclado.nextInt();
	 
	 for(int i=2;i<n;i++)
	   if(n%i==0)
		 cont++;
	 
	 if (cont==0)
	   System.out.println("El numero "+n+" es primo ");		
	 else
	   System.out.println("El numero "+n+" no es primo ");	
	 teclado.close();
	 /*OTRA FORMA
	  * 
	  * int n,cont=2;
	  * boolean primo=true;
	  * System.out.println("Introducir numero");
	  * n=teclado.nextInt();
	  * while(cont<n && primo!=false){
	  *    if(n%cont==0)
	  *	    primo=false;
	  *	  cont++;
	  *	}
	  * if (primo)
	  *   System.out.println("El numero "+n+" es primo ");		
	  * else
	  *  System.out.println("El numero "+n+" no es primo ");	
	  * 
	  */
	}

}
