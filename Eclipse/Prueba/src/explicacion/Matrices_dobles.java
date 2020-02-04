package explicacion;

public class Matrices_dobles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Creamos una matriz con sus filas iguales");
		int [][]ventas= new int [4][6];
		System.out.println(ventas[0]);
		System.out.println(ventas[1]);
		System.out.println(ventas[2]);
		System.out.println(ventas[3]);
		
		System.out.println("Numero de filas de la matriz ventas");
		System.out.println(ventas.length);
		
		System.out.println("Numero de columnas de la fila 1");
		System.out.println(ventas[0].length);
		System.out.println("Numero de columnas de la fila 2");
		System.out.println(ventas[1].length);
		System.out.println("Numero de columnas de la fila 3");
		System.out.println(ventas[2].length);
		System.out.println("Numero de columnas de la fila 4");
		System.out.println(ventas[3].length);
		
		System.out.println("--------------------------------------------------------------------");
		
		System.out.println("Creamos una matriz con sus filas desiguales");
		
		int [][] m= new int [3][];
		//Creamnos una matriz m de 3 filas sin especificar las columnas
		
		//A cada fila se le puede asignar un numero distinto de columnas
		
		m[0] = new int[3]; 
		m[1] = new int[5]; 
		m[2] = new int[2];

		System.out.println("Numero de filas de la matriz m");
		System.out.println(m.length);
		
		System.out.println("Numero de columnas de la fila 1");
		System.out.println(m[0].length);
		System.out.println("Numero de columnas de la fila 2");
		System.out.println(m[1].length);
		System.out.println("Numero de columnas de la fila 3");
		System.out.println(m[2].length);
		
		System.out.println("--------------------------------------------------------------------");
		
		int [][] numeros = {{6,7,5}, {3, 8, 4}, {1,0,2}, {9,5,2}}; 
		for (int i = 0; i < numeros.length; i++) { //número de filas
			for (int j = 0; j < numeros[i].length; j++) //número de columnas de cada fila 
			System.out.print(numeros[i][j] + " "); 
			System.out.println(); 
			}
		
		System.out.println("--------------------------------------------------------------------");

	}

}
