package basicos2;

import java.util.*;
public class Ej11 {
 public static void main(String[] args) {
	 Scanner teclado=new Scanner(System.in);
	 int n, invertido=0, aux;
	 
	 System.out.println("Introducir numero");
	 n=teclado.nextInt();
	 aux=n;
	
	while(aux>0){
		invertido=invertido*10+aux%10;
		System.out.println("El numero " + aux%10);	
		aux=aux/10;
    }
	
	System.out.println("El numero "+n+" invertido es "+invertido);	
	teclado.close();
}

}