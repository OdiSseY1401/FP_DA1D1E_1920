Proceso Ejercicio26
	Definir num, acum, top, max_top Como Entero;
	Escribir "Dime cuantos n�meros quieres calcular";
	Leer top;
	max_top <- top;
	top <- 0;
	num <- 0;
	acum <-0; 
	Repetir
		num <- num + 2;
		acum <- num + acum;
		top <- top + 1;
	Hasta Que top = max_top;
	Escribir "La suma de todos los n�meros es: ", acum; 
	
FinProceso
