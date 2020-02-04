package basicos2;
import java.util.*;
public class Ej4 {
  public static void main(String[] args) {
	    Scanner teclado=new Scanner(System.in);
		double cap,capf;
		int mes=0;
		System.out.println("Introducir un capital");
		cap=teclado.nextDouble();
		capf=3*cap;
		while(cap<=capf){
			mes++;
			cap=cap*1.06; // cap = cap + cap*0.06
		}
		
		System.out.println("El capital inicial se triplica en "+mes+" meses");	
	    teclado.close();
	    // Otra forma, con la fórmula
	    
	    System.out.println("El capital inicial se triplica en "+ Math.ceil(Math.log(3)/Math.log(1+0.06)) +" meses");	
	}

}