package Modelo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Vizualizacao.EntradaSaida;

public class Montar {
	static ArrayList<Pc> montarPc = new ArrayList<Pc>();
	int cont = 0;

	public void fabricarPc(int qtdPc) {
		for (int i = 0; i < qtdPc; i++) {
			Pc pc = new Pc();
			cont++;
			pc.setId(cont);
			pc.setMemoriaRam(EntradaSaida.escolherQtdRam());
			pc.setPlacaVideo(EntradaSaida.escolherPlacaVideo());
			pc.setProcessador(EntradaSaida.escolherProcessador());
			montarPc.add(pc);
		}
	}

	public String listarPc() {
		String listaPcFabricado = "";
		for (int i = 0; i < montarPc.size(); i++) {
			listaPcFabricado += "PC GAMER" + "\nId: " + montarPc.get(i).getId() + "\nProcessador: "
					+ montarPc.get(i).getProcessador() + "\nPlaca de vídeo: " + montarPc.get(i).getPlacaVideo()
					+ "\nMemória ram: " + montarPc.get(i).getMemoriaRam() + "\n\n";
		}
		return listaPcFabricado;
	}

	public void vender() {
		int pcVendido = EntradaSaida.venderPc();
		int contador = 0;

		for (int i = 0; i < montarPc.size(); i++) {
			if (montarPc.get(i).getId() == pcVendido) {
				contador++;
				montarPc.remove(i);
			}
		}

		if (contador == 0) {
			JOptionPane.showMessageDialog(null, "Número inválido! Digite 'ok' para continuar.");
		}
	}
}
