
public class Produto {

	public String nome; 
	public double preco;
	public int quantidade;
	
	public double totalValorEstoque() {
		
		return preco*quantidade;
	}
		
	
	public void add(int quantidade) {
		
		
		this.quantidade += quantidade;
		
	
	}
	public void remove (int quantidade) {
		
		
		this.quantidade -= quantidade;
		
	}
}
