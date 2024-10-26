package Programação_orientado_a_objetos.ListaDeExercicios01;

public class ProgressaoAritimetica{
	int primeirTermo=2;
	int razao=3;
	int termoAtual=this.primeirTermo;
	
	public double proximoTermo () {
		
		double resultadoArmazenado = this.termoAtual;
		this.termoAtual += this.razao;
		return resultadoArmazenado;
		}

	}
/*Implemente uma classe chamada ProgressaoAritmetica que possui três atributos
(primeiroTermo, razao, termoAtual) e um método chamado proximoTermo que
devolve o termo atual para quem chamou e calcula o próximo termo atualizando o
termoAtual. Em seguida crie uma aplicação que instancie um objeto da classe
implementada, e mostre na tela os n primeiros termos da progressão, sendo n
definido pelo usuário.*/