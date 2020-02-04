package explicacion;

public class ParametroEnMetodos {
static int miGlobal=19;
	public static void main(String[] args) {
		/*
		modificarGlobal1(miGlobal);
		System.out.println("Valor de miGlobal tras modificarGlobal1 " + miGlobal);
		System.out.println("");
		
		modificarGlobal2();
		System.out.println("Valor d miGlobal tras modificarGlobal2 " + miGlobal);
		System.out.println("");

		
		int p=9;
		//
		modificar1(p);
		System.out.println("Valor de p tras modificar 1 " + p);
		System.out.println("");
		
		p=modificar2(p);
		System.out.println("Valor de p tras modificar 2 " + p);
		System.out.println("");
		*/
		
		int [] array= {9,4};
		System.out.println("Valor de array tras modificarA1" + array);
		escribirArray(array);
		System.out.println();
		
		array=modificarA2(array);
		System.out.println("Valor de array tras modificarA2" + array);
		escribirArray(array);
		System.out.println();
		
		int[] aDoble;
		aDoble=crearArrayDoble(array);
		System.out.println("Valor de aDoble " + aDoble);
	}

	public static void modificarGlobal1 (int v) {
		System.out.println("Valor de v dentro del método antes de mod " + v);
		v += 100;
		System.out.println("Valor de v dentro del método después de mod " + v);
	}
	
	public static void modificarGlobal2 () {
		System.out.println("Valor de v dentro del método antes de mod " + miGlobal);
		miGlobal += 100;
		System.out.println("Valor de v dentro del método después de mod " + miGlobal);
	}
	
	public static void modificar1 (int v) {
		System.out.println("Valor de v dentro del método antes de mod " + v);
		v += 100;
		System.out.println("Valor de v dentro del método después de mod " + v);
	}
	
	public static int modificar2 (int v) {
		System.out.println("Valor de v dentro del método antes de mod " + v);
		v += 100;
		System.out.println("Valor de v dentro del método después de mod " + v);
		return v;
	}
	
	static void escribirArray(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i] + " ");
		}
	}
	
	public static void modificarA1(int[] v) {
		System.out.println("Valor de v dentro del método antes " + v);
		for(int i=0;i<v.length;i++) {
			v[i] +=100;
			System.out.println("Valor de v dentro del método después " + v);
		}
	}
	
	public static int[] modificarA2(int[] v) {
		System.out.println("Valor de v dentro del método antes " + v);
		for(int i=0;i<v.length;i++) {
			v[i] +=100;
			System.out.println("Valor de v dentro del método después " + v);
		}
		return v;
	}
	
	public static int[] crearArrayDoble(int[] v) {
		int [] array2 = new int[v.length];
		
		System.out.println("Valor de v dentro del metodo " + v);
		for (int i=0; i<v.length;i++) {
			array2[i]= v[i] * 2; 
			System.out.println("Valor de array2 en dentro del metodo " +  array2);
		}
		return array2;
	}
}

