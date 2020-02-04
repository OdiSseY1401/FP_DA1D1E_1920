package basicos1;

import java.util.*;
public class Ej6 {
  public static void main(String[] args){
	  Scanner teclado=new Scanner(System.in);
	  double a,b,c;
	  double d,x1,x2;
	  System.out.println("Introducir el valor del termino a");
	  a=teclado.nextDouble();
	
	  System.out.println("Introducir el valor del termino b");
	  b=teclado.nextDouble();
	  
	  System.out.println("Introducir el valor del termino c");
	  c=teclado.nextDouble();
	  
	  d=b*b-4*a*c;
	  
	  if(d<0)
		System.out.println("Raiz negativa, soluciones complejas");
	  else if (d==0){
		     x1=-b/(2*a);
		     System.out.println("El sistema solo tiene una solucion x= "+x1);
	  }
	  else{
	    	x1=(-b+Math.sqrt(d))/(2*a);
	    	x2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("El sistema tiene dos soluciones x1= "+x1+" y x2= "+x2);
	  }

	  teclado.close();
  }
}

