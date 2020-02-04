package explicacion;

public class RecorrerColumnas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NF=2, NC=5;
		int [][] matrizA = new int[NF][NC];
		System.out.println("La creamos por filas");
		crear(matrizA);
		System.out.println();
		System.out.println("Columnas");
		escribirC(matrizA);
		System.out.println();
		System.out.println("Alumnos");
		alumnos(matrizA);
		System.out.println();
		System.out.println("Alumnos (PROFE)");
		sumaPorModulo(matrizA);
		System.out.println();
	}

	static void crear (int[][] matriz) {
		for (int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length;j++) {
				matriz[i][j]=(int)(Math.random()*10);
				System.out.println(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	static void escribirC(int[][]matriz) {
		for (int j=0; j<matriz[0].length; j++) {
			for(int i=0; i<matriz.length;i++) {
				matriz[i][j]=(int)(Math.random()*10);
				//System.out.println(i + " " + j + " ");
				System.out.println(matriz[i][j] + " ");
				System.out.println();
			}
			System.out.println();
		}
	}	
	static void alumnos(int [][]matriz) {
		int alumnosTOT=0, alumnosCOL=0;
		for (int j=0; j<matriz[0].length; j++) {
			for(int i=0; i<matriz.length;i++) {
				alumnosCOL=alumnosCOL+matriz[i][j];
			}
			System.out.println("Columna: "+ j + " " + "Alumnos: " +  alumnosCOL);
			alumnosTOT=alumnosTOT + alumnosCOL;
			alumnosCOL=0;
		}
		System.out.println("Alumnos totales: " + alumnosTOT);
	}
	
	public static void sumaPorModulo (int [][]matriz) {
		int nalum=0;
		for (int j=0; j<matriz[0].length; j++) {
			for(int i=0; i<matriz.length;i++) {
				try {
					nalum += matriz[i][j];
				} catch (ArrayIndexOutOfBoundsException e) {
					nalum+=0;
				}
			}
			System.out.println("En el modulo" + (j+1) + " hay " + nalum + " alumnos matriculados");
			nalum=0;
		}
	}
}
