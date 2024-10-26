package Programação_orientado_a_objetos.ListaDeExercicios01;

public class MainClass2 {
	public static void main(String[] args) {
		// instanciando o objeto
		Funcionário[] funcionarios = new Funcionário[5];
//chamando a classe "Funcionário" e instanciando com o nome de "funcionarios"

		funcionarios[0] = new Funcionário("Tiago", "DBA", 4500.00);
		funcionarios[1] = new Funcionário("Tiago", "DBA", 4500.00);
		funcionarios[2] = new Funcionário("junior", "DBA", 500.00);
		funcionarios[3] = new Funcionário("Joa", "DBA", 300.00);
		funcionarios[4] = new Funcionário("Amelia", "DBA", 1500.00);

		for (Funcionário fun : funcionarios) {
			fun.ajustarSalario();
		}
		for (Funcionário fun : funcionarios) {
			fun.exibirNome();
		}
	}
}
/*
 * Implemente uma classe chamada Funcionario que possui atributos (nome, funcao,
 * salario) e um método chamado ajustaSalario que atualiza o salário em 5%. Em
 * seguida, crie uma aplicação que instancia cinco objetos do tipo Funcionario,
 * define os valores dos atributos de cada funcionário e aplica o método
 * ajustaSalario para todos os funcionários.
 */