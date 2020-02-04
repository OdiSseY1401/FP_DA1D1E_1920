package basicos4;
import java.util.Scanner;
public class Ej1 {
	public static void main(String[] args) {
		 Scanner teclado=new Scanner(System.in);
		 int n,cont=0;
		 System.out.println("Introducir numero");
		 n=teclado.nextInt();
		 while(n >= 0){
			 cont++;
			 System.out.println("Introducir numero");
			 n=teclado.nextInt();
		 }
		 teclado.close();
		 System.out.println("Se ha introducido "+cont+" numeros"); 
}
}
