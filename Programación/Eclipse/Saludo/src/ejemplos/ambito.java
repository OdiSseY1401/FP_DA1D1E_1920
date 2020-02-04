package ejemplos; 
public class ambito { 
static int variableGlobal; 

public static void main(String[] args) { 
	int variableDelMain = 10; 
	/*Aquí se pueden usar variableGlobal y 
	variableDelMain. No se puede usar 
	variableDeOtroMetodo */ 
	System.out.println("variableGlobal " + variableGlobal);
	System.out.println("variableDelMain " + variableDelMain);
	otroMetodo();
	System.out.println("Vuelvo al main desde el otoMetodo");
	otroMetodo2();
	System.out.println("Vuelvo al main desde el otoMetodo2");
} 

static void otroMetodo() { 
	int variableDeOtroMetodo=90; 
	/* Aquí se pueden usar variableGlobal y 
	variableDeOtroMetodo. No se puede usar 
	variableDelMain */
	System.out.println("variableGlobal " + variableGlobal);
	//System.out.println("variableDelMain " + variableDelMain);
	System.out.println("variableDeOtroMetodo " + variableDeOtroMetodo);
	otroMetodo2();
} 

static void otroMetodo2() { 
	System.out.println("Ejecutandose otroMetodo2  ");
} 

}
