Proceso Ejercicio11
	Definir altura1, altura2, base1, base2, area1, area2 Como Real;
	
	Escribir "Dime la altura del primer tri�ngulo";
	Leer altura1;
	Escribir "Dime la base del primer tri�ngulo";
	Leer base1;
	Escribir "Dime la altura del segundo tri�ngulo";
	Leer altura2;
	Escribir "Dime la base del segundo tri�ngulo";
	Leer base2;
	
	area1 <- (base1*altura1) / 2;
	
	area2 <- (base2*altura2) / 2;
	
	Escribir "El area del primer tri�ngulo es: " , area1;
	Escribir "El area del segundo tri�ngulo es: " , area2;
	Si area1 > area2 Entonces
		Escribir "El primer triangulo tiene el �rea m�s grande";
	SiNo
		Si area1 < area2 Entonces
			Escribir "El segundo triangulo tiene el �rea m�s grande";
		SiNo
			Escribir "Las areas de los dos tri�ngulos son iguales";
		FinSi
		
	FinSi
	
FinProceso
