Proceso Avanzado2
	Definir sueldo1, sueldo2, sueldo_to Como Entero;
	Escribir "Dime tu sueldo: ";
	Leer sueldo1;
	
	Si sueldo1 <= 1000 Entonces
		sueldo2 <- sueldo1 * 0.1;
		sueldo_to <- sueldo1 -sueldo2; 
		Escribir "Tu sueldo es de: ", sueldo_to;
	SiNo
		Si (sueldo1 > 1000) & (sueldo1 <= 2000) Entonces
			sueldo2 <- sueldo1 * 0.05;
			sueldo_to <- sueldo1 - sueldo2; 
			Escribir "Tu sueldo es de: ", sueldo_to;
		SiNo
			Si sueldo1 > 2000 Entonces
				sueldo2 <- sueldo1 * 0.03;
				sueldo_to <- sueldo1 -sueldo2; 
				Escribir "Tu sueldo es de: ",sueldo_to;
			FinSi
		FinSi
	FinSi
FinProceso
