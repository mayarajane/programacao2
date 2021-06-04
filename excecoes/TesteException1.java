package excecoes;

import java.util.Iterator;

public class TesteException1 {
	public static void main(String[] args) {
		System.out.println("Inicio do Metodo main");
		metodo1();
		System.out.println("Fim do Metodo main");
		
	}

	private static void metodo1() {
		System.out.println("Inicio do Metodo 1");
		metodo2();
		System.out.println("Fim do Metodo 1");
		
		
	}

	private static void metodo2() {
		System.out.println("Inicio do Metodo 2");
		int array[];
		array = new int[10];
		try {
			for (int i=0; i < array.length; i++) {
				array[i] = i;
			System.out.println(i);
			}
		}catch (ArrayIndexOutOfBoundsException	e){
			System.out.println("Erro pego(catched)"+e);
		}
//		for (int i=0; i < array.length; i++) {
//			array[i] = i;
//		System.out.println(i);
//		}
		
		System.out.println("Fim do Metodo 2");
		
		
	}
}
