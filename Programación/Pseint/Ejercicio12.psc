Proceso Ejercicio12
	Definir num1, num2 Como Real;
	
	Escribir "Dime un numero";
	Leer num1;
	Escribir "Dime un numero";
	Leer num2;
	

	Escribir "El numero uno es: " , num1;
	Escribir "El numero dos es: " , num2;
	Si num1 > num2 Entonces
		Escribir "El numero uno es m�s grande";
	SiNo
		Si num1 < num2 Entonces
			Escribir "El numero dos es m�s grande";
		SiNo
			Escribir "Los dos numeros son iguales";
		FinSi
		
	FinSi
	
FinProceso
