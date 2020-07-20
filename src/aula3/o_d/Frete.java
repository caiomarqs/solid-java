package aula3.o_d;

public class Frete implements Entrega{
	public double destino(String cidade) {
		if ("SAO PAULO".equals(cidade.toUpperCase())) {
			return 15;
		}
		return 30;
	}
}
