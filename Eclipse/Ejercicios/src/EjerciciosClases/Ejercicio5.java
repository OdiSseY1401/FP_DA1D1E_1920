package EjerciciosClases;

public class Ejercicio5 {
	private String color, marca, matricula;
	private int puertas;
	public Ejercicio5 () {}

	public Ejercicio5 (int puertas, String color, String marca, String matricula) {
		this.puertas=5;
		this.color="Negro";
		this.marca="Ford";
		this.matricula="1234-BCD";
	}
	public void ponPuertas(int puertas) {
		this.puertas=puertas;
	}
	public void ponMarca(String marca) {
		this.marca=marca;
	}
	public void ponMatricula(String matricula) {
		this.matricula=matricula;
	}
	public void ponColor(String color) {
		this.color=color;
	}
	public void PintaCoche(String color) {
		this.color=color;
		System.out.println("Tu coche se ha pintado de color " + color);
	}
	public int damePuertas() {
		return puertas;
	}
	public String dameMarca() {
		return marca;
	}
	public String dameMatricula() {
		return matricula;
	}
	public String dameColor() {
		return color;
	}
	public String toString() {
		String cadena=puertas+" puertas, color: " + color + " /marca: " + marca + " /matricula: " + matricula;
		return cadena;
	}
}
