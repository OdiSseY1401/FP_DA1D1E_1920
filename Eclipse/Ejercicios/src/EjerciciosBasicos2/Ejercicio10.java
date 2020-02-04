package EjerciciosBasicos2;
import java.util.*;
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		int num1, num2;
		int resto;
		int coc=0;
		int aux;
		System.out.println("Dime el primer número");
		num1=teclado.nextInt();
		System.out.println("Dime el segundo número");
		num2=teclado.nextInt();
		
		if (num1 < num2) {
			aux=num1;
			num1=num2;
			num2=aux;
			}
		
		resto=num1;
		while(resto>=num2) {
			resto=resto-num2;
			coc++;
		}
		System.out.println("El cociente entre " + num1 + " y  "+num2+" es " + coc+" y el resto " + resto);
		}
	}


