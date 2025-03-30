package d1_Academia;

public class Academia {
	private String ginastica;
	private String bebedouro;
	protected String armarios;
	private String som;

	public Academia(String ginastica, String bebedouro, String armarios, String Som) {
		super();
		this.armarios = armarios;
		this.bebedouro = bebedouro;
		this.ginastica = ginastica;
		this.som = som;
		
	}

	public void LigarSom() {
		System.out.println("Ligando o som para os clientes");
	}
	public void BebendoAgua() {
		System.out.println("Aluno bebendo agua");
	}

}
