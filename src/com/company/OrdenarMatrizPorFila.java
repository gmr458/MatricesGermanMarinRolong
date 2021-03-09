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

        System.out.println("------------------------------------------------");

        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                for (int k = 0; k < filas; k++) {

                    for (int z = 0; z < columnas; z++) {

                        if (matriz[k][z] > matriz[i][j]) {

                            int aux = matriz[i][j];

                            matriz[i][j] = matriz[k][z];

                            matriz[k][z] = aux;

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
