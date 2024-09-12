package modelo;

import vizualizacao.EntradaSaida;

public class Carro extends CarroBase {

	private int potencia;
	private int anoCarro;

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getAnoCarro() {
		return anoCarro;
	}

	public void setAnoCarro(int anoCarro) {
		this.anoCarro = anoCarro;
	}
}