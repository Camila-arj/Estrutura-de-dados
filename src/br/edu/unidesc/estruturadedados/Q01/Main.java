package br.edu.unidesc.estruturadedados.Q01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] vetor = initVetor();
        System.out.println("Os valores no vetor sao:");
        printVector(vetor);
        System.out.println();
        int[] vetorI = invVector(vetor);
        System.out.println("Os valores invertidos sao:");
        printVector(vetor);
        System.out.println();
        int[] vetorPares = evenVector(vetor);
        System.out.println("Os valores pares no vetor sao:");
        printVector(vetorPares);

    }



    public static int[] initVetor () {
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

    private int[] vetor;
    int[] vetorI = invVector(vetor);

    public static int[] invVector(int[] vetor) {
        int aux;

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < i; j++) {
                aux = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = aux;
            }
        }
        return vetor;
    }


    public static void printVector (int[] vetor){
        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
    }

    public static int[] evenVector(int[] vetor){
        int cont = 0;
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] % 2 == 0){
                cont++;
            }
        }
        int[] vetorPares = new int[cont];

        int j = 0;
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] % 2 == 0){
                vetorPares[j] = vetor[i];
                j++;
            }
        }
        return vetorPares;
    }
}


