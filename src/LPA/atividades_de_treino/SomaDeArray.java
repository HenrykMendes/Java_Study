package lpa.atividades_de_treino;

import java.util.Scanner;

public class SomaDeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resultado = 0;

        System.out.println("Tamanho do vetor");
        int tamanhoDoVetor = sc.nextInt();
        int vetor[] = new int[tamanhoDoVetor];

        if (tamanhoDoVetor >= 2) {
            for (int contador = 0; contador < vetor.length; contador++) {
                System.out.println("Número " + contador + ": ");
                int numero = sc.nextInt();
            }

            for (int contador = 0; contador < vetor.length; contador++) {
                if (resultado < vetor[contador]) {
                    resultado = vetor[contador];
                }
            }

           
            System.out.println("O segundo maior número é: " + resultado);
        } else {
            System.out.println("Lista Inválida");

        }
    }
}