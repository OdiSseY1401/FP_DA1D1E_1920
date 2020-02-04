package EjerciciosBasicos3;
import java.util.*;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int dia, mes, anio, tarot, invertido=0, aux, auxS, suma=0;
		System.out.println("Dime el dia que naciste: ");
		dia = teclado.nextInt();
		System.out.println("Dime el mes que naciste(el número): ");
		mes= teclado.nextInt();
		System.out.println("Dime el año que naciste: ");
		anio = teclado.nextInt();
		
		tarot=dia + mes + anio;
		aux=tarot;
		
		while(aux>0){
			invertido=0;
			invertido=invertido*10+aux%10;	
			aux=aux/10;
			suma=suma+invertido;
		}
		
		auxS=suma;
		suma=0;
		
		while(auxS>0){
			invertido=0;
			invertido=invertido*10+auxS%10;	
			auxS=auxS/10;
			suma=suma+invertido;
		}
		System.out.println("Tu numero del tarot es: " + suma);
	}

}
