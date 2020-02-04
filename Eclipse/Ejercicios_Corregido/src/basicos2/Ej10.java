package basicos2;
import java.util.*;
public class Ej10 {
 public static void main(String[] args) {
	 Scanner teclado=new Scanner(System.in);
	 int n1,n2,coc=0,resto,aux;
	 
		System.out.println("Introducir primer numero");
		n1=teclado.nextInt();
		System.out.println("Introducir segundo numero");
		n2=teclado.nextInt();
		if(n1<n2){
			aux=n1;
			n1=n2;
			n2=aux;
		}
		resto=n1;
		while(resto>=n2){
			resto=resto-n2;
			coc++;
		}
		System.out.println("El cociente entre "+n1+" y "+n2+" es "+coc+" y el resto "+resto); 
		
		teclado.close();	
      }
	}