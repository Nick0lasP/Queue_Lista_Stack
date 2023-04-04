package exercicio_1;

public class PrincipalTeste {

	public static void main(String[] args) throws ElementNotPossibleException {
		
		StaticList<Aluno> alunos = new StaticList<>(10);
		alunos.insert(new Aluno("Jos�", "Darwin", 17), 0); //possui mais de uma ocorrencia
		alunos.insert(new Aluno("Jos�", "Darwin", 15), 1);
		alunos.insert(new Aluno("Joaquim", "Darwin", 19), 2);
		alunos.insert(new Aluno("Maria", "Da Vinci", 14), 3); //possui mais de uma ocorrencia
		alunos.insert(new Aluno("Lucas", "Prov�ncia", 19), 4); 
		alunos.insert(new Aluno("Jos�", "Prov�ncia", 17), 5); 
		alunos.insert(new Aluno("Jos�", "Darwin", 17), 6); //possui mais de uma ocorrencia
		alunos.insert(new Aluno("Maria", "Da Vinci", 15), 7);
		alunos.insert(new Aluno("Maria", "Da Vinci", 14), 8); //possui mais de uma ocorrencia
		alunos.insert(new Aluno("Jos�", "Darwin", 17), 9); //possui mais de uma ocorrencia
		
		Aluno alunoTeste = alunos.get(1); //altere aqui para diferentes resultados
		
		System.out.println("O n�mero de vezes que esse elemento aparece na lista est�tica �: " + alunos.contaElementos(alunoTeste));
		
	}
	
}
