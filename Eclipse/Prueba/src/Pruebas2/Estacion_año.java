package Pruebas2;
import java.util.Scanner;
public class Estacion_año {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String mesS;
		double mes;
		
		System.out.print("Dime el número del mes: ");
		mesS = sc.nextLine();
		mes = Double.parseDouble(mesS);
		
		if (mes == 12 || mes == 1 || mes == 2) {
			System.out.println("Invierno");
		}
		else if (mes == 3 || mes == 4 || mes == 5) {
			System.out.println("Primavera");
		}
		else if (mes == 6 || mes == 7 || mes == 8) {
			System.out.println("Verano");
		}
		else if (mes == 9 || mes == 10 || mes == 11){
			System.out.println("Otoño");
		}
		else {
			System.out.println("Ese mes no existe");
			
		}
	}

}
