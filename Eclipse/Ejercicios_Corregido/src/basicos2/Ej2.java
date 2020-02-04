package basicos2;
import java.util.*;
public class Ej2 {
  public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double cap,capf;
		int mes=0;
		
		System.out.println("Introducir un capital");
		cap=teclado.nextDouble();
		capf=2*cap;
		
		while(cap <= capf) {
			mes++;
			cap=cap*1.05; // cap = cap + cap*0.05 es incremento mes a mes
		}
		
		System.out.println("El capital inicial se duplica en " + mes + " meses");
		
		teclado.close();

		// Otra forma, con la fórmula
	    
	    System.out.println("El capital inicial se duplica en "+ (int)Math.ceil(Math.log(2)/Math.log(1+0.05)) +" meses");
	    
	    /*
	    (1+i) elevado a n = cf/ci
	    n log(1+i) = log(cf/ci)
	    n log (1,05) = log(2ci/ci)
	    n log (1,05) = log(2)
	    n  = log(2)/log (1,05)
	    
	    14,2 -> se dupilca en 15 meses
	   */ 
	}

}

