package bibliotecas;

public class TestaString1 {
	public static void main(String[] args) {
		// String a = new String("Java ADS na veia");
		// String a = "Java ADS na veia";
		// String b = "Java ADS na veia";

		String a = new String("Java ADS na veia");
		String b = new String("Java ADS na veia");
		// int a = 2; tipo primitivo, o comportamento é diferente
		// int b = 3; tipo primitivo, o comportamento é diferente
		if (a == b) {
			System.out.println("a e b são iguais");
		} else {
			System.out.println("a e b são objetos diferentes");
		}

		// se quero comprar o conteudo de um objeto String, tem que usar Equals
		if (a.equals(b)) {
			System.out.println("a e b são iguais (testa o conteudo)");
		} else {
			System.out.println("a e b são objetos diferentes");
		}
	}

}
