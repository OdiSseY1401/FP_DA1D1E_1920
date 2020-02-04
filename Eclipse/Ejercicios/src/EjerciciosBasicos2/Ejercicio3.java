package EjerciciosBasicos2;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anio=1980, anioI;
		double A=3.5, B=5;
		anioI = anio;
		do {
			A=A*1.07;
			B=B*1.05;
			anio++;
		} while (A<=B); 
		System.out.println("La ciudad A alcalnza a la ciudad b en el año " + anio + ".");
		System.out.println("Pasarán " + (anio - anioI) + " años hasta que le alcance.");
	}

}
