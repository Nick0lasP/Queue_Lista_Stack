package ex3;

public class PrincipalTeste {
	public static void main(String[] args) {
		int tamanho = 10;

		StaticQueue<Integer> fila = new StaticQueue<>(tamanho);

		System.out.println(fila.isEmpty());

		int[] numeros = new int[tamanho];

		for (int i = 0; i < tamanho; i++) {
			numeros[i] = (int) (Math.random() * 1000 + 1);
		}

		for (int i = 0; i < tamanho; i++) {
			System.out.println(numeros[i]);
		}

		for (int i = 0; i < tamanho; i++) {
			fila.enqueue(numeros[i]);
		}

		System.out.println(fila.toString());
		System.out.println(fila.dequeue());
		System.out.println(fila.toString());
		System.out.println(fila.dequeue());
		System.out.println(fila.dequeue());
		System.out.println(fila.dequeue());
		System.out.println(fila.dequeue());
		System.out.println(fila.dequeue());
		System.out.println(fila.dequeue());
		System.out.println(fila.toString());
		System.out.println(fila.dequeue());
		System.out.println(fila.toString());
		System.out.println(fila.dequeue());
		System.out.println(fila.toString());
		System.out.println(fila.dequeue());
		System.out.println(fila.toString());
		fila.enqueue(124);
		System.out.println(fila.toString());
		
	}
}