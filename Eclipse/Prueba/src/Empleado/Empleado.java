package Empleado;

public class Empleado{
	private String dni, nombre;

	public Empleado () {}
	
	public Empleado (String dni, String nombre) {
		this.dni=dni;
		this.nombre=nombre;
	}
	
	public String dameDNI() {
		return dni;
	}
	
	public String dameNOMBRE() {
		return nombre;
	}
	
	public void ponDNI(String dni) {
		this.dni=dni;
	}
	
	public void ponNOMBRE(String nombre) {
		this.nombre=nombre;
	}
	
	public String toString () {
		String cad = "El DNI es ("  + dni + " y su nombre es: "+ nombre + ")";
		
		return cad;
	} 
}