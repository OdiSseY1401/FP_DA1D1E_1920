package basicos4;
import java.util.Scanner;
public class Ej2 {
	public static void main(String[] args) {
		 Scanner teclado=new Scanner(System.in);
		 int nh,sueldo=0;
		 String respuesta="Si";
		 while(respuesta.compareTo("Si")==0){
			System.out.println("Introducir horas trabajadas");
			nh=teclado.nextInt();
			if(nh>35)
			  sueldo=35*15+(nh-35)*22;
			else sueldo=nh*15;
			System.out.println("El sueldo del empleado es "+sueldo);
			System.out.println("Desea introducir mas empleados (Si/No)?");
			respuesta=teclado.next();		
		 }
		 teclado.close();
	}
}