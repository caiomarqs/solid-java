package aula2.o;

import java.util.List;

public class GeradorDeNotaFiscal {
	
	private List<AcaoPosNota> acoes;

	public GeradorDeNotaFiscal(List<AcaoPosNota> acoes) {
		this.acoes = acoes;
	}

	public NotaFiscal gera(Fatura fatura) {

		double valor = fatura.getValorMensal();

		NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

		acoes.forEach(acao -> acao.executaAcao(nf));

		return nf;
	}

	private double impostoSimplesSobreO(double valor) {
		return valor * 0.06;
	}
}
