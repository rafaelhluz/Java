package modelo;

import vizualizacao.EntradaSaida;

public class CarroEsportivo extends CarroBase {

	private String Turbo;
	private int tamanhoRoda;

	public String getTurbo() {
		return Turbo;
	}

	public void setTurbo(String turbo) {
		Turbo = turbo;
	}

	public int getTamanhoRoda() {
		return tamanhoRoda;
	}

	public void setTamanhoRoda(int tamanhoRoda) {
		this.tamanhoRoda = tamanhoRoda;
	}
}
