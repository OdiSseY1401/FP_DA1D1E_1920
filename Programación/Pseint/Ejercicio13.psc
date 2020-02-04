Proceso Ejercicio13
	Definir horas, sueldo, sueldo_ex, horas_ex, horas_obli Como Real;
	
	Escribir "Dime las horas que has trabajas: ";
	Leer horas;
	Escribir "Dime tu sueldo por hora: ";
	Leer sueldo;
	Escribir "Dime las horas obligatorias que haces: ";
	Leer horas_obli;
	
	sueldo_ex <- sueldo * 1.5;
	horas_ex <- horas - horas_obli;
	
	Si horas > horas_obli Entonces
		Escribir "Tienes que cobrar un 50% más, tu sueldo será ", (horas_ex * sueldo_ex) + (sueldo * horas_obli);
	SiNo
		Escribir "Tu sueldo será de: ", sueldo * horas;
	FinSi
	
FinProceso
