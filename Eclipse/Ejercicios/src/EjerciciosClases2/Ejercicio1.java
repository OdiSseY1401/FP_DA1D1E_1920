package EjerciciosClases2;

public class Ejercicio1 {
	private String titulo, autor;
	private int ejemplares, prestados=0;
	
	public Ejercicio1 () {}
	
	public Ejercicio1 (String titulo, String autor, int ejemplares) {
		this.titulo=titulo;
		this.autor=autor;
		this.ejemplares=ejemplares;
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor=autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	public int getEjemplares() {
		return ejemplares;
	}
	public void setEjemplares(int ejemplares) {
		this.ejemplares=ejemplares;
	}
	public int getPrestados() {
		return prestados;
	}
	public void setPrestados(int prestados) {
		this.prestados=prestados;
	}
	public boolean prestamo() {
		boolean prestamo=false;
		if (ejemplares>0 && prestados!=ejemplares) {
			prestamo =true;
			prestados++;
		}
		return prestamo;
	}
	
	public boolean devolucion() {
		boolean devolucion=false;
		if (prestados > 0) {
			devolucion=true;
			prestados--;
		}
		return devolucion;
	}
	
	public String toString() {
		String cad="Titulo " + titulo + " autor " + autor + " ejemplares " + ejemplares + " prestados " + prestados;
		return cad;
	}
	
}
