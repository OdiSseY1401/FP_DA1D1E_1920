package EjerciciosClases;

public class Ejercicio6 {
	private int Cuenta=0;
	private static int contCuentas=0;
	private int Dinero;

	public Ejercicio6 () {}
	
	public void setDinero(int Dinero) {
		this.Dinero=Dinero;
	}

	public void crearCuenta(){
			Cuenta++;
			contCuentas++;
			System.out.println("Cuenta creada");
	}
	
	public void Ingresar(int Dinero) {
		this.Dinero=this.Dinero+Dinero;
	}
	public void Retirar(int Dinero) {
		if (Dinero > this.Dinero) {
			System.out.println("No puedes sacar " + Dinero + " €");
		}
		else{
		this.Dinero=this.Dinero-Dinero;
		}
	}
	public int consultarSaldo() {
		return Dinero;
	}
	public int cuentasTotales() {
		return contCuentas;
	}
}
