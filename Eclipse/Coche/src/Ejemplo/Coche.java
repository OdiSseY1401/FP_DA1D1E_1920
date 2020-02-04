package Ejemplo;

public class Coche {
	String marca;
	String modelo;
	String color;
	int numeroDePuertas;
	int cuentaKilometros;
	int velocidad;
	boolean arrancado;
	void arrancar() {
		arrancado=true;
	}
	void parar() {
		arrancado=false;
	}
	void frenar() {
		velocidad=velocidad - 1;
	}
	void acelerar() {
		velocidad=velocidad + 1;
	}
	void pitar() {
		System.out.println("PIIIIIIIIIIIIIIIIIIIIIIIIIII");
	}
	int consultarCuentaKilometros() {
	return cuentaKilometros;
	}	
}
