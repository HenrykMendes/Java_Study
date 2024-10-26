package Programação_orientado_a_objetos.ListaDeExercicios03;

public class Conta {

	private String nomeCorrentista;
	private double saldo;
	private String contaNumero;

	public Conta(String nomeCorrentista, double saldo, String contaNumero) {
		this.contaNumero = contaNumero;
		this.nomeCorrentista = nomeCorrentista;
		this.saldo = saldo;
	}

	public void deposito(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Depósito realizado!");
		} else {
			System.out.println("O valor deve ser positivo!");
		}
	}

	public void saque(double valor) {
		if (valor > 0) {
			saldo -= valor;
			System.out.println("Saque realizado!");
		} else if (valor == 0) {
			System.out.println("Valor zerado na conta!");
		} else {
			System.out.println("Saldo negativo!");
		}

	}

	public double getSaldo() {
		return saldo;
	}

}
