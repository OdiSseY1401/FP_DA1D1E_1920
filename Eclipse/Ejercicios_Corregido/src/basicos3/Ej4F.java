package basicos3;
import java.util.*;
public class Ej4F {
   public static void main(String[] args){
	   Scanner teclado=new Scanner(System.in);
	   int d,m,a;
	   
	   System.out.println("Introducir dia de nacimiento");
	   d=teclado.nextInt();
       
	   System.out.println("Introducir mes de nacimiento");
	   m=teclado.nextInt();
       
	   System.out.println("Introducir anio de nacimiento");
	   a=teclado.nextInt();
	      
	   teclado.close();
	   System.out.println("El numero del tarot es " + generaNumTarot(d, m, a));
	   
   }
   
   public static int generaNumTarot(int d, int m, int a){
	   int suma=0, aux=0;
	   
	   suma=d+m+a;
	   while(suma>9){
		   //En suma guardamos la suma de los digitos y seguimos mientras tenga mas de 1 digito
			  aux = suma;
			  suma=0;
			 
			  // Vamos dividiendo entre 10 y quedandonos con el resto, que vamos acumulando			  
			  while(aux>0){
					suma += aux%10;			
					System.out.println("Sumo "+ (aux%10)); //Desde el final vamos cogiendo los digitos
					aux /= 10;
			  }
					 
		}
	   
	   return suma;
   }  
  
}
