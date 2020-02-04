package explicacion;

public class Printf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.printf("%.2f %n",12.3698); //Redondea la cifra
		
		
		double n=1.25036;
		System.out.printf("%.3f %n", n); //redondea a 3
		System.out.printf("%+.3f %n", n); //redondea a 3, el + saca un + cuando es positivo
		
		int x=10;
		System.out.printf("%d %n", x); //igual, pero la d son enteros
		System.out.printf("%+d %n", x); //igual pero la d son enteros
		
		
		
		n=1.25036;
		x=10;
		System.out.printf("n = %.2f x=%d %n", n, x);
		System.out.printf("n = %1$.2f x=%2$d %n", n, x);
		
		
		
		int uno=1, dos =2;
		System.out.printf("uno = %1$d dos = %2$d %n", uno, dos); //te muestra las posiciones con el 1/2$
		System.out.printf("dos = %2$d uno = %1$d %n", uno, dos);
		System.out.printf("dos = %d uno = %d %n", uno, dos); //al no tener 1/2$ lo pilla en el orden del final
		
		
		
		n = 123.4567;
		System.out.printf("El cuadrado de %1.2f es %.2f\n", n, n*n);
		System.out.printf("El cuadrado de %1.2e es %.2e\n", n, n*n); //anotación cientifica
		
		
		
		n =1.25036;
		System.out.printf("%+10.2f %n", n); //rellena con espacios hasta que el ultimo digito este en la posicion 10
		System.out.printf("%+010.2f %n", n); // rellena con 0 hasta que el ultimo digito este en la posicion 10
		
		
		
		double precio=1.22;
		System.out.printf("%10.2f %n", precio);
		
		System.out.printf("FIN");
		System.out.printf("%-10s","Total:"); //Se alinea a la izquierda, dejando dos espacios a la derecha
		
		System.out.printf("FIN");
		System.out.printf("%10s", "Total:"); //Se alinea a la derecha, dejando dos espacios a la izquierda
		
		System.out.printf("FIN");
		
	}

}
