package bibliotecas;

public class Cliente2 {

	String nome;
	String endereco;
	
	public Cliente2(String nome) {
		this.nome=nome;
	}
	
	public String toString() {
		return "Nome do cliente: "+this.nome;
	}
	
	public Cliente2(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
}
