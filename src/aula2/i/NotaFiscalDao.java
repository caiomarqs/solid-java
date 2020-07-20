package aula2.i;

public class NotaFiscalDao implements AcaoPosNota {

    public void executaAcao(NotaFiscal nf) {
        System.out.println("salva nf no banco");
    }
}
