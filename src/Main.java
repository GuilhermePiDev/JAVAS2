import java.util.Scanner;

public class Main {

	

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		Produto produtoNovo = new Produto();
		
		System.out.println("Informe o nome do produto");
		produtoNovo.nome = sca.next();
		
		System.out.println("Informe o valor do produto");
		produtoNovo.preco = sca.nextDouble();
		
		System.out.println("Informe qual a quantidade no estoque");
		produtoNovo.quantidade = sca.nextInt();		
		
		produtoNovo.totalValorEstoque();
		
		produtoNovo.add(0);
		
		
		System.out.println(produtoNovo.preco);
		
		
		
		

	}

}
