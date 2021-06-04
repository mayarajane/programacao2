package colecoes;

import java.util.ArrayList;
import java.util.List;

import ooavc.Conta3;

public class TestaLista2 {
	public static void main(String[] args) {
		List listaCursos = new ArrayList();
		listaCursos.add("ADS");
		listaCursos.add("Redes");
		listaCursos.add("Matematica");
		
		Conta3 c1 = new Conta3();
		Conta3 c2 = new Conta3();
		Conta3 c3 = new Conta3();
		c1.depositar(100);
		c2.depositar(200);
		c3.depositar(300);
		c1.setNumero(1);
		c2.setNumero(2);
		c3.setNumero(3);
		
		List<Conta3> contas = new ArrayList<>();
		//List contas = new ArrayList();
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		
		System.out.println("Tamanho da colecao de contas: "+contas.size());
		for (int i = 0; i < contas.size(); i++) {
			Conta3 cTemp = contas.get(i);
			System.out.println("Numero da conta"+cTemp.getNumero());
			System.out.println("Saldo: "+cTemp.getSaldo());	
		}	
	}
}
