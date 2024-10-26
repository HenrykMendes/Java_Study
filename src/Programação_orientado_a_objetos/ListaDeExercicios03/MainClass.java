package Programação_orientado_a_objetos.ListaDeExercicios03;

public class MainClass {
	public static void main (String[]args) {
		Conta cc = new Conta("Jhon", 224.55, "157953");
		
		cc.deposito(5000);
		cc.saque(3000);
		
		System.out.printf("O valor restante atual: R$%.2f\n",cc.getSaldo());
	}
}