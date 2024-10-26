package Programação_orientado_a_objetos.ListaDeExercicios01;

public class Funcionário {
	private String nome;
	private String funcao;
	private double salario;
	
	public Funcionário (String nome, String funcao, double salario) {
		this.funcao = funcao;
		this.nome =  nome;
		this.salario =  salario;
	}
	 public void ajustarSalario () {
		 this.salario*=1.05;
	 }
	 public void exibirNome() {
		 System.out.printf("Nome: %s, Função: %s, Salário: R$%.2f%n", nome, funcao, salario);
	 }

}/*
 * Implemente uma classe chamada Funcionario que possui atributos (nome, funcao,
 * salario) e um método chamado ajustaSalario que atualiza o salário em 5%. Em
 * seguida, crie uma aplicação que instancia cinco objetos do tipo Funcionario,
 * define os valores dos atributos de cada funcionário e aplica o método
 * ajustaSalario para todos os funcionários.
 */