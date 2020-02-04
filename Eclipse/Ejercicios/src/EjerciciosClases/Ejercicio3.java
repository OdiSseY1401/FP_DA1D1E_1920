package EjerciciosClases;

public class Ejercicio3 {
	private double x, y, radio;

	public Ejercicio3 () {}
	
	public Ejercicio3 (double x, double y, double radio) {
		this.x=x;
		this.y=y;
		this.radio=radio;
	}
	
	public void ponX(double x) {
		this.x=x;
	}
	
	public void ponY(double y) {
		this.y=y;
	}
	
	public void ponRadio(double radio) {
		this.radio=radio;
	}
	
	public Double Area() {
		double area;
		area=Math.PI*Math.pow(radio, 2);
		return area;
	}
	
	public Double Longitud() {
		double longitud;
		longitud=2*Math.PI*Math.pow(radio, 2);
		return longitud;
	}
	
	public String toString () {
		String cad = "El área de la circunferencia es: " + Area(); 
		cad += " Y su longitud es: " + Longitud();
		return cad;
	}
	
}
