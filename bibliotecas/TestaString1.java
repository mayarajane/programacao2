package bibliotecas;

public class TestaString1 {
	public static void main(String[] args) {
		// String a = new String("Java ADS na veia");
		// String a = "Java ADS na veia";
		// String b = "Java ADS na veia";

		String a = new String("Java ADS na veia");
		String b = new String("Java ADS na veia");
		// int a = 2; tipo primitivo, o comportamento � diferente
		// int b = 3; tipo primitivo, o comportamento � diferente
		if (a == b) {
			System.out.println("a e b s�o iguais");
		} else {
			System.out.println("a e b s�o objetos diferentes");
		}

		// se quero comprar o conteudo de um objeto String, tem que usar Equals
		if (a.equals(b)) {
			System.out.println("a e b s�o iguais (testa o conteudo)");
		} else {
			System.out.println("a e b s�o objetos diferentes");
		}
	}

}
