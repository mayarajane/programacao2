package bibliotecas;

public class TestaMath2 {

	public static void main(String[] args) {
		//Implementar e testar Math.exp, Math.log, Math.pow
		//Math.sqrt, log de a na base b
		double a = 36;    
		double b = 4; 
		System.out.println("\nX: "+a+" e Y:"+b);
		System.out.println("\nExp x: " +Math.exp(a));  
		System.out.println("\nLog x: " + Math.log(a));   
		System.out.println("\nLog y: " + Math.log(b));  
		System.out.println("\nPower x e y: " + Math.pow(a, b));    
		System.out.println("\nSquare y: " + Math.sqrt(b));   
	}
}