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

        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                for (int k = 0; k < filas; k++) {

                    for (int z = 0; z < columnas; z++) {

                        if (matrizOrdenadaPorFilas[k][z] > matrizOrdenadaPorFilas[i][j]) { // Por filas

                            int auxFilas = matrizOrdenadaPorFilas[i][j];

                            matrizOrdenadaPorFilas[i][j] = matrizOrdenadaPorFilas[k][z];

                            matrizOrdenadaPorFilas[k][z] = auxFilas;

                        }

                    }

                }

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

        for (int i = 0; i < columnas; i++) {

            for (int j = 0; j < filas; j++) {

                for (int k = 0; k < columnas; k++) {

                    for (int z = 0; z < filas; z++) {

                        if (matrizOrdenadaPorColumnas[z][k] > matrizOrdenadaPorColumnas[j][i]) {

                            int aux = matrizOrdenadaPorColumnas[j][i];

                            matrizOrdenadaPorColumnas[j][i] = matrizOrdenadaPorColumnas[z][k];

                            matrizOrdenadaPorColumnas[z][k] = aux;

                        }

                    }

                }

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
