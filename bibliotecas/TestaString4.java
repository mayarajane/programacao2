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
			System.out.println(a.isEmpty()?"Está vazio":"Não está vazio");
			System.out.println(b.isEmpty()?"Está vazio":"Não está vazio");		
			System.out.println(a.contains("ADS")?"Contém":"Não contém");	
			System.out.println(b.contains("ADS")?"Contém":"Não contém");	
			System.out.println(a.replace("ADS", "AdS"));	
	}
}
