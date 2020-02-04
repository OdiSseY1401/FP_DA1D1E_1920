Proceso Ejercicio17
	Definir num1, num2, num3 Como Real;
	Escribir "Dime un número";
	Leer num1;
	Escribir "Dime un número";
	Leer num2;
	Escribir "Dime un número";
	Leer num3;
	
	Si num1 < 0 Entonces
		Escribir "El primer número es negativo, asi que se multiplica, y el resultado será: ", num1 * num2 * num3;
	SiNo
		Escribir "El primer número NO es negativo, asi que se suma, y el resultado será: ", num1 + num2 + num3;
	FinSi
FinProceso
