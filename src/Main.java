import java.util.Scanner;

public class Main {

	

	public static void main(String[] args) {
		
		int quantidadeAdd = 0 ;
		int quantidadeRemove = 0 ;
		
		
		Scanner sca = new Scanner(System.in);
		
		Produto produtoNovo = new Produto();
		
		System.out.println("Informe o nome do produto");
		produtoNovo.nome = sca.next();
		
		System.out.println("Informe o valor do produto");
		produtoNovo.preco = sca.nextDouble();
		
		System.out.println("Informe qual a quantidade no estoque");
		produtoNovo.quantidade = sca.nextInt();		
		
		
		System.out.println("Produto:"+produtoNovo.nome+ " , quantidade no estoque, "+produtoNovo.quantidade+ " valor unidade R$ "+produtoNovo.preco+ ", valor total R$ "+produtoNovo.totalValorEstoque() );
		
		System.out.println("Quantos desse produto você vai adicionar no estoque ?");
		quantidadeAdd = sca.nextInt();
		produtoNovo.add(quantidadeAdd);
		
		
		System.out.println("Produto:"+produtoNovo.nome+ " , quantidade no estoque, "+produtoNovo.quantidade+ " valor unidade R$ "+produtoNovo.preco+ ", valor total R$ "+produtoNovo.totalValorEstoque() );
		
		
		System.out.println("Quantos desse produto você vai tirar do estoque ?");
		quantidadeRemove = sca.nextInt();
		produtoNovo.remove(quantidadeRemove);
		
		
		System.out.println("Produto:"+produtoNovo.nome+ " , quantidade no estoque, "+produtoNovo.quantidade+ " valor unidade R$ "+produtoNovo.preco+ ", valor total R$ "+produtoNovo.totalValorEstoque() );
		
		
		
		
		
		
		
		

	}

}
