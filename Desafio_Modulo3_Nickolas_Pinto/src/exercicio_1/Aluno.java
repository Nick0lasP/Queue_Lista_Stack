package exercicio_1;

public class Aluno { //classe criada com o intuito de testar o codigo

	private String nome, institui��o;
	private int idade;
	

	public Aluno(String nome, String institui��o, int idade) {
		this.nome = nome;
		this.institui��o = institui��o;
		this.idade = idade;
	}	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getInstitui��o() {
		return institui��o;
	}
	public void setInstitui��o(String institui��o) {
		this.institui��o = institui��o;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
