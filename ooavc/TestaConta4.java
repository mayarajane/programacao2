package ooavc;

public class TestaConta4 {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.numero = 001;
		c1.nome = "Rodrigo";
		
		Conta c2 = new Conta();
		c2.numero = 001;
		c2.nome = "Rodrigo";
		
		c1 = c2;
		
		if (c1 == c2) { //avalia uma expressao logica
			System.out.println("As contas s�o iguais");
		} else {
			System.out.println("As contas N�O s�o iguais");
		}	
		
//		int i; //declaracao
//		int j; //declaracao
//		i = 2; //inicializacao
//		j = 2; //inicializacao
//		
//		if (i == j) { //avalia uma expressao logica
//			System.out.println("s�o iguais");
//		} else {
//			System.out.println("N�O s�o iguais");
//		}
	}
}
