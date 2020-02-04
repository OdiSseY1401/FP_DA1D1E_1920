package pruebas;
// Punto.java: clase Punto

public class Punto {
  private int x;
  private int y;
	
  public Punto() {
  }
 
  public Punto(int _x, int _y) {
    x = _x;
    y = _y;
  }

  public int getX() {
    return x;
  }
  
  public int getY() {
    return y;
  }
  
  public void setX(int _x) {
    x = _x;
  }
  
  public void setY(int _y) {
    y = _y;
  }
  
  public double distancia(Punto p) {		 
		 return Math.sqrt((p.x-this.x)*(p.x-this.x) + (p.y-this.y)*(p.y-this.y));
}
  
  public String toString() {
    return("(" + x + "," + y + ")");
  }
 
}
