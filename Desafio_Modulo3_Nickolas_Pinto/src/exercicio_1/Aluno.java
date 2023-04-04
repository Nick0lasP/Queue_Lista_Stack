package exercicio_1;

public class Aluno { //classe criada com o intuito de testar o codigo

	private String nome, instituição;
	private int idade;
	

	public Aluno(String nome, String instituição, int idade) {
		this.nome = nome;
		this.instituição = instituição;
		this.idade = idade;
	}	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getInstituição() {
		return instituição;
	}
	public void setInstituição(String instituição) {
		this.instituição = instituição;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
