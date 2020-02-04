package EjerciciosBasicos4;
import java.util.*;
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.println("Dime un número:");
		num=teclado.nextInt();	
		
		while(num <=0 || num > 258) {
			System.out.println("Dime un número:");
			num=teclado.nextInt();
		}
		teclado.close();
		secuencia(num);
	}

	public static void secuencia (int n) {
		int sol=0, cont=1;
		String solS, sec="", nS;
		nS = Integer.toString(n);
		sec = sec.concat(nS + " -> ");
		while (cont < n) {
			sol=cont;
			while (sol > 1) {
				if(sol == 1) {
					sec=("*");
				}
				else if (sol%2==0) {
					sol=sol/2;
					sec = sec.concat("*") ;
				}
				
				else {
					sol=sol*3+1;
					sec = sec.concat("*") ;
				}
				cont ++;	
			}
			solS=Integer.toString(sol);
			solS=solS.concat(sec);
			System.out.println(solS);
			sec="";
			solS="";
		}
	}
}
