package aula3.o_d;

public class CalculadoraDePrecos {
	
	TabelaDePreco tabela;
	Entrega entrega;
	
	//Ao receber no construtor que chamar a classe conseguepassa qualquer tipo de tabela e entrega...
	CalculadoraDePrecos(TabelaDePreco tabela, Entrega entrega){
		this.tabela = tabela;
		this.entrega = entrega;
	}
	
	public double calcula(Compra produto) {
		
		//Não é possivel um obsever pois não fazem as mesmas acoes!!
		double desconto = tabela.desconto(produto.getValor());
		double frete = entrega.destino(produto.getCidade());

		return produto.getValor() * (1 - desconto) + frete;
	}
}
