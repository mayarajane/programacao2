package bibliotecas;

public class TestaString4 {
	public static void main(String[] args) {
			//Exercicios de exemplos 
			//implementar com a classe String, os metodos:
			//TestaString4: substrig, trim, indexOf, lastIndexOf
			String a = " Java ADS na veia ";
			System.out.println(a.substring(6, 10));
			System.out.println(a.trim());		
			System.out.println(a.indexOf("a"));	
			System.out.println(a.lastIndexOf("a"));	
			
			
			//TestaString5: isEmpty, contains, replace
			String b = "";
			System.out.println(a.isEmpty()?"Est� vazio":"N�o est� vazio");
			System.out.println(b.isEmpty()?"Est� vazio":"N�o est� vazio");		
			System.out.println(a.contains("ADS")?"Cont�m":"N�o cont�m");	
			System.out.println(b.contains("ADS")?"Cont�m":"N�o cont�m");	
			System.out.println(a.replace("ADS", "AdS"));	
	}
}
