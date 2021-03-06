package com.company;

import java.util.Random;
import java.util.Scanner;

public class OrdenarMatrizPorFila {

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

        // Algoritmo de ordenacion por cada fila
        for (int fila = 0; fila < filas; fila++) {

            for (int columna = 0; columna < columnas; columna++) {

                int posicion = columna;

                int auxiliar = matriz[fila][columna];

                while ((posicion > 0) && (matriz[fila][posicion - 1] > auxiliar)) {

                    matriz[fila][posicion] = matriz[fila][posicion - 1];

                    posicion--;

                }

                matriz[fila][posicion] = auxiliar;

            }

        }

        System.out.println("------------------------------------------------");
        System.out.println("MATRIZ ORDENADA POR CADA FILA");
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
