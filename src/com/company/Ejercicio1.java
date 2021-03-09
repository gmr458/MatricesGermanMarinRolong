package com.company;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int limiteSuperior = 10;

        System.out.println("------------------------------------------------");

        System.out.print("Digita la cantidad de filas: ");
        int filas = scanner.nextInt();

        System.out.print("Digita la cantidad de columnas: ");
        int columnas = scanner.nextInt();

        scanner.close();

        int[][] matriz = new int[filas][columnas];
        int[][] matrizOrdenadaPorFilas = new int[filas][columnas];
        int[][] matrizOrdenadaPorColumnas = new int[filas][columnas];

        System.out.println("------------------------------------------------");
        System.out.println("MATRIZ DESORDENADA");
        System.out.println("------------------------------------------------");

        for (int fila = 0; fila < matriz.length; fila++) {

            for (int columna = 0; columna < matriz[fila].length; columna++) {

                int numeroAleatorio = random.nextInt(limiteSuperior);

                matriz[fila][columna] = numeroAleatorio;
                matrizOrdenadaPorFilas[fila][columna] = numeroAleatorio;
                matrizOrdenadaPorColumnas[fila][columna] = numeroAleatorio;

                System.out.print(matriz[fila][columna] + "   ");

            }

            System.out.println();

        }

        System.out.println("------------------------------------------------");
        System.out.println("MATRIZ ORDENADA POR FILAS");
        System.out.println("------------------------------------------------");

        for (int fila = 0; fila < filas; fila++) {

            for (int columna = 0; columna < columnas; columna++) {

                int posicion = columna;

                int auxiliar = matrizOrdenadaPorFilas[fila][columna];

                while ((posicion > 0) && (matrizOrdenadaPorFilas[fila][posicion - 1] > auxiliar)) {

                    matrizOrdenadaPorFilas[fila][posicion] = matrizOrdenadaPorFilas[fila][posicion - 1];

                    posicion--;

                }

                matrizOrdenadaPorFilas[fila][posicion] = auxiliar;

            }

        }

        for (int fila = 0; fila < matrizOrdenadaPorFilas.length; fila++) {

            for (int columna = 0; columna < matrizOrdenadaPorFilas[fila].length; columna++) {

                System.out.print(matrizOrdenadaPorFilas[fila][columna] + "   ");

            }

            System.out.println();

        }

        System.out.println("------------------------------------------------");
        System.out.println("MATRIZ ORDENADA POR COLUMNAS");
        System.out.println("------------------------------------------------");

        for (int columna = 0; columna < columnas; columna++) {

            for (int fila = 0; fila < filas; fila++) {

                int posicion = fila;

                int auxiliar = matrizOrdenadaPorColumnas[fila][columna];

                while ((posicion > 0) && (matrizOrdenadaPorColumnas[posicion - 1][columna] > auxiliar)) {

                    matrizOrdenadaPorColumnas[posicion][columna] = matrizOrdenadaPorColumnas[posicion - 1][columna];

                    posicion--;

                }

                matrizOrdenadaPorColumnas[posicion][columna] = auxiliar;

            }

        }

        for (int fila = 0; fila < matrizOrdenadaPorColumnas.length; fila++) {

            for (int columna = 0; columna < matrizOrdenadaPorColumnas[fila].length; columna++) {

                System.out.print(matrizOrdenadaPorColumnas[fila][columna] + "   ");

            }

            System.out.println();

        }

        System.out.println("------------------------------------------------");

    }

}
