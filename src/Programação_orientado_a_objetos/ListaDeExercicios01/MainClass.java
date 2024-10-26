package Programação_orientado_a_objetos.ListaDeExercicios01;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		ProgressaoAritimetica PA = new ProgressaoAritimetica();
		Scanner sc =  new Scanner(System.in);
		
		System.err.println("Digite o primeiro termo: ");
		int n = sc.nextInt();
		
		for(int cont = 1; cont <=n;cont++) {
			System.out.println(PA.proximoTermo());
		}
		sc.close();
	}

}
/*Implemente uma classe chamada ProgressaoAritmetica que possui três atributos
(primeiroTermo, razao, termoAtual) e um método chamado proximoTermo que
devolve o termo atual para quem chamou e calcula o próximo termo atualizando o
termoAtual. Em seguida crie uma aplicação que instancie um objeto da classe
implementada, e mostre na tela os n primeiros termos da progressão, sendo n
definido pelo usuário.*/