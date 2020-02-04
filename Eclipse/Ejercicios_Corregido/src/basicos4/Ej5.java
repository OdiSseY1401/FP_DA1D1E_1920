package basicos4;

import java.util.Scanner;
public class Ej5 {
	public static void main(String[] args) {
		 Scanner teclado=new Scanner(System.in);
		 int n;
		 do{
		  System.out.println("Introducir numero");
		  n=teclado.nextInt();
		 }while(n<1 || n>10);
		 
		 for(int i=0;i<n;i++){
			 for(int j=i;j<n;j++)
			   System.out.print(j+" ");
			 System.out.println();
		 }
		 
		 teclado.close();
	}
}