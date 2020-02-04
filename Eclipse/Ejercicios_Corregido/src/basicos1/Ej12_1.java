package basicos1;

import java.util.Scanner;
public class Ej12_1 {
  public static void main(String[] args){
	  	Scanner teclado=new Scanner(System.in);
	  	int iva;
	  	double imp, subtotal=0, total=0, fact;
	  
	  	System.out.println("Introducir importe, 0 para acabar");
	  	imp=teclado.nextInt();
	  	while(imp!=0){
			System.out.println("Introducir el iva (4,10,21)");
			iva=teclado.nextInt(); 
			while (iva!=4 && iva!=10 && iva!=21) {
				System.out.println("El iva es erroneo debe introducir nuevamente los datos");
				System.out.println("Introducir el iva (4,10,21)");
				iva=teclado.nextInt(); 
			}
			
			subtotal=imp+imp*iva/100;
			total=total+subtotal;
	   
			System.out.println("Introducir importe, 0 para acabar");
			imp=teclado.nextInt();  
	   	}
	    
	  	if (total<1000)
		  fact=total;
	  	else if (total<10000)
		  fact=total*95/100;
		else
	      fact=total*90/100;
	 
		System.out.println("El importe total sin descuento es " + total);
		System.out.println("El total a pagar es " + fact);
		teclado.close();  
	 }
	  
	
   
}


