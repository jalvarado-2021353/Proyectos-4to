package org.julioalvarado.menu;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 
public class MenuEjemplo {
	public static void main (String [] args){
	InputStreamReader convert = new InputStreamReader(System.in);
	BufferedReader entrada = new BufferedReader(convert);
	int centinela = 0;
	int numeroUno = 10;
	int numeroDos = 5;
	do{
		try{
			System.out.print("\nMenu");
			System.out.println("0. Salir");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplica");
			System.out.println("4. Divide");
			centinela = Integer.parseInt(entrada.readLine());
			switch(centinela){
				case 0:
					System.out.println("Ha elegido salir");
				break;
				case 1:
					System.out.println("Suma: " + (numeroUno+numeroDos));
				break;
				case 2:
					System.out.println("Resta: " + (numeroUno-numeroDos));
				break;
				case 3:
				System.out.println("Multi: " + (numeroUno*numeroDos));
				break;
				case 4:
					System.out.println("Divide: "+(numeroUno/numeroDos));
				break; 
			}
		}catch(IOException error){
			error.printStackTrace();
		}

	}while(centinela != 0);
}	
}