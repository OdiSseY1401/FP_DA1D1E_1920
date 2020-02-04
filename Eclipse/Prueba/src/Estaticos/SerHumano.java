package Estaticos;

public class SerHumano {
	String nombre;
	String colorOjos;
	int edad;
	static String planeta="Tierra";
	
	void mostrarCaracteristicas(){
		System.out.println(nombre+" tiene "+edad+" años");
		System.out.println("Sus ojos son "+colorOjos);
		System.out.println("Su planeta es "+planeta);
	}
	
	void esMayorEdad(){
		if(edad>=18){
			System.out.println(nombre+" es mayor de edad");
			System.out.println("Tiene "+edad+" años");
		}
		else{
			System.out.println(nombre+" es menor de edad");
			System.out.println("Tiene "+edad+" años ");
		}
	}
	public static void main(String args[]){
		SerHumano sh1=new SerHumano ();
		sh1.nombre="Jesus";
		sh1.colorOjos="azules";
		sh1.edad=28;
		sh1.mostrarCaracteristicas();
		sh1.esMayorEdad();
		
		System.out.println("---------------------");
		SerHumano sh2=new SerHumano ();
		sh2.nombre="Rebeca";
		sh2.colorOjos="verdes";
		sh2.edad=27;
		sh2.mostrarCaracteristicas();
		sh2.esMayorEdad();
		
		sh1.planeta="Marte";	//De esta manera, cambia planeta para todos (forma mala, por objeto)
		SerHumano.planeta="Marte";	//De esta manera, cambia planeta para todos (forma buena, por clase)
		
		sh1.mostrarCaracteristicas();
		sh2.mostrarCaracteristicas();
		
		System.out.println("---------------------");
		System.out.println("FIN DEL PROGRAMA");
	}
}
