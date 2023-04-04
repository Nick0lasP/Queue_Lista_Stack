package exercicio_2;

public class Metodo2 {

	
	public boolean checkBrackets(Stack<Character> s1) {
		
		Stack<Character> parentesesLimpeza = new StaticStack<>(s1.numElements()); //cria uma pilha que verifica as regras
		Stack<Character> parenteses = new StaticStack<>(s1.numElements()); //cria uma pilha que armazena somente parenteses

		int tamanho = s1.numElements();
		
		if(s1 != null) {
			
			for(int i = 0; i<tamanho;i++) { //preenche a pilha dos parenteses
				
				char atual = s1.pop();
				
				if(atual == ')') {
					parenteses.push(atual);
				}
				else if (atual == '(') {
					parenteses.push(atual);
				}
				else {
					continue;
				}
			}
			
			tamanho = parenteses.numElements();
			
			for(int i = 0; i<tamanho;i++) { //realiza a limpeza
				
				char atual = parenteses.pop();
				
				if(atual == '(') {
					parentesesLimpeza.push(atual);
				}
				else if(!parentesesLimpeza.isEmpty() && (atual == ')' && parentesesLimpeza.top() == '(')) { 
					parentesesLimpeza.pop();
				}
				else {
					parentesesLimpeza.push(atual);
				}
				
				
			}
			
		}
		return (parentesesLimpeza.isEmpty());	//retorna falso caso a pilha de limpeza tenha ficado com algo
		
	}
	
}
