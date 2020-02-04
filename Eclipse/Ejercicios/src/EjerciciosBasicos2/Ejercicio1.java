package EjerciciosBasicos2;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma = 0, cont = 1;
		final int MAX = 1800;
		
		for(int i = 2;i <= MAX;) {
			suma=suma+1;
			System.out.println(i + " ");
			if(cont % 2 == 0)
				i = i + 2;
			else
				i = i + 3;
			cont++;
		}
		System.out.println("\nLa suma de la series es " + suma);
	}

}
