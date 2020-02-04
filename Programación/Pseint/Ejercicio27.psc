Proceso Ejercicio27
	Definir trabaj, horas, salario, x, acum, salario_fin Como Entero;
	Escribir "Dime cuantos trabajadores hay: ";
	Leer trabaj;
	Escribir "Dime el salario/hora: ";
	Leer salario;
	x <- 0;
	acum <- 0;
	Repetir
		Escribir "Dime las horas que trabajas: ";
		Leer horas; 
		Escribir "Trabajas: ", horas, "horas";
		salario_fin <- horas * salario;
		Escribir "Ganará en total el trabajador: ", salario_fin;
		acum <- salario_fin + acum;
		x <- x + 1;
	Hasta Que x = trabaj;
	Escribir "El salario total del grupo es de: ", acum;
FinProceso
