Proceso Ejercicio17
	Definir num1, num2, num3 Como Real;
	Escribir "Dime un n�mero";
	Leer num1;
	Escribir "Dime un n�mero";
	Leer num2;
	Escribir "Dime un n�mero";
	Leer num3;
	
	Si num1 < 0 Entonces
		Escribir "El primer n�mero es negativo, asi que se multiplica, y el resultado ser�: ", num1 * num2 * num3;
	SiNo
		Escribir "El primer n�mero NO es negativo, asi que se suma, y el resultado ser�: ", num1 + num2 + num3;
	FinSi
FinProceso
