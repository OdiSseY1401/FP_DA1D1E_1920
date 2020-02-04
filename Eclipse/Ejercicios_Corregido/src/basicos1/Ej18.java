package basicos1;

import java.util.Scanner;
public class Ej18 {
  public static void main(String[] args){
	  Scanner teclado=new Scanner(System.in);
	  int salario,nhijos;
	  double conIrpf, salConDescuento;
	  //salConDescuento es la base imponible
	  
	  System.out.println("Introducir salario, 0 para acabar");
	  salario=teclado.nextInt();
	  
	  while(salario!=0) {
		  System.out.println("Introducir numero de hijos");
		  nhijos=teclado.nextInt(); 
		  if(nhijos<=0)
			  salConDescuento=salario;
		  else if (nhijos<=2)
			  salConDescuento=salario*95/100;
		  else
			  salConDescuento=salario*85/100;
	      
		  System.out.println("Base imponible "+salConDescuento);
		  conIrpf=salConDescuento*15/100;
		  
	      System.out.println("Tiene que pagar "+conIrpf+" euros");
		  System.out.println("Introducir salario, 0 para acabar");
		  salario=teclado.nextInt();  
	  }
	  
	  teclado.close();
   }
}
