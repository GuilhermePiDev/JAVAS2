
public class Produto {

	public String nome; 
	public double preco;
	public int quantidade;
	
	public double totalValorEstoque() {
		double precoNew = preco*quantidade ;
		
		return preco = precoNew;
	}
		
	
	public void add(int quantidade) {
		System.out.println("Quantos desse produto você vai adicionar no estoque ?");
		
		this.quantidade = quantidade ++;
		
	
	}
	public void remove (int quantidade) {
		System.out.println("Quantos desse produto você vai tirar do estoque ?");
		
		this.quantidade = quantidade --;
		
	}
}
