Proceso OrdenasDosNumeros
	//area de declaracion de variables y constante
	Definir num1, num2, temp Como Entero;
	Escribir "Ingrese el primer numero";
	Leer num1;
	Escribir "Ingrese el segundo numero:";
leer num2;
Si num1 > num2 Entonces
temp <- num1;
num1 <- num2;
num2 <- temp;
FinSi
Escribir "Los números ordenados de forma ascendente son: ", num1, " y ", num2;
	
FinProceso
