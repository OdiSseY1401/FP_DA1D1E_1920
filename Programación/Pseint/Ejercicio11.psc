Proceso Ejercicio11
	Definir altura1, altura2, base1, base2, area1, area2 Como Real;
	
	Escribir "Dime la altura del primer triángulo";
	Leer altura1;
	Escribir "Dime la base del primer triángulo";
	Leer base1;
	Escribir "Dime la altura del segundo triángulo";
	Leer altura2;
	Escribir "Dime la base del segundo triángulo";
	Leer base2;
	
	area1 <- (base1*altura1) / 2;
	
	area2 <- (base2*altura2) / 2;
	
	Escribir "El area del primer triángulo es: " , area1;
	Escribir "El area del segundo triángulo es: " , area2;
	Si area1 > area2 Entonces
		Escribir "El primer triangulo tiene el área más grande";
	SiNo
		Si area1 < area2 Entonces
			Escribir "El segundo triangulo tiene el área más grande";
		SiNo
			Escribir "Las areas de los dos triángulos son iguales";
		FinSi
		
	FinSi
	
FinProceso
