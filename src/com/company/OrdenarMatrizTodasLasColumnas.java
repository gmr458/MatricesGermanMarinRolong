package com.company;

import java.util.Random;
import java.util.Scanner;

public class OrdenarMatrizTodasLasColumnas {

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

        System.out.println("------------------------------------------------");

        for (int i = 0; i < columnas; i++) {

            for (int j = 0; j < filas; j++) {

                for (int k = 0; k < columnas; k++) {

                    for (int z = 0; z < filas; z++) {

                        if (matriz[z][k] > matriz[j][i]) {

                            int aux = matriz[j][i];

                            matriz[j][i] = matriz[z][k];

                            matriz[z][k] = aux;

                        }

                    }

                }

            }

        }

        System.out.println("MATRIZ ORDENADA");
        System.out.println("------------------------------------------------");

        for (int fila = 0; fila < matriz.length; fila++) {

            for (int columna = 0; columna < matriz[fila].length; columna++) {

                System.out.print(matriz[fila][columna] + "   ");

            }

            System.out.println();

        }

        System.out.println("------------------------------------------------");

    }

}
