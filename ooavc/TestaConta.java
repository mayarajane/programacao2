package ooavc;
import ooavc.Conta;
import ooavc.ContaPoupanca;

public class TestaConta {
	public static void main(String[] args) {
		// operação de declaração
		//So criou a referência, o ponteiro
		
		//Operação de Instanciação
		//Conta c1 = new Conta();
		//c1.setNumero(001);
		
		//Fazendo instanciacao e declaracao na mesma linha
		Conta c1 = new ContaPoupanca();
		//System.out.println(c1.getNumero());
		c1.numero = 001;
		c1.nome = "Danilo";
		c1.saldo = 1000.00;
		c1.limite = 100.00;
		
		System.out.println("Número Conta: "+c1.numero);
		System.out.println("Titular: "+c1.nome);
		System.out.println("Saldo atual: "+c1.saldo);
		System.out.println("Limite "+c1.limite);
		
		double valorSaque = 20000;
		boolean resultado = c1.realizarSaque(valorSaque);
//		if(c1.realizarSaque(valorSaque))
		if(resultado) {
		  System.out.println("Você sacou R$:"+valorSaque+ " e seu saldo atual é: "+c1.saldo);
		  
		  }	else {
			  System.out.println("Saque não autorizado, você sacou além do limite");
		}
		//System.out.println("Saldo atual: "+c1.saldo);
	}
		
}
