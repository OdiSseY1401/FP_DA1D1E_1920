Proceso Avanzado1
	Definir hora1, min1, hora2, min2, total1, total2 Como Entero;
	Escribir "Dime las horas en formato 24h: "; 
	Leer hora1;
	Escribir "Dime los minutos: "; 
	Leer min1;
	Escribir "Dime las horas en formato 24h: "; 
	Leer hora2;
	Escribir "Dime los minutos: "; 
	Leer min2;
	total1 <- hora1 * 60 + min1;
	total2 <- hora2 * 60 + min2;
	Si total1 > total2 Entonces
		Escribir "Esta es la diferencia:", hora1 - hora2,"h y ", min1 - min2, "min";
	SiNo
		Escribir "Esta es la diferencia:", hora2 - hora1,"h y ", min2 - min1, "min";
	FinSi
FinProceso
