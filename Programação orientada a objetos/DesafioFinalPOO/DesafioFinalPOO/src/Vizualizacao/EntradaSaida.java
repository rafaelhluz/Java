package Vizualizacao;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {

	public static int escolherOpcao() {

		String[] opcoes = { "Montar PC", "Listar PCs já montados", "Vender", "Encerrar" };
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione uma das opções abaixo", JOptionPane.OK_CANCEL_OPTION);

		return menu.getSelectedIndex();
	}

	// usuário escolhe qual processador deseja
	public static String escolherProcessador() {

		String[] opcoes = { "i9 14900K", "Ryzen 7 5700X", "i5-10400F", "Processador Ryzen 5 5600G" };
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione o processador", JOptionPane.OK_CANCEL_OPTION);

		return menu.getSelectedItem().toString();
	}

	// usuário escolhe qual placa de video deseja
	public static String escolherPlacaVideo() {

		String[] opcoes = { "RTX 4090", "RTX  2060 SUPER", "RX 5600XT", "RX 580" };
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a placa de vídeo", JOptionPane.OK_CANCEL_OPTION);

		return menu.getSelectedItem().toString();
	}

	// escolher a quantidade de ram
	public static String escolherQtdRam() {

		String[] opcoes = { "64GB DDR4", "32GB DDR4", "16GB DDR4", "8GB DDR4" };
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a quantidade de memória ram",
				JOptionPane.OK_CANCEL_OPTION);

		return menu.getSelectedItem().toString();
	}

	public static int qtdPc() {
		int qtdPc = Integer.parseInt(JOptionPane.showInputDialog("Quantos PCs você deseja montar?"));
		return qtdPc;
	}

	public static void mostrarPc(String listaPcFabricado) {
		JOptionPane.showMessageDialog(null, listaPcFabricado);
	}

	public static int venderPc() {
		int pcVendido = Integer.parseInt(
		JOptionPane.showInputDialog("Qual computador você deseja vender? \n(Digite o id do computador)"));
		return pcVendido;
	}

	public static void exibeMsgEncerraPrograma() {
		JOptionPane.showMessageDialog(null, "O programa será encerrado.");
	}
}
