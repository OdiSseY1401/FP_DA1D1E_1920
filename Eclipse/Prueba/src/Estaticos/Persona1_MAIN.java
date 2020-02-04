package Estaticos;

public class Persona1_MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona1 p1 = new Persona1("Tomás Navarra", 22);
        Persona1 p2 = new Persona1("Jonás Estacio", 23);
        System.out.println("Se han creado: " + Persona1.getContadorPersonas() + " personas");
	}

}
