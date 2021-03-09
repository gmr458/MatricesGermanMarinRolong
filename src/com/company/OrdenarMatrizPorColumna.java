package com.company;

import java.util.Random;
import java.util.Scanner;

public class OrdenarMatrizPorColumna {

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

        System.out.println("------------------------------------------------");
        System.out.println("MATRIZ DESORDENADA");
        System.out.println("------------------------------------------------");

        for (int fila = 0; fila < matriz.length; fila++) {

            for (int columna = 0; columna < matriz[fila].length; columna++) {

                matriz[fila][columna] = random.nextInt(limiteSuperior);

                System.out.print(matriz[fila][columna] + "   ");

            }

            System.out.println();

        }

        // Algoritmo de ordenacion por cada columna
        for (int columna = 0; columna < columnas; columna++) {

            for (int fila = 0; fila < filas; fila++) {

                int posicion = fila;

                int auxiliar = matriz[fila][columna];

                while ((posicion > 0) && (matriz[posicion - 1][columna] > auxiliar)) {

                    matriz[posicion][columna] = matriz[posicion - 1][columna];

                    posicion--;

                }

                matriz[posicion][columna] = auxiliar;

            }

        }

        System.out.println("------------------------------------------------");
        System.out.println("MATRIZ ORDENADA POR CADA COLUMNA");
        System.out.println("------------------------------------------------");

        for (int filac = 0; filac < filas; filac++) {

            for (int columna = 0; columna < columnas; columna++) {

                System.out.print(matriz[filac][columna] + "   ");

            }

            System.out.println();

        }

        System.out.println("------------------------------------------------");

    }

}
