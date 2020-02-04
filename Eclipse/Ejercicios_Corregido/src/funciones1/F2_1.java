package funciones1;

import java.util.Scanner;
public class F2_1
{
  
    public static void main(String[] args)
    {
    	 Scanner teclado;
    	teclado = new Scanner(System.in);
        int numero1,numero2,opSuma,opResta,opMultiplicacion;
        float opDivision;
 
        numero1 = leerNumero(teclado, "NUMERO 1");
        numero2 = leerNumero(teclado, "NUMERO 2");
 
        opSuma = suma(numero1,numero2);
        opResta = resta(numero1,numero2);
        opMultiplicacion = multiplicacion(numero1,numero2);
        opDivision = division(numero1,numero2);
 
        imprimirRdos(opSuma,opResta,opMultiplicacion,opDivision);
    }
 
    public static int leerNumero(Scanner tec, String nombreNumero)
    {
        int numero;
 
        System.out.print("Indique el " + nombreNumero + " : ");
        numero = tec.nextInt();
 
        return numero;
    }
 
    public static int suma(int num1, int num2)
    { 
        return num1 + num2;
    }
    
    public static int resta(int num1, int num2)
    { 
        return num1 - num2;
    }
    
    public static int multiplicacion(int num1, int num2)
    { 
        return num1 * num2;
    }
    
    public static float division(int num1, int num2)
    { 
        return ((float)num1/num2);
    }
    
    public static void imprimirRdos(int s, int r, int m, float d)
    {
        System.out.println("Los resultados son : \n");
 
        System.out.println("suma : " + s);
        System.out.println("resta : " + r);
        System.out.println("multiplicacion : " + m);
        System.out.println("division : " + d);
    }
}
