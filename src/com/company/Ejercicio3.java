package com.company;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int limiteMax = 10;
        int limiteMin = 10;

        System.out.println("------------------------------------------------");

        System.out.print("Digita la cantidad de filas: ");
        int filas = scanner.nextInt();

        System.out.print("Digita la cantidad de columnas: ");
        int columnas = scanner.nextInt();

        scanner.close();

        int[][] matriz = new int[filas][columnas];

        int[] datosPositivosPorColumna = new int[columnas];
        int[] datoMenorPorColumna = new int[columnas];

        System.out.println("------------------------------------------------");
        System.out.println("MATRIZ");
        System.out.println("------------------------------------------------");

        for (int fila = 0; fila < filas; fila++) {

            for (int columna = 0; columna < columnas; columna++) {

                int numeroAleatorio = random.nextInt(limiteMax + 10) - limiteMin;

                matriz[fila][columna] = numeroAleatorio;

                System.out.print(matriz[fila][columna] + "         ");

            }

            System.out.println("\n");

        }

        for (int columna = 0; columna < columnas; columna++) {

            for (int fila = 0; fila < filas; fila++) {

                if (matriz[fila][columna] > 0) {

                    datosPositivosPorColumna[columna] += 1;

                }

            }

        }

        for (int columna = 0; columna < columnas; columna++) {

            datoMenorPorColumna[columna] = limiteMax;

            for (int fila = 0; fila < filas; fila++) {

                if (matriz[fila][columna] < datoMenorPorColumna[columna]) {

                    datoMenorPorColumna[columna] = matriz[fila][columna];

                }

            }

        }

        System.out.println("------------------------------------------------");
        System.out.println("CANTIDAD DE DATOS POSITIVOS POR CADA COLUMNA");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < datosPositivosPorColumna.length; i++) {

            if (datosPositivosPorColumna[i] > 1 || datosPositivosPorColumna[i] == 0) {

                System.out.println("Columna " + i + ": " + datosPositivosPorColumna[i] + " numeros postivos");

            } else {

                System.out.println("Columna " + i + ": " + datosPositivosPorColumna[i] + " numero postivo");

            }

        }

        System.out.println("------------------------------------------------");
        System.out.println("DATO MENOR POR CADA COLUMNA");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < datoMenorPorColumna.length; i++) {

            System.out.println("Dato menor en la columna " + i + ": " + datoMenorPorColumna[i]);

        }

    }

}
