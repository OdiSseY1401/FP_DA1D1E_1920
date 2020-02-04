package EjerciciosClases;

public class Ejercicio4 {
	private int x, y;
	public Ejercicio4 () {}

	public Ejercicio4 (int x, int y) {
		this.x=0;
		this.y=0;
	}

	public void ponX(int x) {
		this.x=x;
	}
	
	public void ponY(int y) {
		this.y=y;
	}
	
	public String toString() {
		String cad="Las coordenadas son (" + x+ ", " + y + ")";
		return cad;
	}
}
