Proceso Ejercicio16
	Definir num1, num2, num3 Como Real;
	Escribir "Dime un n�mero";
	Leer num1;
	Escribir "Dime un n�mero";
	Leer num2;
	Escribir "Dime un n�mero";
	Leer num3;
	Si (num1 > num2) Y (num1 > num3) Entonces
		Escribir "El primer n�mero es el mayor";
	SiNo
		Si num2 > num3 Entonces
			Escribir "El segundo n�mero es el mayor";
		SiNo
			Escribir "El tercer n�mero es el mayor";
		FinSi
	FinSi
FinProceso
