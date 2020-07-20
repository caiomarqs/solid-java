package aula4.demiter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fatura {
	private String cliente;
	private double valor;
	private List<Pagamento> pagamentos;
	private boolean pago;

	public Fatura(String cliente, double valor) {
		this.cliente = cliente;
		this.valor = valor;
		this.pagamentos = new ArrayList<Pagamento>();
		this.pago = false;
	}

	public String getCliente() {
		return cliente;
	}

	public double getValor() {
		return valor;
	}

	public List<Pagamento> getPagamentos() {
		//Listas abrem encapsulamentos para lista de objetos não encapsulados
		return Collections.unmodifiableList(pagamentos); //-> metodo da api do java que não permite a alteração dessa lista
	}

	public boolean isPago() {
		return pago;
	}

	public void adicionaPagamento(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
		if(valorTotalPagamentos() > this.valor) {
			this.pago = true;	
		}
	}
	
	private double valorTotalPagamentos() {
		double total = 0;
		for(Pagamento pagamento : pagamentos) {
			total += pagamento.getValor();
		}
		return total;
	}
}
