package EjerciciosClases3;

import javax.swing.*;

public class Ejercicio1_MAIN {
	
public static void main(String[] args) {
	int numero_emple=Integer.parseInt(JOptionPane.showInputDialog("�Cuantos empleados hay?"));
	String nombreEmple[]={"Pepe","Jose","Juan","Orson","Mario","Alejandro","Alberto","Benito","Chencho","Mapache"};
	String apellidoEmple[]= {"Botika","I�arritu","Ibarburu","MPalabra","Vaquerizo","El Capo","Morientes","Kamelas","La Escena","Acabalo"};
	
	
	Ejercicio1 [] empleado= new Ejercicio1[numero_emple];
	int cont=0;
	int contPlus=0;

	
	for (int i = 0; i < empleado.length; i++) {
		
		int nnombre=(int)(Math.random()*9)+1;
		
		int napellido=(int)(Math.random()*9)+1;
		
		int nedad=(int) Math.floor(Math.random()*(65-16+1)+16);
		
		int nsalario=(int) Math.floor(Math.random()*(4500-855+1)+855);	
		
		Ejercicio1 emple=new Ejercicio1(nombreEmple[nnombre],apellidoEmple[napellido],nedad,nsalario);
	
		cont++;
		System.out.println("El salario del empleado "+ emple.getNombre()+ " "+emple.getApellido()+" es "+emple.getSalario());
		
		if (emple.masDinero(emple.getSalario(), emple.getEdad())==true) {
			System.out.println("El empleado "+emple.getNombre()+" "+ emple.getApellido()+" puede tener un aumento de sueldo por tener mas de 40 a�os");
			
			contPlus++;
		}else {
			System.out.println("El empleado "+emple.getNombre()+" "+ emple.getApellido()+" no puede tener un aumento de sueldo por tener mas de 40 a�os");
		}
		System.out.println("Nombre: "+emple.getNombre()+" Apellido: "+emple.getApellido()+" Edad: "+ emple.getEdad()+" Salario: "+ emple.getSalario());
		
		System.out.println("");
	}

	System.out.println("El numero de empleados es "+cont );
	System.out.println("El numero de empleados a los que se les ha a�adido un plus en su salario es "+contPlus);
}	
}