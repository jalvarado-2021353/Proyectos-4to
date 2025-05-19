package org.julioalvarado.cuadraticas;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 
public class Cuadraticas{
	public static void main (String [] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader entrada = new BufferedReader(in);
		double a = 0;
		double b = 0;
		double c = 0;
		int controlador = 100;
		while (controlador  > 0)
		try{
		
				System.out.println ("Ingrese el valor de a");
				a = Double.parseDouble(entrada.readLine());
				System.out.println("Ingrese el valor de b");
				b = Double.parseDouble(entrada.readLine()); 
				System.out.println("Ingrese el valor de c");
				c = Double.parseDouble(entrada.readLine()); 
				double discriminante = Math.pow(b, 2) - 4 * a * c;
				if (discriminante < 0){
					System.out.println("La ecuasion no tiene respuesta en reales " + discriminante +"i"):
				}
				if (discriminante < 0){
				double x1 = (-b + Math.sqrt(discriminante)) / (a*2);
				double x2 = (-b - Math.sqrt(discriminante)) / (a*2);
				System.out.println("Las soluciones de las cuadraticas son "+ x1);
				System.out.println("Las soluciones de las cuadraticas son "+ x2);
		}
			}catch (IOException e) {
				e.printStackTrace();
				
		}
	}
}