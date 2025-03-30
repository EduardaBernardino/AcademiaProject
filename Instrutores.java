package d1_Academia;

public class Instrutores extends Academia{
	private String nome;
	private int idade;
	private double salario;
	private String especialidade;


	public Instrutores(String ginastica, String bebedouro, String armarios, String Som, String nome, int idade, double salario, String especialidade) {
		super(ginastica, bebedouro, armarios, Som);
		this.especialidade = especialidade;
		this.idade = idade;
		this.nome = nome;
		this.salario = salario;
	}

	public  void IniciandoAula() {
		System.out.println("Dando inicio a aula....");
	}

}
