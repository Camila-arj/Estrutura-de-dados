package br.edu.unidesc.estruturadedados.Q03;

import java.util.Scanner;

public class Mtransposta {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int nL = 0;

        do {
            System.out.println("Informe a quantidade de linhas, obs: maior a zero");
            nL = entrada.nextInt();
        } while (nL <= 0);

        int nC = 0;

        do {
            System.out.println("Informe a quantidade de colunas, obs: maior a zero");
            nC = entrada.nextInt();
        } while (nC <= 0);

        int[][] matriz = new int[nL][nC];

        for (int i = 0; i < nL; i++) {
            for (int j = 0; j < nC; j++) {
                System.out.println("Digite um valor inteiro");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("--OS VALORES DA MATRIZ--");
        for (int i = 0; i < nL; i++) {
            for (int j = 0; j < nC; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();

        }

        System.out.println("--MATRIZ TRANSPOSTA--");
        for (int i = 0; i < nC; i++) {
            for (int j = 0; j < nL; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();

        }
    }
}
