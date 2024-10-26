package Programação_orientado_a_objetos.ListaDeExercicios02;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a matricula: ");
		String matricula = sc.nextLine();
		System.out.println("Digite nome do aluno: ");
		String nomeAluno = sc.nextLine();
		System.out.println("Digite a nota da prova 1: ");
		double provaUm = sc.nextDouble();
		System.out.println("Digite a nota da prova 2: ");
		double provaDois = sc.nextDouble();
		System.out.println("Digite a nota do trabalho: ");
		double notaTrabalho = sc.nextDouble();
		System.out.println("Digite a nota final necessária: ");
		double notaDesejada = sc.nextDouble();

		AlunosMatriculados alunos = new AlunosMatriculados(matricula,nomeAluno,provaUm,provaDois,notaTrabalho);

		double notaNecessaria = alunos.Final(notaDesejada);
		
		if (notaNecessaria==0) {
			System.out.println("O aluno alcançou a nota necessária!!");
		} else {
			System.out.println("O aluno está apto para avaliação final!");
		}
sc.close();
	}
}
