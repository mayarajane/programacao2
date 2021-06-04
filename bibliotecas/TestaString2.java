package bibliotecas;

public class TestaString2 {
	public static void main(String[] args) {
		String a = "Java ADS na veia";
		String b[] = a.split(" ");
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		//System.out.println(b[4]); excedeu o tamanho do vetor
		
		String c = "java ads na veia";
		System.out.println("\nCompara a com c: "+a.compareTo(c));
		System.out.println("Compara c com a: "+c.compareTo(a));
		System.out.println("Compara a com c ignore case: "+a.compareToIgnoreCase(c));
		System.out.println("To lower case a: "+a.toLowerCase());
		System.out.println("To uper case a: "+a.toUpperCase());
		
		
		int i = a.compareTo(a); //comparação
		System.out.println("\nI: "+i);
		int j = a.compareTo(c);
		System.out.println("J: "+j);	
		int k = a.compareToIgnoreCase(c);
		System.out.println("K: "+k);
		
		
		a.toLowerCase();
		System.out.println("\nA: "+a); // minusculo
		System.out.println("A: "+a.toLowerCase());
		String e = a.toLowerCase();
		System.out.println("E: "+e);
		
		
		c.toUpperCase();
		System.out.println("\nC: "+c); // maiusculo
		System.out.println("C: "+c.toUpperCase());
		String f = c.toLowerCase();
		System.out.println("F: "+f);
	
	
	}
	
}
