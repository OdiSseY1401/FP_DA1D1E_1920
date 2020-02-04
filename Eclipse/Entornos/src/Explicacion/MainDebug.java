package Explicacion;

public class MainDebug {

	public static void f1() {
		System.out.println("Estamos en f1");
		System.out.println("Estamos en f1");
		//if algo
		f2();
	}
	public static void f2() {
		System.out.println("Estamos en f2");
		System.out.println("Estamos en f2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Repaso debugging");
		System.out.println("1)¿Que es un punto de ruptura?");
		System.out.println("Tipo de marca que se coloca en la zona donde queremos que pare en tiempo de ejecucuión");
		System.out.println("2) ¿Como se ponia?");
		System.out.println("Nos vamos al lado izquierdo, al lado del numero de linea pulsamos el boton derecho y añadimos breakpoint");
		System.out.println("3) ¿Donde?");
		int a;
		a = 5;
		System.out.println((++a) * 2 + " En algún sitio que muestre/cambie algo, como puede ser un parametro, una accion de syso como esta...");
		System.out.println("4) ¿Finalidad?");
		System.out.println("Pausar el programa para comprobar los valores");
		a =5;
		int b;
		b = 6;
		if (a<b)
			System.out.println(a+ " a es mayor que b " + b);
		else
			System.out.println(a+ " a es menor que b " + b);
		int i = 0;
		System.out.println("Entramos en el bucle");
	/*	while(i >= 0) {
			System.out.println(i);
			++i; //i++ ¿Diferencias? ¿Se pueden utilizar a la vez?
			//a = a * (++i); Se suma una a i antes de realizar la operacion
			//a = a * (i++); Se suma una a i despues de realizar la operacion 
		}*/
		System.out.println("Salimos del bucle");
		f1();
		f2();
		//Creamos una instancia/objeto de la clase DepurarMola
		DepurarMola o1= new DepurarMola();
		o1.mostrarInfo();
		
	}
}
