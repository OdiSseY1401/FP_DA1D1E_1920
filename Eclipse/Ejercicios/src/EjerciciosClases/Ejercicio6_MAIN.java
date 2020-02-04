package EjerciciosClases;
import java.util.*;

public class Ejercicio6_MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Ejercicio6 cuenta1 = new Ejercicio6();
		
		System.out.println("Dime cuanto dinero tienes para empezar: ");
		cuenta1.setDinero(teclado.nextInt());
		cuenta1.crearCuenta();
		System.out.println("Ingresa dinero: ");
		cuenta1.Ingresar(teclado.nextInt());
        System.out.println("Tienes " + cuenta1.consultarSaldo() + " €");
        System.out.println("Retira dinero: ");
		cuenta1.Retirar(teclado.nextInt());
        System.out.println("Tienes " + cuenta1.consultarSaldo() + " €");
        System.out.println("Hay un total de " + cuenta1.cuentasTotales() + " cuentas");
	}

}
