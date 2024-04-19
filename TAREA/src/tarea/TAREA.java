/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

/**
 *
 * @author misae
 */
import java.util.Scanner;

public class TAREA {
    private int[] edades;

    public TAREA(int[] edades) {
        this.edades = edades;
    }

    public double calcularPromedioMayoresEdad() {
        int sumaEdades = 0;
        int contador = 0;
        for (int edad : edades) {
            if (edad >= 18) {
                sumaEdades += edad;
                contador++;
            }
        }
        return contador > 0 ? (double) sumaEdades / contador : 0;
    }

    public double calcularPromedioMenoresEdad() {
        int sumaEdades = 0;
        int contador = 0;
        for (int edad : edades) {
            if (edad < 18) {
                sumaEdades += edad;
                contador++;
            }
        }
        return contador > 0 ? (double) sumaEdades / contador : 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de personas en el grupo:");
        int cantidadPersonas = scanner.nextInt();
        int[] edades = new int[cantidadPersonas];

        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("Ingrese la edad de la persona " + (i + 1) + ":");
            edades[i] = scanner.nextInt();
        }

        TAREA calculadora = new TAREA(edades);
        double promedioMayores = calculadora.calcularPromedioMayoresEdad();
        double promedioMenores = calculadora.calcularPromedioMenoresEdad();

        System.out.println("El promedio de edades de los mayores de edad es: " + promedioMayores);
        System.out.println("El promedio de edades de los menores de edad es: " + promedioMenores);
    }
}

