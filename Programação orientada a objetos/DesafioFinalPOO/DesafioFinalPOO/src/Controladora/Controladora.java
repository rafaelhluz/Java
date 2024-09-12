package Controladora;

import javax.swing.JOptionPane;

import Modelo.Montar;
import Vizualizacao.EntradaSaida;

public class Controladora {

	Montar pc = new Montar();

	public void exibeMenu() {

		int opcao = 0;

		do {

			opcao = EntradaSaida.escolherOpcao();

			switch (opcao) {

			// opção montar
			case 0:
				int qtdPc = EntradaSaida.qtdPc();
				while (qtdPc <= 0) {
					JOptionPane.showMessageDialog(null, "Número inválido, aperte 'ok' para continuar.");
					qtdPc = EntradaSaida.qtdPc();
				}
				pc.fabricarPc(qtdPc);
				break;

			// listar
			case 1:
				String listaPcFabricado = pc.listarPc();
				EntradaSaida.mostrarPc(listaPcFabricado);
				break;

			// vender
			case 2:
				pc.vender();
				break;
			}

		} while (opcao != 3);

		EntradaSaida.exibeMsgEncerraPrograma();
		System.exit(0);
	}
}
