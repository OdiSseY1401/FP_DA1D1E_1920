package basicos2;
import java.util.*;
public class Ej13 {
 public static void main(String[] args) {
	 Scanner teclado=new Scanner(System.in);
	  int n;
	  System.out.println("Introducir numero");
	  n=teclado.nextInt();
	  for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++)
	      System.out.print(j+" ");		
	   System.out.println();	
	  }	
	  teclado.close();
	}
}