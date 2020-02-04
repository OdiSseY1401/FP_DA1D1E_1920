package Circunferencias;

public class Circunferencia {
	private double x, y, radio;

	public Circunferencia () {}
	
	public Circunferencia (double x, double y, double radio) {
		this.x=x;
		this.y=y;
		this.radio=radio;
	}
	
	public double dameX() {
		return x;
	}
	
	public double dameY() {
		return y;
	}
	
	public double dameRadio() {
		return radio;
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
	
	public String toString () {
		String cad = "El centro es ("  + x + ", "+ y + ")";
		cad += "El radio es "  + radio;
		
		return cad;
	} 
}
