package basicos3;
import java.util.*;
public class Ej4 {
   public static void main(String[] args){
	   Scanner teclado=new Scanner(System.in);
	   int d,m,a,s=0,t=0;
	   
	   System.out.println("Introducir dia de nacimiento");
	   d=teclado.nextInt();
       
	   System.out.println("Introducir mes de nacimiento");
	   m=teclado.nextInt();
       
	   System.out.println("Introducir año de nacimiento");
	   a=teclado.nextInt();
	   
	   t=d+m+a;
	   
	   System.out.println("Suma de la fecha " + t + "\n");
	  
	   while(t>9){//En t guardamos la suma de los dígitos y seguimos mientras tenga más de 1 dígito
		  s=t;
		  t=0;
		  System.out.println("Suma parcial " + s + "\n");
		  // Vamos dividiendo entre 10 y quedándonos con el resto, que vamos acumulando
	      while (s>0){
	        t += s%10;
            s /= 10;
	      }
	   }
	   
	   teclado.close();
	   System.out.println("El numero del tarot es "+t);
	   
   }
}
