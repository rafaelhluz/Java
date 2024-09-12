package controle;

import modelo.*;
import vizualizacao.EntradaSaida;

public class Controladora {

	public void exibeMenu() {

		Carro carro = new Carro();
		
		int opcao;
		do {
			opcao = EntradaSaida.solicitaOpcao();

			switch (opcao) {

			// construir carro
			case 0:				
				carro.setModelo(EntradaSaida.solicitaModelo());
				carro.setAnoCarro(EntradaSaida.solicitaAno());
				carro.setCor(EntradaSaida.solicitaCor());
				carro.setPotencia(EntradaSaida.solicitaPotencia());
				break;
			
			// lstar carro
			case 1:
				EntradaSaida.mostraCarro(carro);
				break;

			}
		} while (opcao != 2);

		EntradaSaida.exibeMsgEncerraPrograma();

		System.exit(0);
	}
}
