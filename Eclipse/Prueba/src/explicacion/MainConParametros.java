package explicacion;

public class MainConParametros {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("El numero de parametros debe ser 2");		
		}
		else {
			System.out.println("La suma de " + args[0] + " y " + args[1] + " es " + (Integer.parseInt(args[0]) + Integer.parseInt(args[1])));		
		}
		
	}

}