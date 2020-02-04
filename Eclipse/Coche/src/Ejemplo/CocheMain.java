package Ejemplo;

public class CocheMain {

	public static void main(String[] args) {
		// Creo un coche
		Coche coche1 = new Coche();
		coche1.marca= "Seat";
		coche1.modelo= "Panda";
		coche1.color= "azul";
		coche1.numeroDePuertas= 3;
		coche1.cuentaKilometros= 250000;
		coche1.velocidad= 0;
		coche1.arrancado= false;
		coche1.arrancar();
		coche1.arrancado= true;
		coche1.acelerar();
		coche1.pitar();
		
		//Creo otro coche
		Coche coche2 = new Coche();
		coche2.marca= "Ford";
		coche2.modelo= "Fiesta";
		coche2.color= "Nigga";
	}

}
