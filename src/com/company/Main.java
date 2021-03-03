package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int limiteSuperior = 11; // El limite maximo de los numeros aleatorios

        System.out.println("------------------------------------------------");

        System.out.print("Digita la cantidad de filas: ");
        int filas = scanner.nextInt();

        System.out.print("Digita la cantidad de columnas: ");
        int columnas = scanner.nextInt();

        scanner.close();

        int[][] tabla = new int[filas][columnas]; // Matriz

        int sumaTotal = 0; // Variable que contendra la suma total de todas las posiciones de la matriz

        int[] vectorSumaFilas = new int[filas]; // En la primera posicion del vector estara la suma total de la primera fila
        // y asi se hara con las otras filas

        System.out.println("------------------------------------------------");

        // En el siguiente ciclo for dentro de otro ciclo for se llena la matriz con numeros aleatorios,
        // se imprimen los valores de la matriz y se obtiene la suma total de todas las posiciones de la matriz y
        // la suma por cada fila
        for (int fila = 0; fila < tabla.length; fila++) {

            for (int columna = 0; columna < tabla[fila].length; columna++) {

                tabla[fila][columna] = random.nextInt(limiteSuperior);

                System.out.println("Fila " + fila + ", Columna " + columna + ": " + tabla[fila][columna]);

                // Suma de la fila actual
                vectorSumaFilas[fila] += tabla[fila][columna];

                // Suma total de la matriz
                sumaTotal += tabla[fila][columna];

            }

            System.out.println("------------------------------------------------");

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
