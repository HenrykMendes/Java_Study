package Programação_orientado_a_objetos.ListaDeExercicios02;

public class AlunosMatriculados {
	private String matricula;
	private String nome;
	private double OneNota_prova;
	private double TwoNota_prova;
	private double nota_trabalho;

	public AlunosMatriculados(String matricula, String nome, double OneNota_prova, double TwoNota_prova, double nota_trabalho) {
		this.matricula = matricula;
		this.nome = nome;
		this.nota_trabalho = nota_trabalho;
		this.OneNota_prova = OneNota_prova;
		this.TwoNota_prova = TwoNota_prova;

	}

	// Método para calcular a média ponderada
	public double Media() {
		double notaUmProva = 2.5;
		double notaDoisProva = 2.5;
		double notaDoTrabalho = 2;
		double somaDeNotas = notaUmProva + notaDoisProva + notaDoTrabalho;

		return (OneNota_prova * notaUmProva + TwoNota_prova * notaDoisProva + nota_trabalho * notaDoTrabalho)
				/ somaDeNotas;
	}

	public double Final(double mediaPonderada) {
		double mediaAtual = Media();

		if (mediaAtual >= mediaPonderada) {
			return 0.0; // Significa que o aluno alcançou a nota necessária
		} else {
			return 1.0;
		}
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getOneNota_prova() {
		return OneNota_prova;
	}

	public void setOneNota_prova(double oneNota_prova) {
		OneNota_prova = oneNota_prova;
	}

	public double getTwoNota_prova() {
		return TwoNota_prova;
	}

	public void setTwoNota_prova(double twoNota_prova) {
		TwoNota_prova = twoNota_prova;
	}

	public double getNota_trabalho() {
		return nota_trabalho;
	}

	public void setNota_trabalho(double nota_trabalho) {
		this.nota_trabalho = nota_trabalho;
	}

}
