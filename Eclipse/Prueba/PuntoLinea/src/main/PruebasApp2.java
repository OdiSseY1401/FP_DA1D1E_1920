package main;

import pruebas.Linea2;
import pruebas.Punto;

public class PruebasApp2 {

	public static void main(String[] args) {
		Linea2 l1, l2, l3;
		Punto punto1, punto2;
		
		punto1 = new Punto(1, 10);
		punto2 = new Punto(1, 20);
		l1 = new Linea2(punto1, punto2);
		System.out.println(l1);
		System.out.println("Longitud " + l1.longitud());
		
		if (esLineaParalelaEjes(punto1, punto2))
			System.out.println("Es una linea paralela a un eje");
		else 
			System.out.println("No es una linea paralela a un eje");
		
		punto1 = new Punto(1, 1);
		punto2 = new Punto(2, 2);
		l2 = new Linea2(punto1, punto2);
		System.out.println(l2);
		System.out.println("Longitud " + l2.longitud());
		
		if (esLineaParalelaEjes(punto1, punto2))
			System.out.println("Es una linea paralela a un eje");
		else 
			System.out.println("No es una linea paralela a un eje");
		
		// Probamos el segundo metodo:	
		punto1 = new Punto(10, -1);
		punto2 = new Punto(-2, 20);
		l3 = new Linea2(punto1, punto2);
		System.out.println(l3);
		
		System.out.println("Longitud " + l3.longitud());
		if (esLineaParalelaEjes(l3))
			System.out.println("Es una linea paralela a un eje");
		else 
			System.out.println("No es una linea paralela a un eje");
	}
	
	public static boolean esLineaParalelaEjes(Punto p1, Punto p2) {
		if ((p1.getX() == p2.getX()) || (p1.getY() == p2.getY())) return true;
		else return false;
	}
	
	public static boolean esLineaParalelaEjes(Linea2 l) {
		if ((l.getP1().getX() == l.getP2().getX()) || (l.getP1().getY() == l.getP2().getY())) return true;
		else return false;
	}

}
