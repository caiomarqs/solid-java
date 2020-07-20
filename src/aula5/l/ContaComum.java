package aula5.l;

public class ContaComum implements Conta{
	private ManipuladorDeSaldo manipulador;

	public ContaComum() {
		manipulador = new ManipuladorDeSaldo();
	}

	public void deposita(double valor) {
		this.manipulador.deposita(valor);
	}

	public void saca(double valor) {
		this.manipulador.saca(valor);
	}
	
	public void rende(){
		this.manipulador.rende(1.1);
	}
	
	
	public double getSaldo() {
		return manipulador.getSaldo();
	}
}
