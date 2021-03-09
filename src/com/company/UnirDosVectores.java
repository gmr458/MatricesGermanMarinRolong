package com.company;

public class UnirDosVectores {

    public static void main(String[] args) {

        String[] ar1 = {"h", "o", "l", "a"};
        String[] ar2 = {"m", "u", "n", "d", "o"};
        String[] ar3 = new String[ar1.length + ar2.length];

        int i = 0;
        for (i = 0; i < ar1.length; i++) {
            ar3[i] = ar1[i];

        }

        for (int a = 0; a < ar2.length; a++) {

            ar3[i] = ar2[a];
            i++;
        }

        for (int j = 0; j < ar3.length; j++) {
            System.out.println(ar3[j]);
        }

    }

}
