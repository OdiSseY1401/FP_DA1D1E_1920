package Circunferencias;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circunferencia c1 = new Circunferencia();
		System.out.println("El centro de c1 es ("  + c1.dameX() + ", "+ c1.dameY() + ")");
		System.out.println("El radio de c1 es ("  + c1.dameRadio() + ")");
		
		c1.ponX(14);
		c1.ponY(10);
		c1.ponRadio(25);
		
		System.out.println("El centro de c1 es ("  + c1.dameX() + ", "+ c1.dameY() + ")");
		System.out.println("El radio de c1 es ("  + c1.dameRadio() + ")");
		System.out.println(c1);
		
		Circunferencia c2 = new Circunferencia(5, 5, 20);
		
		System.out.println("El centro de c2 es ("  + c2.dameX() + ", "+ c2.dameY() + ")");
		System.out.println("El radio de c2 es ("  + c2.dameRadio() + ")");
		System.out.println(c2);
	}

}
