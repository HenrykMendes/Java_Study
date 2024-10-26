package Programação_orientado_a_objetos.ListaDeExercicios03;

public class ContaEspecial extends Conta {
	private double limite;

	public ContaEspecial(String nomeCorrentista, double saldo, String contaNumero, double limite) {
		super(nomeCorrentista, saldo, contaNumero);
		this.limite = limite;
		// TODO Auto-generated constructor stub
	}

}
