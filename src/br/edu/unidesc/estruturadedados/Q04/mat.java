package br.edu.unidesc.estruturadedados.Q04;

import java.util.Scanner;

public class mat {
    public static void main(String[] args) throws Exception {

        int[][] matriz = new int[3][7];
        int[] valorProduto = new int[3];
        int[] vetQuantidade = new int[3];
        int[] vetMaisVendido = new int[3];

        preencherMatriz(matriz);
        preencherVetor(valorProduto);

        System.out.println("---QUANTIDADE TOTAL DE CADA PRODUTO---");
        vetQuantidade = quantidadeProduto(matriz);

        for (int i = 0; i < vetQuantidade.length; i++) {
            System.out.print(vetQuantidade[i] + "  ");

        }
        System.out.println();
        System.out.println("---VALOR TOTAL VENDIDO---");
        int[] valorTotalProd = valorTotalProd(vetQuantidade, valorProduto);

        for (int i = 0; i < valorTotalProd.length; i++) {
            System.out.print(valorTotalProd[i] + "  ");

        }

        System.out.println();
        System.out.println("---VALOR TOTAL NA SEMANA---");
        int soma = 0;

        for (int i = 0; i < valorTotalProd.length; i++) {
            soma = soma + valorTotalProd[i];

        }
        System.out.println(soma);
        System.out.println();

        System.out.println("---PRODUTO MAIS VENDIDO NA SEMANA---");
        vetMaisVendido = quantidadeProduto(matriz);
        int maisVendido =0;
        int produto = 0;

        for (int i = 0; i < vetMaisVendido.length; i++) {
            if (vetMaisVendido[i] > maisVendido)
                produto = i;
                maisVendido = vetMaisVendido[i];

        }
        System.out.println(produto);

        System.out.println();
        System.out.println("---DIA COM MAIS VENDAS---");
        int[] vetDiaMaisvendas = new int[7];
        vetDiaMaisvendas = diaMaisVendas(matriz);
        int maisVendas = 0;
        int dia = 0;

        for (int i = 0; i < vetDiaMaisvendas.length; i++) {
            if (vetDiaMaisvendas[i] > maisVendas)
                dia = i;
                maisVendas = vetDiaMaisvendas[i];
        }
        System.out.println(dia);




    }


    public static void preencherMatriz(int[][] matriz) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Informe a quantidade de produtos " + i + " Para o dia " + j);
                matriz[i][j] = entrada.nextInt();

            }

        }

    }

    public static void preencherVetor(int[] vetor){
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o valor do produto " + i);
            vetor[i] = entrada.nextInt();

        }
    }

    public static int[] quantidadeProduto(int[][] matriz){

        int soma = 0;
        int[] vetQuantidade = new int[3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                soma = soma + matriz[i][j];

            }
            vetQuantidade[i] = soma;
            soma = 0;

        }
        return vetQuantidade;
    }

    public static int[] diaMaisVendas(int[][] matriz){
        int soma = 0;
        int[] vetDiaComMaisVendas = new int[7];

        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < 3; i++) {
                soma = soma + matriz[j][i];

            }
            vetDiaComMaisVendas[j] = soma;
            soma = 0;

        }
        return vetDiaComMaisVendas;
    }

    public static int[] valorTotalProd(int[] vQ, int[] vV){

        int[] vetValorTotal = new int[3];

        for (int i = 0; i < vV.length; i++) {
            vetValorTotal[i] = vQ[i] * vV[i];

        }
        return vetValorTotal;
    }
}