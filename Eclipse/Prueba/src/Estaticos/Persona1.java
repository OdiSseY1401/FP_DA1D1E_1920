package Estaticos;

public class Persona1 {
	private String Nombre;
	private int Edad;
	private static int contadorPersonas=0;
	
	public Persona1() {}
	public Persona1(String Nombre, int Edad) {
		this.Nombre=Nombre;
		this.Edad=Edad;
		contadorPersonas++;
	}
	
	public void setNombre(String Nombre) {
		Nombre=Nombre;
	}
	
	public String getNombre() {
		return Nombre;
	}
	
	public void setEdad(int Edad) {
		Edad=Edad;
	}
	
    public int getEdad() {
        return Edad;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void incrementarContador() {
        contadorPersonas++;
    }
}

