package exercicio_2;


public class PrincipalTeste {

	public static void main(String[] args) {
		
		Metodo2  m = new Metodo2();
		String expressao = "(A+ B("; //altere aqui para testar outros valores
		char [] caracteres = expressao.toCharArray();
		int tamanho = caracteres.length;
		
		Stack<Character> pilha =  new StaticStack<>(tamanho);
		
		System.out.println(pilha.numElements());
		
		for(int i = 0; i<tamanho; i++) {
			pilha.push(caracteres[i]);
		}
		
		System.out.println(pilha.numElements());
		
		if((m.checkBrackets(pilha))){
			System.out.println("Parênteses agrupados de forma correta.");
		}else {
			System.out.println("Parênteses agrupados de forma incorreta.");
		}

	}

}
