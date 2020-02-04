package basicos2;
import java.util.*;
public class Ej5 {
  public static void main(String[] args) {
	  Scanner teclado=new Scanner(System.in);
		int n;
		double suma=0;
		System.out.println("Introducir limite de la serie");
		n=teclado.nextInt();
		for(int i=1;i<=n;i++){
			suma=suma+(double)1/i;
			System.out.print(" 1/" +i);
			
		}
		System.out.println();
		System.out.println("La suma de la serie es "+suma);
		teclado.close();
	}

}