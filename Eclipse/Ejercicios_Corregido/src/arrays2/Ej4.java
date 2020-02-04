package arrays2;

import javax.swing.JOptionPane;

public class Ej4 {

	public static void main(String[] args) {
		//Declaramos como constante por lo que hay que dividir
		final int DIVISOR=23;
	
		int dni = leerDNI("Escribe los numero de tu DNI");
		
		System.out.println(calcularNIF(dni, DIVISOR)); 
		
		// Abreviando:
		// System.out.println(calcularNIF(leerDNI("Escribe los numero de tu DNI"), DIVISOR));
	}
	
	//Método para leer por teclado el número de DNI y calcular la letra
    public static int leerDNI(String texto) { 
    	int dni;
    	
        do      	
    		dni=Integer.parseInt(JOptionPane.showInputDialog(texto));
        while (dni <= 0);
        
        return dni;
    }
    
    public static String calcularNIF(int dni, int div) { 
  		//Invocamos el metodo
  		char letra=letraNIF(dni%div);
  		//Devolvemos el DNI completo
  		return String.valueOf(dni) + letra;
    }
    	
  		
	public static char letraNIF(int res){

		//Definimos el array de char
		char letrasNIF[]={'T', 'R', 'W', 'A', 'G', 'M', 'Y',
				          'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
				          'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

		//Devolvemos el valor en la posicion del array
		return letrasNIF[res];
	}
}