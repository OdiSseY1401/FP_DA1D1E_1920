Proceso Ejercicio16
	Definir num1, num2, num3 Como Real;
	Escribir "Dime un número";
	Leer num1;
	Escribir "Dime un número";
	Leer num2;
	Escribir "Dime un número";
	Leer num3;
	Si (num1 > num2) Y (num1 > num3) Entonces
		Escribir "El primer número es el mayor";
	SiNo
		Si num2 > num3 Entonces
			Escribir "El segundo número es el mayor";
		SiNo
			Escribir "El tercer número es el mayor";
		FinSi
	FinSi
FinProceso
