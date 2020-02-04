package Arrays;
import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int x;
		int num;
		System.out.println("Dime cuantas celdas quieres que tenga el array:");
		x=teclado.nextInt();
		int [] numero = new int [x];
		int n=0;
		while (n<numero.length){
			System.out.println("Dime un número");
			numero[n]=teclado.nextInt();
			n++;
		}
		int numero1;
		int numero2;
		System.out.println("Has puesto en la cadena " + cuentaCeros(numero) + " ceros");
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("La suma de todos los pares es: " + sumaPares(numero));
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("Dime un numero");
		num=teclado.nextInt();
		System.out.println("El numero de " + num + " que hay en el array es de: " + cuentaRepeticiones(numero,num));
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("Dime un numero nuevo");
		numero1=teclado.nextInt(); 
		System.out.println("Dime un numero viejo");
		numero2=teclado.nextInt();
		sustituye(numero,numero1,numero2);
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("Dime un numero del array: ");
		numero1=teclado.nextInt(); 
		System.out.println("Dime otro numero del array: ");
		numero2=teclado.nextInt();
		intercambia(numero,numero1,numero2);
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("Dime una posición del array: ");
		numero1=teclado.nextInt(); 
		System.out.println("Dime otra posición del array: ");
		numero2=teclado.nextInt();
		intercambia2(numero,numero1,numero2);
		System.out.println("-------------------------------------------------------------------------------");
	}
	
	public static int cuentaCeros(int numeroCop[]) {
		int cont=0;
		for (int i = 0; i < numeroCop.length; i++) {
			if (numeroCop[i] == 0) {
				cont++;
			}
		}
		return cont;
	}
	
	public static int sumaPares(int numeroCop[]) {
		int suma=0;
		for (int i = 0; i < numeroCop.length; i++) {
			if (numeroCop[i] % 2 == 0) {
				suma=suma+numeroCop[i];
			}
		}
		return suma;
	}
	
	public static int cuentaRepeticiones(int numeroCop[], int n) {
		int cont=0;
		for (int i = 0; i < numeroCop.length; i++) {
			if (numeroCop[i]== n) {
				cont++;
			}
		}
		return cont;
	}
	public static void sustituye(int numeroCop[],int nuevo,int viejo) {
		
		for (int i = 0; i < numeroCop.length; i++) {
			if (numeroCop[i]== viejo) {
				numeroCop[i]=nuevo;
			}
			System.out.print(numeroCop[i] + " ");
		}
		System.out.println();
	}
	public static void intercambia(int numeroCop[], int num1, int num2) {
		for (int i = 0; i < numeroCop.length; i++) {
			if  (numeroCop[i]==num1) {
				numeroCop[i]=num2;
			}
			else if (numeroCop[i]==num2) {
				numeroCop[i]=num1;
			}
		}
		for (int i = 0; i < numeroCop.length; i++) {
			System.out.println(numeroCop[i]);
		}
		System.out.println();
	}
	
	public static void intercambia2(int numeroCop[], int num1, int num2) {
		int auxN1, auxN2;
		auxN1=numeroCop[num1];
		auxN2=numeroCop[num2];
		numeroCop[num1]=auxN2;
		numeroCop[num2]=auxN1;
		for (int i = 0; i < numeroCop.length; i++) {
			System.out.println(numeroCop[i]);
		}
		System.out.println();
	}
	
	public static void invierte () {
		
	}
}
