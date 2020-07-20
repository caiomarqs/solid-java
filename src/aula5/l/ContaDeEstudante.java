package aula5.l;

public class ContaDeEstudante implements Conta{

	private ManipuladorDeSaldo manipulador;
	private int milhas;

	public ContaDeEstudante() {
		manipulador = new ManipuladorDeSaldo();
	}
	
	public void deposita(double valor) {
		manipulador.deposita(valor);
		this.milhas += (int) valor;
	}

	public int getMilhas() {
		return milhas;
	}
	
	public void rende() {}
	
	public double getSaldo() {
		return manipulador.getSaldo();
	}


}