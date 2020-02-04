package basicos3;
import java.util.*;
public class Ej1 {
	public static void main(String[] args) {
	  final  int LIMITE=200;
	  Scanner teclado=new Scanner(System.in);
	  int n,intentos,cont=1;
      int num=(int)(Math.random()*LIMITE+1);
      
      System.out.println("Numero de intentos permitidos");
      intentos=teclado.nextInt();
      
      System.out.println("Introducir numero ");
      n=teclado.nextInt();
      
      while(cont<intentos && n!=num){
    	  if(n>num)
    		System.out.println("<");  
    	  else 
    		System.out.println(">"); 
    	  
    	  cont++;
    	  
    	  System.out.println("Introducir numero ");
          n=teclado.nextInt();
      }
      
      teclado.close();
      
      if(n==num)
    	 System.out.println("Enhorabuena has acertado. Has utilizado "+cont+ " intentos");
      else
    	 System.out.println("Has perdido.El numero era "+num);
	}

}
