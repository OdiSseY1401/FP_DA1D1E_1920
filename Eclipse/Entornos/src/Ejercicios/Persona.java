package Ejercicios;
public class Persona {
		String nombre;
		String apellido;
		String casado;
		String DNI;
		int edad;
	
		public Persona() {
			nombre = "Jaime Acevedo";
			apellido = "Adrian Morante";
			casado = "De momento no";
			DNI = "123123E";
			edad = 18;
		}
		public void setnombre(String nom) {
			nombre=nom;
		}
		public String getnombre() {
			return nombre;
		}
		public void setapellido(String ape) {
			apellido=ape;
		}
		public String getapellido() {
			return apellido;
		}
		public void setcasado(String cas) {
			casado=cas;
		}
		public String getcasado() {
			return casado;
		}
		public void setDNI(String dni) {
			DNI=dni;
		}
		public String getDNI() {
			return DNI;
		}
		public void setedad(int eda) {
			edad=eda;
		}
		public int getedad() {
			return edad;
		}
		public void Info() {
			System.out.println("Primera persona: " + getnombre());
			System.out.println("Segunda persona: " + getapellido());
			System.out.println("¿Casado?: " + getcasado());
			System.out.println("DNI: " + getDNI());
			System.out.println("Edad: " + getedad());
			
		}

}
