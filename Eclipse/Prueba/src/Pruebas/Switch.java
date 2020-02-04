package Pruebas;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String mes, mesS;
		int dias=0;
		System.out.println("Dime un mes: ");
		mes = sc.nextLine();
		
		switch (mes.toLowerCase()) {
			case "enero":
			case "marzo":
			case "mayo":
			case "julio":
			case "agosto":
			case "octubre":
			case "diciembre":	dias = 31;
				break;
			case "abril": 
			case "junio":
			case "septiembre":
			case "noviembre": dias=30;
				break;
			case "febrero": dias=28;
				break;
		}
		mesS = mes.substring(0, 1).toUpperCase() + mes.substring(1).toLowerCase(); //Escribe de la 0 a la 1 en mayus, y de la posicin 1 adelante en minus
		System.out.println("El mes " + mesS + " tiene " + dias + " dias.");
	}

}
