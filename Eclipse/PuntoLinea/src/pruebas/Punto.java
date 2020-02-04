package pruebas;

public class Punto {
	private int x;
	private int y;
	
	public Punto() {}
	
	public Punto (int x, int y) {
		this.x = x;
		this.y =y;
	}
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x=x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public double distancia(Punto p) {
		return Math.sqrt((p.x-this.x)*(p.x-this.x) + (p.y-this.y)*(p.y-this.y));
	}
	
	public boolean esLineaParalelaEjes(Punto p) {
		if(x == p.x || y == p.y) return true;
		else return false;
	}
	
	public String toString() {
		return("(" + x + ", " + y +")");
	}
}
