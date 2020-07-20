package aula3.o_d;

public class TabelaDePrecoPadrao implements TabelaDePreco {
	public double desconto(double valor) {
		if (valor > 5000)
			return 0.03;
		if (valor > 1000)
			return 0.05;
		return 0;
	}
}
