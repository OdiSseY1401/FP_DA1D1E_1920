Proceso Ejercicio19
	Definir ninio, ninia, total, porcentaje1, porcentaje2 Como Real;
	Escribir "Dime el n�mero de ninios en clase";
	Leer ninio;
	Escribir "Dime el n�mero de ninias en clase";
	Leer ninia;
	total <- ninio + ninia;
	porcentaje1<- ninio * 100;
	porcentaje2 <- ninia *100;
	
	Si total > 0 Entonces
		Escribir "El porcentaje de los ninios ser�: ", porcentaje1 / total,"%", " El porcentaje de ninias es de: ", porcentaje2 / total, "%";
	
	FinSi
	
FinProceso
