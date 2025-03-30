package d1_Academia;

public class Equipamentos extends Academia {
	private String nome_equipamento;
	private String tipo_equipamento;
	private int qtd_equipamento;
	 private boolean emManutencao;


	public Equipamentos(String ginastica, String bebedouro, String armarios, String Som, String nome_equipamento, String tipo_equipamento, int qtd_equipamento, boolean emManutencao) {
		super(ginastica, bebedouro, armarios, Som);
		this.emManutencao = emManutencao;
		this.nome_equipamento = nome_equipamento;
		this.qtd_equipamento = qtd_equipamento;
		this.tipo_equipamento = tipo_equipamento;
	}

	public void LigarEsteira() {
		System.out.println("Aluno ligando esteira.....");
	}

}
