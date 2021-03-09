package com.company;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int limiteSuperior = 10;

        System.out.println("------------------------------------------------");

        System.out.print("Digita la cantidad de filas y columnas: ");
        int filasYColumnas = scanner.nextInt();

        scanner.close();

        int[][] matriz = new int[filasYColumnas][filasYColumnas];

        int[] primeraColumna = new int[filasYColumnas];
        int[] ultimaColumna = new int[filasYColumnas];
        int[] primeraFila = new int[filasYColumnas - 2];
        int[] ultimaFila = new int[filasYColumnas - 2];
        int[] diagonalIzquierda;
        int[] diagonalDerecha;
        int[] centro = {0};
        if (filasYColumnas % 2 == 0) {
            diagonalIzquierda = new int[filasYColumnas / 2 - 1];
            diagonalDerecha = new int[filasYColumnas / 2 - 1];
        } else {
            diagonalIzquierda = new int[(int) ((filasYColumnas / 2) - 0.5)];
            diagonalDerecha = new int[(int) ((filasYColumnas / 2) - 0.5)];
        }

        System.out.println("------------------------------------------------");
        System.out.println("MATRIZ");
        System.out.println("------------------------------------------------");

        for (int fila = 0; fila < matriz.length; fila++) {

            for (int columna = 0; columna < matriz[fila].length; columna++) {

                int numeroAleatorio = random.nextInt(limiteSuperior);

                matriz[fila][columna] = numeroAleatorio;

                System.out.print(matriz[fila][columna] + "   ");

            }

            System.out.println();

        }

        // Capturar primera y ultima columna
        for (int fila = 0; fila < filasYColumnas; fila++) {

            for (int columna = 0; columna < filasYColumnas; columna++) {

                if (columna == 0) { // Primera columna

                    primeraColumna[fila] = matriz[fila][columna];

                }

                if (columna == filasYColumnas - 1) { // Ultima columna

                    ultimaColumna[fila] = matriz[fila][columna];

                }

            }

        }

        // Capturar primera y ultima fila
        int posicionB = 0;
        for (int fila = 0; fila < 1; fila++) {

            for (int columna = 1; columna <= filasYColumnas - 2; columna++) {

                primeraFila[posicionB] = matriz[fila][columna];

                posicionB++;

            }

        }

        int posicionA = 0;

        for (int fila = filasYColumnas - 1; fila < filasYColumnas; fila++) {

            for (int columna = 1; columna <= filasYColumnas - 2; columna++) {

                ultimaFila[posicionA] = matriz[fila][columna];

                posicionA++;

            }

        }

        // Capturar diagonal izquierda y derecha si filasYColumnas es par
        int filaIzq = 1;
        if (filasYColumnas % 2 == 0) {

            for (int columna = 1; columna < filasYColumnas / 2; columna++) {

                diagonalIzquierda[filaIzq - 1] = matriz[filaIzq][columna];

                filaIzq++;

            }

            int filaDer = 1;

            for (int columna = (filasYColumnas - 1) - 1; columna >= filasYColumnas / 2; columna--) {

                diagonalDerecha[filaDer - 1] = matriz[filaDer][columna];

                filaDer++;

            }

        } else {

            for (int columna = 1; columna <= (int) (filasYColumnas / 2 - 0.5); columna++) {

                diagonalIzquierda[filaIzq - 1] = matriz[filaIzq][columna];

                filaIzq++;

            }

            int filaDer = 1;

            int limite = (filasYColumnas / 2);

            for (int columna = (filasYColumnas - 1) - 1; columna > limite; columna--) {

                diagonalDerecha[filaDer - 1] = matriz[filaDer][columna];

                filaDer++;

            }

            centro[0] = matriz[filasYColumnas / 2][filasYColumnas / 2];

        }

        // Vector con todos los numeros con componen una letra M
        int[] todosNumeros = new int[primeraColumna.length + ultimaColumna.length + diagonalDerecha.length + diagonalIzquierda.length + centro.length];

        // Vector con todos los numeros con componen una letra O
        int[] todosNumerosO = new int[primeraColumna.length + ultimaColumna.length + primeraFila.length + ultimaFila.length];

        // Llenado del vector todosNumeros con la suma de los 4 primeros vectores (primeraColumna, ultimaColumna, diagonales iquierda y derecha, centro)
        int a;
        for (a = 0; a < primeraColumna.length; a++) {
            todosNumeros[a] = primeraColumna[a];

        }

        for (int b = 0; b < ultimaColumna.length; b++) {
            todosNumeros[a] = ultimaColumna[b];
            a++;
        }

        for (int c = 0; c < diagonalDerecha.length; c++) {
            todosNumeros[a] = diagonalDerecha[c];
            a++;
        }

        for (int d = 0; d < diagonalIzquierda.length; d++) {
            todosNumeros[a] = diagonalIzquierda[d];
            a++;
        }

        todosNumeros[a] = centro[0];

        // Llenando al letra O
        int z;
        for (z = 0; z < primeraColumna.length; z++) {
            todosNumerosO[z] = primeraColumna[z];

        }

        for (int b = 0; b < ultimaColumna.length; b++) {
            todosNumerosO[z] = ultimaColumna[b];
            z++;
        }

        for (int c = 0; c < primeraFila.length; c++) {
            todosNumerosO[z] = primeraFila[c];
            z++;
        }

        for (int d = 0; d < ultimaFila.length; d++) {
            todosNumerosO[z] = ultimaFila[d];
            z++;
        }

        // Ordenamiento del vector todos numeros con el Metodo Insercion
        for (int i = 0; i < todosNumeros.length; i++) {

            int posicion = i;

            int auxiliar = todosNumeros[i];

            while ((posicion > 0) && (todosNumeros[posicion - 1] > auxiliar)) {

                todosNumeros[posicion] = todosNumeros[posicion - 1];

                posicion--;

            }

            todosNumeros[posicion] = auxiliar;

        }

        // Ordenamiento del vector todos numeros O con el Metodo Insercion
        for (int i = 0; i < todosNumerosO.length; i++) {

            int posicion = i;

            int auxiliar = todosNumerosO[i];

            while ((posicion > 0) && (todosNumerosO[posicion - 1] > auxiliar)) {

                todosNumerosO[posicion] = todosNumerosO[posicion - 1];

                posicion--;

            }

            todosNumerosO[posicion] = auxiliar;

        }

        // Suma de todos los valores de todosNumeros sin repetirse los valores
        int suma = todosNumeros[todosNumeros.length - 1];
        for (int i = 0; i < todosNumeros.length; i++) {
            if (i != todosNumeros.length - 1 && todosNumeros[i] != todosNumeros[i + 1]) {
                suma += todosNumeros[i];
            }
        }

        // Suma de todos los valores de todosNumeros sin repetirse los valores
        int sumaO = todosNumerosO[todosNumerosO.length - 1];
        for (int i = 0; i < todosNumerosO.length; i++) {
            if (i != todosNumerosO.length - 1 && todosNumerosO[i] != todosNumerosO[i + 1]) {
                sumaO += todosNumerosO[i];
            }
        }

        /*for (int valor : primeraColumna) {
            System.out.println("Primera columna -> " + valor);
        }

        System.out.println("----------------------------------------");

        for (int valor : ultimaColumna) {
            System.out.println("Ultima columna -> " + valor);
        }

        System.out.println("----------------------------------------");

        for (int valor : primeraFila) {
            System.out.println("Primera fila -> " + valor);
        }

        System.out.println("----------------------------------------");

        for (int valor : ultimaFila) {
            System.out.println("Ultima fila -> " + valor);
        }

        System.out.println("----------------------------------------");

        for (int valor : diagonalIzquierda) {
            System.out.println("Diagonal izquierda -> " + valor);
        }

        System.out.println("----------------------------------------");

        for (int valor : diagonalDerecha) {
            System.out.println("Diagonal derecha -> " + valor);
        }

        System.out.println("----------------------------------------");

        System.out.println("Centro -> " + centro[0]);

        System.out.println("----------------------------------------");

        for (int valor : todosNumeros) {
            System.out.println("Todos Numeros M -> " + valor);
        }

        System.out.println("----------------------------------------");

        for (int valor : todosNumerosO) {
            System.out.println("Todos Numeros O -> " + valor);
        }*/

        System.out.println("------------------------------------------------------");

        System.out.println("SUMA DE LOS VALORES QUE FORMAN UNA M SIN REPETIRSE: " + suma);

        System.out.println("------------------------------------------------------");

        System.out.println("SUMA DE LOS VALORES QUE FORMAN UNA O SIN REPETIRSE: " + sumaO);


    }

}
