package Explicacion;

public class DepurarMola {
		//Atributos
		int a1;
		int a2;
		int blabla;
		
		//Constructor por defecto, se llama cuando creamos un objeto
		//de la clase, sirve para inicializar los atributos :)
		public DepurarMola() {
			a1 = 5;
			a2 = 10;
			blabla = 20;
		}
			
		public void setA1(int _a1) {
			a1 = _a1;
		}
		public int getA1() {
			return a1;
		}
		public void setA2(int _a2) {
			a2 = _a2;
		}
		public int getA2() {
			return a2;
		}
		
		public void setBla(int _bla) {
			blabla = _bla;
		}
		public int getBla() {
			return blabla;
		}
		
		public void mostrarInfo() {
			System.out.println(getA1());
			System.out.println(getA2());
			System.out.println(getBla());
		}
	}
