package colecoes;

import java.util.HashSet;
import java.util.Set;

public class TestaSet1 {
	public static void main(String[] args) {
		Set<String> objetos = new HashSet<String>();
		objetos.add("obj1");
		objetos.add("obj2");
		objetos.add("obj3");
		objetos.add("obj2");
		objetos.add("obj1");

		System.out.println(objetos);

		for (Object object : objetos) { // o primeiro object é o nome que da para cada unidade de coleção do objeto, o segundo é o elemento que vai ser iterado
			// String sTemp = (String) object;
			// System.out.println(sTemp);
			System.out.println("\n"+object);
		}
	}
}
