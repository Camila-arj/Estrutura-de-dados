package br.edu.unidesc.estruturadedados.Q02;

import java.util.Scanner;

public class V1V2 {


    public static void main(String[] args) {
       int[] v1 = initVector();
       System.out.println("--- VETOR 1 ---");
       printVector(v1);
       System.out.println();
       int[] v2 = initVector();
       System.out.println("--- VETOR 2 ---");
       printVector(v2);
       System.out.println();
       int[] v3 = appandVector(v1, v2);
       System.out.println("--- VETOR 3 ---");
       printVector(v3);
       System.out.println();
       int[] v4 = perfectVector(v3);
       System.out.println("--- VETOR 4 ---");
       printVector(v4);
       System.out.println();
    }


    public static int[] initVector() {
        Scanner entrada = new Scanner(System.in);

        int n = 0;

        do {
            System.out.println("Informe o tamanho do vetor, obs: maior a zero");
            n = entrada.nextInt();
        } while (n <= 0);

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um valor inteiro");
            vetor[i] = entrada.nextInt();
        }
        return vetor;
    }


    public static int[] appandVector (int[]  v1, int[] v2){
        int[] v3 = new int[v1.length + v2.length];

        for (int i = 0; i < v3.length - v2.length; i++) {
            v3[i] = v1[i];
        }

        for (int i = v1.length ; i < v3.length; i++) {
            v3[i] = v2[i - v1.length];
        }
        return v3;
    }

    public static int[] perfectVector (int[] v3) {
        int num, soma, cont;
        int vetor[] = new int[v3.length];
        cont = 0;
        soma = 0;

        for (int i = 0; i < v3.length; i++) {

            num = v3[i];
            for (int j = 0; j < num; j++) {
                if ((num % j) == 0){
                    soma = soma + j;
                }if (soma == num)
                    vetor[cont++] = num;
            }
        }

       int[] v4 = new int[cont];

        for (int i = 0; i < cont; i++) {
            v4[i] = vetor[i];
        }
        return v4;
    }

    public static void printVector (int[] vetor){
        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
    }

}
