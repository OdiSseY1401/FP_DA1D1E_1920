package basicos4;
import java.util.Scanner;
public class Ej4 {
	public static void main(String[] args) {
		 Scanner teclado=new Scanner(System.in);
		 int n,cont=1,max;
		 System.out.println("Introducir numero");
		 n=teclado.nextInt();
		 max=n;
		 while(n>=0){
			 if(n>max){
			    max=n;
			    cont=1;
			 }
			 else if(n==max)
			        cont++;
			 System.out.println("Introducir numero");
			 n=teclado.nextInt();
		 }
		 teclado.close();
		 System.out.println("En numero mayor introducido es "+max+" y se ha repetido "+cont+" veces"); 
}
}
