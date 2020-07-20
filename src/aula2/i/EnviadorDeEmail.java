package aula2.i;

public class EnviadorDeEmail implements AcaoPosNota{
	public void executaAcao(NotaFiscal nf) {
		System.out.println("envia email da nf " + nf.getId());
	}
}
