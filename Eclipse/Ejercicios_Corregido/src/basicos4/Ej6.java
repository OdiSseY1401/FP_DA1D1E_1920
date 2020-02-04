package basicos4;
import java.util.Scanner;
public class Ej6 {
 public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	double e1,e2,e3,nf=6.0,nl;
	
	System.out.println("Introducir nota 1");
	e1=teclado.nextDouble();
	System.out.println("Introducir nota 2");
	e2=teclado.nextDouble();
	System.out.println("Introducir nota laboratorio");
	nl=teclado.nextDouble();
	teclado.close();
	
	e3=(3*nf-0.7*(e1+e2)-0.3*3*nl)/0.7;	
	System.out.println("Para sacar un 6 nota final en el examen 3 tienes que sacar un  "+e3);
	
	e3 = 3*((nf - nl*0.3)/0.7) - e1 - e2;
	e3 = ajustarDecimales(e3, 1);
		
	System.out.println("Para sacar un 6 nota final en el examen 3 tienes que sacar un  "+e3);
			
 }
 
 public static double ajustarDecimales(double n, int nd) {
	 return(double)Math.round(n*Math.pow(10, nd))/Math.pow(10, nd);
 }
}