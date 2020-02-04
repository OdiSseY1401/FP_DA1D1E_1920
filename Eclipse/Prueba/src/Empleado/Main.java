package Empleado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado e1 = new Empleado();
		System.out.println("El empleado tiene DNI "  + e1.dameDNI() + ", y su nombre es: "+ e1.dameNOMBRE() + ")");
		
		e1.ponDNI("12345678A");
		e1.ponNOMBRE("BENITO");
		System.out.println(e1);
		
		Empleado e2 = new Empleado("87654321Z", "KAMELAS");
		System.out.println("El empleado tiene DNI "  + e2.dameDNI() + ", y su nombre es: "+ e2.dameNOMBRE() + ")");
		System.out.println(e2);
	}

}
