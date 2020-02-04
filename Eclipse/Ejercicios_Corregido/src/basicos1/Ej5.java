package basicos1;

import java.util.Scanner;
public class Ej5 {
  public static void main(String[] args){
	  Scanner teclado=new Scanner(System.in);
	  int d,m,a;
	  
	  do{
	    System.out.println("Introducir dia");
	    d=teclado.nextInt();
	  } while(d<1 || d>31);
	  
	  do{
	    System.out.println("Introducir mes");
	    m=teclado.nextInt();
	  } while(m<1 || m>12);
	  
	  System.out.println("Introducir anio");
	  a=teclado.nextInt();
	  
	  switch(m){
	    case 2: if(d<28){
	              d++;
	              System.out.println("El dia siguiente es: "+d+"-"+m+"-"+a);
	            }
	    		else if(d==28) {
	            	    if (a%4==0 && (a%100 != 0 || a%400==0))
	            	    	d++;
	            	    else {
	            	    	d=1;
	            	    	m++;
	            	    }
	            	    System.out.println("El dia siguiente es: "+d+"-"+m+"-"+a);
	            }
	            else if(d==29) {
	                	      if((a%4==0 && a%100!=0)||(a%4==0 && a%100==0 && a%400==0)){
	                	    		  d=1;
	   	            	    	      m++;
	   	            	    	     System.out.println("El dia siguiente es: "+d+"-"+m+"-"+a);
	                	      }
	                	      else
	                	    	  System.out.println("Este año este mes no tiene este numero de dias");
	   	            	      
	                      }
	                      else
	                    	  System.out.println("Este mes no tiene este numero de dias");
	                      break;
	    case 1:
	    case 3:
	    case 5:
	    case 7:
	    case 8:
	    case 10:
	    case 12: if (d<31)
	    	       d++;
	             else { // Más de 31 días no se admiten en el programa en la entrada
	            	d=1;
	            	m++;
	            	if(m==13) {
	            		m=1;
	            		a++;
	            	}
	             }
	             System.out.println("El dia siguiente es: "+d+"-"+m+"-"+a);
	             break;
	    case 4:
	    case 6:
	    case 9:
	    case 11: if (d<30) {
 	               d++;
 	               System.out.println("El dia siguiente es: "+d+"-"+m+"-"+a);
	             } else if (d==30) {
       	               d=1;
       	               m++;
       	               System.out.println("El dia siguiente es: "+d+"-"+m+"-"+a);
       	          	  }
                 else
                	 System.out.println("Este mes no tiene 31 dias");
                 break; 

	   }
      teclado.close();
	 }
}
