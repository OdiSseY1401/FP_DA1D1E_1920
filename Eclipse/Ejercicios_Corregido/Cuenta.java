package menu;
import javax.swing.*;
public class Cuenta {
	
	private String nombre;
	private String apellido;
	private String dni;
	public static int nrCuentaCont = 0;
	private int nrCuenta;
	private double dinero;
	
	public Cuenta()
	{
		nrCuenta = nrCuentaCont;
		nrCuentaCont++;
	}
	
	public Cuenta(String nombre, String apellido, String dni, double dinero)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.dinero = dinero;
		nrCuenta = nrCuentaCont;
		nrCuentaCont++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	
	public static int getNrCuentaCont() {
		return nrCuentaCont;
	}

	public static void setNrCuentaCont(int nrCuentaCont) {
		Cuenta.nrCuentaCont = nrCuentaCont;
	}

	public int getNrCuenta() {
		return nrCuenta;
	}

	public void setNrCuenta(int nrCuenta) {
		this.nrCuenta = nrCuenta;
	}
	
	public void mostrarInfo()
	{
		JOptionPane.showMessageDialog(null, "Nombre: " + getNombre() + "\n" + "Apellido: " + getApellido() + "\n" + "DNI/NIE: " + getDni() + "\n" + "Saldo: " + getDinero() + "\n"
		+ "Número Cuenta: " + (getNrCuenta()+1), "Resumen cuenta: " + (getNrCuenta()+1), JOptionPane.INFORMATION_MESSAGE);
	}
	

	public void ingresar(double dinero)
	{
		this.dinero += dinero;
	}
	
	public void sacar(double dinero)
	{	

		if(this.dinero < dinero)
		{
			
			while(this.dinero < dinero) 
			{
				String dineroS = JOptionPane.showInputDialog(null, "No dispone de suficiente saldo" + "\n" + "¿Desea Introducir otra Cantidad?", "Saldo: " + getDinero(), JOptionPane.WARNING_MESSAGE);
				dinero = Double.parseDouble(dineroS);
			}
			this.dinero -= dinero;
			
		}
		else
		{
			this.dinero -= dinero;
		}
		
	}
	
	
	
	
}