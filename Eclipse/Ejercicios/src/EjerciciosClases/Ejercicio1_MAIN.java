package EjerciciosClases;

public class Ejercicio1_MAIN {

	public static void main(String[] args) {
		Ejercicio1 obj1=new Ejercicio1(5,4); 
		System.out.print(obj1.modificar(4)+" "); 
		Ejercicio1 obj2=new Ejercicio1(5,4); 
		System.out.print(obj2.modificar(5)+ " "); 
		obj2=obj1; 
		System.out.print(obj2.modificar(5)+ " "); 


	}

}
