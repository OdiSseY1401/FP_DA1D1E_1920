package Ejemplo;

public class Coche_1 {
		private String color;
		public Coche_1() {}
		
		public Coche_1(String color) {
			this.color=color;
		}
		public String devColor() {
			return color;
		}
		public void pintaCoche(String color) {
			this.color=color;
		} 
		public void escribeCoche() {
			System.out.println("El color del coche es: " + color); 
		}
}
