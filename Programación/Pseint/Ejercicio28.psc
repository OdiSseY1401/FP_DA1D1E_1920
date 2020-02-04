Proceso Ejercicio28
	Definir trabaj, horas, salario, x, acum, salario_fin1, salario_fin2, horas_ex, horas_obli, salario_ex Como Entero;
	Escribir "Dime cuantos trabajadores hay: ";
	Leer trabaj;
	Escribir "Dime el salario/hora: ";
	Leer salario;
	x <- 0;
	acum <- 0;
	salario_ex <- salario * 1.5;
	horas_obli <- 40;
	Repetir
		Escribir "Dime las horas que trabajas: ";
		Leer horas;
		horas_ex <- horas - horas_obli;
		salario_fin1 <- (horas_ex * salario_ex) + (salario * horas_obli);
		salario_fin2 <- salario * horas;
		Si horas > horas_obli Entonces
			Escribir "Tienes que cobrar un 50% más, tu sueldo será ", salario_fin1;
			acum <- salario_fin1 + acum;
			x <- x + 1;
		SiNo
			Escribir "Tu sueldo será de: ", salario_fin2;
			acum <- salario_fin2 + acum;
			x <- x + 1;
		FinSi
	Hasta Que x = trabaj;
	Escribir "El salario total del grupo es de: ", acum;
FinProceso
