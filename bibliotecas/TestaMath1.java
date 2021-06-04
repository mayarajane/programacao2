package bibliotecas;

public class TestaMath1 {
	public static void main(String[] args) {
		int i = -10;
		System.out.println(i);
		int j = Math.abs(i);
		System.out.println(j);
		System.out.println(Math.abs(i));
		
		double d1 = 4.15;
		System.out.println("\nd1: "+d1);
		double d2 = 4.0000;
		System.out.println("\nd2: "+d2);
		
		double d3 = Math.round(d1);
		System.out.println("d1: "+d3); //arredondar o inteiro mais proximo
		double d4 = Math.max(d1, d3); // da o maximo de dois ou mais numeros
		System.out.println("\nFunção max d1, d3: "+d4);
		
		
		//tarefas para a turma:
		//Implementar e testar Math.min()
		double m1 = Math.min(d1, d3);
		System.out.println("\nFunção min d1,d2: "+m1);
				
		//Funcao Ceil e floor
		System.out.println("\nFunção ceil d1: "+Math.ceil(d1)); // passa para o inteiro superior
		double d5 = 4.99999999;
		System.out.println("\nFunção floor d5: "+Math.floor(d5)); // passa para o inteiro inferior
				
		
		
	}
}
