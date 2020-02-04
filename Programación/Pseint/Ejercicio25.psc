Proceso Ejercicio25
	Definir num, acum, top Como Entero;
	Escribir "Dime hasta donde quieres calcular";
	Leer top;
	num <- 0;
	acum <-0; 
	Repetir
		num <- num + 1;
		acum <- num + acum;
	Hasta Que num = top;
	Escribir "La suma de todos los números es: ", acum; 
FinProceso
