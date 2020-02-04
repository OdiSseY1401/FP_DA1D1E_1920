package menu;


import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {

		
		Cuenta[] usuario = new Cuenta[4];
		
		
		Menu(usuario);
		
	}
	
	
	public static void Menu(Cuenta[] usuario)
	{
		int opcion;
		int nrC = 0;
		
		do
		{
			String optionS = JOptionPane.showInputDialog(null, "1._ Crear Cuenta." + "\n" + "2._ Sacar Dinero." + "\n" + "3._ Ingresar Dinero." + "\n" + "4._ Mostrar Cuenta" + "\n" + "5._ Mostrar Todas." + "\n" + "0._ SALIR", "MENU", JOptionPane.QUESTION_MESSAGE);
			opcion = Integer.parseInt(optionS);	
			switch(opcion)
			{
			case 1:
					while(nrC < usuario.length)
					{
					CrearCuenta(usuario, nrC);
					nrC++;
					break;
					}
				break;
			case 2:
					if(nrC != 0)
					{
					String nrCuentasssS = JOptionPane.showInputDialog(null, "¿Desde que cuenta desea sacar dinero?" + "\n" + "Cuentas Disponibles: " + Cuenta.getNrCuentaCont(), "Sacar Dinero", JOptionPane.QUESTION_MESSAGE);
					int nrCuentasss = Integer.parseInt(nrCuentasssS)-1;
					SacarDinero(usuario, nrCuentasss);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "NO HAY CUENTAS DISPONIBLES!", "ERROR", JOptionPane.ERROR_MESSAGE );
					}
				break;
			case 3:
					if(nrC != 0)
					{
					String nrCuentassS = JOptionPane.showInputDialog(null, "¿A qué cuenta desea ingresar dinero?" + "\n" + "Cuentas Disponibles: " + Cuenta.getNrCuentaCont(), "Ingresar Dinero", JOptionPane.QUESTION_MESSAGE);
					int nrCuentass = Integer.parseInt(nrCuentassS)-1;
					IngresarDinero(usuario, nrCuentass);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "NO HAY CUENTAS DISPONIBLES!", "ERROR", JOptionPane.ERROR_MESSAGE );
					}
				break;
			case 4:	
					if(nrC != 0)
					{
					String nrCuentaS = JOptionPane.showInputDialog(null, "¿A qué cuenta desea acceder?" + "\n" + "Cuentas Disponibles: " + Cuenta.getNrCuentaCont(), "Cuenta", JOptionPane.QUESTION_MESSAGE);
					int nrCuenta = Integer.parseInt(nrCuentaS)-1;
					MostrarCuenta(usuario, nrCuenta);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "NO HAY CUENTAS DISPONIBLES!", "ERROR", JOptionPane.ERROR_MESSAGE );
					}
				break;
			case 5:
					if(nrC != 0)
					{
					MostrarTodas(usuario);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "NO HAY CUENTAS DISPONIBLES!", "ERROR", JOptionPane.ERROR_MESSAGE );
					}
				break;

			}
			
		}while(opcion != 0);
		
	}
	
	public static void CrearCuenta(Cuenta[] usuario,int nrC)
	{
		Cuenta cont = new Cuenta();
		usuario[nrC] = cont;
		usuario[nrC].setApellido(JOptionPane.showInputDialog(null, "Introduzca APELLIDO", "DATOS PERSONALES", JOptionPane.QUESTION_MESSAGE));
		usuario[nrC].setNombre(JOptionPane.showInputDialog(null, "Introduzca NOMBRE", "DATOS PERSONALES", JOptionPane.QUESTION_MESSAGE));
		usuario[nrC].setDni(JOptionPane.showInputDialog(null, "Introduzca DNI/NIE", "DATOS PERSONALES", JOptionPane.QUESTION_MESSAGE));
		String dineroS = JOptionPane.showInputDialog(null, "Introduzca Dinero en la Cuenta", "DATOS PERSONALES", JOptionPane.QUESTION_MESSAGE);
		double dinero = Double.parseDouble(dineroS);
		usuario[nrC].setDinero(dinero);
		
		
	}
	
	
	public static void SacarDinero(Cuenta[] usuario, int nrCuentasss)
	{
		String dineroS = JOptionPane.showInputDialog(null, "¿Qué cantidad de dinero desea sacar?" + "\n" + "Número de la Cuenta: " + (nrCuentasss+1), "Ingresar Dinero", JOptionPane.QUESTION_MESSAGE);
		double dinero = Double.parseDouble(dineroS);
		usuario[nrCuentasss].sacar(dinero);
	}
	
	
	public static void IngresarDinero(Cuenta[] usuario, int nrCuentass)
	{
		String dineroS = JOptionPane.showInputDialog(null, "¿Qué cantidad de dinero desea ingresar?" + "\n" + "Número de la Cuenta: " + (nrCuentass+1), "Ingresar Dinero", JOptionPane.QUESTION_MESSAGE);
		double dinero = Double.parseDouble(dineroS);
		usuario[nrCuentass].ingresar(dinero);
	}
	
	public static void MostrarCuenta(Cuenta[] usuario, int nrCuenta)
	{
		usuario[nrCuenta].mostrarInfo();
	}
	
	public static void MostrarTodas(Cuenta[] usuario)
	{
		for(int i = 0; i < usuario.length; i++)
		{
			usuario[i].mostrarInfo();
		}
	}

}

/*

Cuenta cont0 = new Cuenta();
Cuenta cont1 = new Cuenta();
Cuenta cont2 = new Cuenta();
Cuenta cont3 = new Cuenta();

usuario[0] = cont0;
usuario[1] = cont1;
usuario[2] = cont2;
usuario[3] = cont3;

*/