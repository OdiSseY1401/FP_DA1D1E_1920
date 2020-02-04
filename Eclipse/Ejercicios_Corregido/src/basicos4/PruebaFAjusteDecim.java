package basicos4;


	public class PruebaFAjusteDecim {
		public static void main(String[] args) {
			
			double numero = 3.456778;
							
			System.out.println("Numero con 2 decimales " +
			ajustarDecimales(numero, 2));
					
		 }
		
		 public static double ajustarDecimales(double n, int nd) {
			 return(double)Math.round(n*Math.pow(10, nd))/Math.pow(10, nd);
		 }
		 
	}

