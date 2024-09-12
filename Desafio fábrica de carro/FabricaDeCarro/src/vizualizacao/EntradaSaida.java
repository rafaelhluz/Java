package vizualizacao;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import modelo.Carro;
import modelo.CarroBase;
import modelo.CarroEsportivo;

public class EntradaSaida {

	public static int solicitaOpcao() {
		String[] opcoes = { "Construir carro", "Listar carro", "Sair do programa" };
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}

	public static void exibeMsgEncerraPrograma() {
		JOptionPane.showMessageDialog(null, "O programa será encerrado!");
	}

	public static String solicitaModelo() {
		String modelo = JOptionPane.showInputDialog("Digite o tipo do carro \n(Ex: SUV, sedan, Hatch)");
		return modelo;
	}

	public static String solicitaCor() {
		String cor = JOptionPane.showInputDialog("Digite a cor do veículo");
		return cor;
	}

	public static int solicitaAno() {

		int anoCarro = 0;

		anoCarro = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do veículo"));

		while (anoCarro > 2024 || anoCarro < 1950) {
			anoCarro = Integer
					.parseInt(JOptionPane.showInputDialog("Ano inválido! \n\nDigite o ano do veículo novamente"));
		}

		return anoCarro;
	}

	public static int solicitaPotencia() {
		
		int potencia = Integer.parseInt(JOptionPane.showInputDialog("Quantos cavalos de potência terá o seu carro?"));
		
		while (potencia < 60 || potencia > 200) {
			potencia = Integer.parseInt(JOptionPane.showInputDialog("A potência do veículo tem que estar entre 60 e 200! "
					+ "\n\nDigite novamente"));
		}
		
		return potencia;
	}

	public static void mostraCarro(Carro carro) {
		JOptionPane.showMessageDialog(null,
				"CARRO COMPLETO" + "\n\nModelo: " + carro.getModelo() + "\nCor: " + carro.getCor() + "\nPotência: "
						+ carro.getPotencia() + "\nAno de fabricação: " + carro.getAnoCarro());
	}

}
