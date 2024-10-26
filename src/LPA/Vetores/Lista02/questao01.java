package LPA.Vetores;
import java.util.Scanner;
public class questao01 {

	public static void main(String[] args) {
		int[] vet = new int[5];
		NumerosInteiro(vet);
		mostrarPosicao(vet);
	}

	public static void NumerosInteiro(int vetor[]) {
		Scanner sc = new Scanner(System.in);
		for (int cont = 0; cont < vetor.length; cont++) {
			vetor[cont] = sc.nextInt();
		}

		sc.close();
	}
	
	public static void mostrarPosicao(int []vetor) {
		for (int cont = vetor.length-1; cont>=0;cont--) {
			System.out.println(vetor[cont]+" ");
		}
	}
}
/*
 * Implemente uma função que recebe por parâmetro um vetor de números inteiros e
 * a quantidade de elementos do mesmo e informe a posição do maior número.
 */