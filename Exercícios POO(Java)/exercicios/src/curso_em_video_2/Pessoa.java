package curso_em_video_2;

public class Pessoa {

	private String nome;
	private int idade;
	private String sexo;
	public Pessoa(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return nome + " --- " + "Idade: " + idade + " --- " + "Sexo: " + sexo + "\n";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String isSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void fazerAniver() {
		this.idade += 1;
		
	}
	 
}
