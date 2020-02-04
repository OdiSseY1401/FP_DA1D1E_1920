package basicos1;


import java.util.Scanner;
public class Ej7_1 {
  public static void main(String[] args){
	  int nTerminos;
	  Scanner teclado=new Scanner(System.in);
	  int suma=0,num,i;
	  
	  System.out.println("Introduce términos a sumar");
	  nTerminos=teclado.nextInt();
	  i=1;
	  
	  while(i<=nTerminos){
	    System.out.println("Introducir numero");
	    num=teclado.nextInt();
	    suma+=num;
	    i++;
	  }
	  
	  if (nTerminos != 0)
		  System.out.println("La suma de los " + nTerminos + " numeros es "+suma);
	  
	  teclado.close();
   }
}
