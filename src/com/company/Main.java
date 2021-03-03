package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        int limiteSuperior = 11; // El limite maximo de los numeros aleatorios

        int[][] tabla = new int[3][4]; // Tabla de 3 filas y 4 columnas

        int sumaTotal = 0; // Variable que contendra la suma total de la tabla de 3x4

        int[] vectorSumaFilas = new int[3]; // En la primera posicion del vector estara la suma total de la primera fila
        // y asi se hara con las otras filas

        // En el siguiente ciclo for dentro de otro ciclo for se llena la tabla 3x4 con numeros aleatorios
        for (int fila = 0; fila < tabla.length; fila++) {

            for (int columna = 0; columna < tabla[fila].length; columna++) {

                tabla[fila][columna] = random.nextInt(limiteSuperior);

            }

        }

        System.out.println("------------------------------------------------");

        // En el siguiente ciclo for se imprimen los valores de la tabla 3x4 y se obtiene la suma total de la tabla,
        // tambien se obtienen las sumas totales por fila
        for (int fila = 0; fila < tabla.length; fila++) {

            for (int columna = 0; columna < tabla[fila].length; columna++) {

                System.out.println("Fila " + fila + ", Columna " + columna + ": " + tabla[fila][columna]);

                if ((fila == 0 && columna == 3) || (fila == 1 && columna == 3)) {
                    System.out.println("------------------------------------------------");
                }

                // Sumas totales por fila
                if (fila == 0) {
                    vectorSumaFilas[0] += tabla[fila][columna];
                } else if (fila == 1) {
                    vectorSumaFilas[1] += tabla[fila][columna];
                } else {
                    vectorSumaFilas[2] += tabla[fila][columna];
                }

                // Suma total de la matriz
                sumaTotal += tabla[fila][columna];

            }

        }

        // En las siguiente lineas se calcula la fila con mayor valor y cual es su valor
        int valorFilaMayor = 0;
        int filaMayor = 0;

        for (int i = 0; i < vectorSumaFilas.length; i++) {
            if (vectorSumaFilas[i] > valorFilaMayor) {
                valorFilaMayor = vectorSumaFilas[i];
                filaMayor = i;
            }
        }

        // De aqui en adelante se imprimen los resultados en consola
        System.out.println("------------------------------------------------");

        System.out.println("La suma total de la matriz es: " + sumaTotal);

        System.out.println("------------------------------------------------");

        for (int i = 0; i < vectorSumaFilas.length; i++) {
            System.out.println("La suma total de la matriz en la fila " + i + " es: " + vectorSumaFilas[i]);
        }

        System.out.println("------------------------------------------------");

        System.out.println("La fila mas alta fue la fila " + filaMayor + " con valor de " + valorFilaMayor);

        System.out.println("------------------------------------------------");

    }
    
}
