Proceso ejemplo4
	Definir num1, num2, suma, resta, producto, division como reales;
	Definir mensaje como cadena;
	
	Escribir "Pon un numero y pulsa INTRO";
	
	Leer  num1;
	
	Escribir "Pon otro numero y pulsa INTRO";
	
	Leer num2;
	
	suma <- num1 + num2;
	
	mensaje <- "Suma:" + ConvertirATexto(suma);
	Escribir mensaje;
	
	resta <- num1 - num2;
	
	mensaje <- "Resta:" + ConvertirATexto(resta);
	Escribir mensaje;
	
	producto <- num1 * num2;

	mensaje <- "Producto:" + ConvertirATexto(producto);
	Escribir mensaje;
	
	division <- num1 / num2;
	
	mensaje <- "Division:" + ConvertirATexto(division);
	Escribir mensaje;
	
FinProceso
