package funciones1;

import java.util.Scanner;
public class F2
{
    public static void main(String[] args)
    {
    	Scanner teclado;
    	teclado = new Scanner(System.in);
        float num1,num2;
      
        System.out.println("Introducir numero 1");
        num1 = teclado.nextFloat();
        System.out.println("Introducir numero 2");
        num2 = teclado.nextFloat();
        teclado.close();
        sumar(num1, num2);
        restar(num1, num2);
        multiplicar(num1, num2);
        dividir(num1, num2);        
    }
    
    public static void sumar(float n1, float n2)
    {
        float suma;
 
        suma = n1 + n2;
 
        System.out.println("SUMA " + suma);
    }
    
    public static void restar(float n1, float n2)
    {
        float resta;
 
        resta = n1 - n2;
 
        System.out.println("RESTA " + resta);
    }
    
    public static void multiplicar(float n1, float n2)
    {
        float multiplicacion;
 
        multiplicacion = n1 * n2;
 
        System.out.println("MULTIPLICACION " + multiplicacion);
    }
    
    public static void dividir(float n1, float n2)
    {
        float division;
 
        division = n1 / n2;
 
        System.out.println("DIVISION " + division);
    }
    
}

