package Pruebas2;

public class Debug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ejemplo de depuración");
		System.out.println("1) Añandir puntos de ruptura en nuestro codigo");
		System.out.println("¿Como?");
		System.out.println("<- En la parte izquierda de nuestra pantalla");
		System.out.println("<-Tenemos el número de linea en el que nos encontramos");
		System.out.println("<- En la aprte izquierda de nuestra pantalla \n"); // \n hace salto de linea
		System.out.println("Hacemos click en el boton derecho y añadimos un breakpoint");
		System.out.println("Ready to rumble? :) \n");
		
		int a;	//Pon un breakpoint aqui
		int b;  //No se puede poner uno en una linea de declaracion o definicion
		
		a = 5;
		b = 6;
		if (a < b) {
			System.out.println(a + " a es mayor que b " + b);
		}	
		else {
			System.out.println(a + " a es menor que b " + b);
		}
		
		int i = 0;
		
		do {
			System.out.println(i);
			++i;
		}while(i>0);
	}

}
