package Pruebas2;

public class PruebaPositivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 5; i >=-5; i--)
			if (esPositivo(i))
				System.out.println(i + " Es positivo: ");
			else
				System.out.println(i + " Es negativo: ");
	}

	public static boolean esPositivo(int x) {
		if (x < 0) return false;
		else return true;
	}
}
