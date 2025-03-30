package d1_Academia;

public class Aulas extends Academia{
	private String nome_aula;
	private int duracao;
	private String horario;
	private String tipo;
	private String cap_max_alunos;
	
	public Aulas(String ginastica, String bebedouro, String armarios, String Som, String nome_aula, int duracao, String horario, String tipo, String cap_max_alunos) {
		super(ginastica, bebedouro, armarios, Som);
		this.cap_max_alunos = cap_max_alunos;
		this.duracao = duracao;
		this.horario = horario;
		this.nome_aula = nome_aula;
		this.tipo = tipo;
	}


	public void AulaNatacao() {
		System.out.println("Alunos praticando natacao...");
	}

	public void BebendoAgua() {
	    System.out.println("Método Bebendo Água chamado!");
	}


}
