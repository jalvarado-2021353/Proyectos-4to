package org.josearrecis.ecuacioncuadratica;

public class EcuacionCuadratica {
    public static void main(String[] args) {

        double a = 0.0;
        double b = 0.0;
        double c = 0.0;

        System.out.println("Ingrese el valor de a:");
        try {
            a = Double.parseDouble(System.console().readLine());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Ingrese el valor de b:");
        try {
            b = Double.parseDouble(System.console().readLine());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Ingrese el valor de c:");
        try {
            c = Double.parseDouble(System.console().readLine());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        double discriminante = Math.pow(b, 2) - 4 * a * c;
        
        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones de la ecuacion cuadratica son: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("La solucion de la ecuacion cuadratica es: x = " + x);
        } else {
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
            System.out.println("Las soluciones de la ecuacion cuadratica son: x1 = " + parteReal + " + " + parteImaginaria + "i, x2 = " + parteReal + " - " + parteImaginaria + "i");
        }
    }
}