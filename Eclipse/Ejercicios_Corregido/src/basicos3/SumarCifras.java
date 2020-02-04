package basicos3;
import java.util.*;
public class SumarCifras {
// Para el ejercicio 4
	 public static void main(String[] args) {
		 Scanner teclado=new Scanner(System.in);
		 int n, suma=0, aux;
		 System.out.println("Introducir numero");
		 n=teclado.nextInt();
		 aux=n;
		 while(aux>0){
			suma=suma + aux%10;			
			System.out.println("Sumo "+ (aux%10)); //Desde el final vamos cogiendo los digitos
			aux=aux/10;
	    }
		System.out.println("La suma de las cifras del numero " + n + " es "+suma);	
		teclado.close();
	}

}
