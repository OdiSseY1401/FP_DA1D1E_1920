package pruebas;

public class Linea1 {
	private int x1, y1, x2, y2;
	public Linea1() {}
	public Linea1 (int x1, int y1, int x2, int y2) {
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
	}
	
	public double longitud() {
		return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	}
	
	public String toString() {
		//El signo + para cadenas no significa suma aritmetica sino concatenación
		return "(" + x1 + ", "+y1+") ("+ x2 + ", " + y2 + ")";
	}
}
