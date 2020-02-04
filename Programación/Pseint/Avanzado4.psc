Proceso Avanzado4
	Definir dias, horas, min, acum, minu Como real;
	Escribir "Dime los min";
	Leer min;
	dias <- trunc(min / 1440);
	acum <- min % 1440;
	horas <-trunc(acum / 60);
	minu <- acum % 60;
	Escribir "Dias:",dias ," Horas:",horas ," Minutos:",minu;
FinProceso
