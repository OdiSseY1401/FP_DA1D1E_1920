Proceso Ejercicio23
	
	Definir num Como real;
	
	Escribir "Dime un numero";
	Leer num;
	
	Mientras num <= 0 Hacer
		Escribir "Dime un numero";
		Leer num;
	FinMientras
	
	Si (num MOD 2=0) Entonces
		Escribir "Tu numero es par";
	SiNo
		Escribir "Tu número es impar";
	FinSi
	
FinProceso
