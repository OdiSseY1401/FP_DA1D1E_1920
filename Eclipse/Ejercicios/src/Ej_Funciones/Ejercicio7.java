package Ej_Funciones;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double numero, invertido=0, aux;
		System.out.println("Dime que numero quieres que convierta al binario: ");
		numero=teclado.nextInt();
		aux = numero;
		
		while(aux>0){
			aux=aux/2;
			invertido=invertido*10+aux%2;	
		}
		System.out.println("En binario es: " + invertido);
		teclado.close();
	}

}
