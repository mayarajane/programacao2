package bibliotecas;

public class TestaString3 {
	public static void main(String[] args) {
		String a = "Java ADS na veia";
		System.out.println(a);
		char c = a.charAt(5); //zero based
		System.out.println(""+c);
		int i = a.length();  //non zero based (conta a partir de 1) - retorna um inteiro que é o tamanho da string
		System.out.println(""+i); 
		
		
	}
}
