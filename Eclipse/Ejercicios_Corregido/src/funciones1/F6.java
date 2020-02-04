package funciones1;
import java.util.Scanner;

class F6{
	
	public static final int MAX_OPC=4;
	
	public static double areaCirculo (double radio){
	       return Math.pow(radio, 2)*Math.PI;
	}
	
	public static double areaTriangulo (double base, double altura){
	        return base*altura/2;
	}
	
	public static double areaCuadrado (double lado){
	        return lado*lado;
	}

	static int menu(int tope_op, Scanner sc)
	{
		int opcion_menu;
		
		System.out.println();
	    System.out.println("\t1. Área del círculo");
		System.out.println("\t2. Área del triángulo");
		System.out.println("\t3. Área del cuadrado");
		System.out.println("\t4. Salir.");
		do
		{
			System.out.print("\n\n\tElija opcion:");
			opcion_menu=sc.nextInt();
		} while (opcion_menu  < 1 || opcion_menu > tope_op);
		
	    return opcion_menu;
	}
	
	public static void main(String args[]){
		
	   int opcion=0;
	   
	   Scanner sc = new Scanner(System.in);
	   
	   double radio, base, altura, lado;
	  
	   while (opcion != MAX_OPC)
		{
			opcion = menu(MAX_OPC, sc);
			switch (opcion)
	      	{
	         case 1:
	        	 	 System.out.print("Indica el valor del radio: ");
	 				 radio = sc.nextDouble();
	 				 
	 				 System.out.print("El área del círculo de radio "+ radio + " es ");
	                 System.out.println(areaCirculo(radio));
	                 break;
	         case 2:
	        	 	 System.out.print("Indica el valor de la base: ");
	        	 	 base = sc.nextDouble();
	        	 	 System.out.print("Indica el valor de la altura: ");
	        	 	 altura = sc.nextDouble(); 	 
	        	 	 System.out.print("El área del triángulo de base "+ base + " y altura " + altura + " es ");
	                 System.out.println(areaTriangulo(base, altura));
	                 break;
	         case 3:
		        	 System.out.print("Indica el valor del lado: ");
	        	 	 lado = sc.nextDouble();
	        	 	 System.out.print("El área del cuadrado de lado "+ lado + " es ");
	                 System.out.println(areaCuadrado(lado));
		             break;
	     	}
	     }
	     sc.close();
	   }
	
}
