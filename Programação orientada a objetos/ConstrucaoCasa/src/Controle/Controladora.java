package Controle;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import visualizacao.EntradaSaida;
import modelo.*;

public class Controladora {

	private Casa casa = null;

	public void exibeMenu() {
		int opcao;
		do {
			opcao = EntradaSaida.solicitaOpcao();

			switch (opcao) {
			case 0:
				this.casa = new Casa();
				
				String descricao = EntradaSaida.solicitaDescricao("casa", 0);
				String cor = EntradaSaida.solicitaCor();
				int qtdePortas = EntradaSaida.solictaQtdAberturas("portas");
				int qtdeJanelas = EntradaSaida.solictaQtdAberturas("janelas");
				
				ArrayList<Aberturas> ListaDePortas = new ArrayList<Aberturas>();
					
				for (int i=0; i<qtdePortas; i++) {
					Porta porta = new Porta();
					porta.setDescricao(EntradaSaida.solicitaDescricao("porta", (i+1)));
					porta.setEstado(EntradaSaida.solicitaEstado("porta"));
					ListaDePortas.add(porta);
				}
				
				ArrayList<Aberturas> ListaDeJanelas = new ArrayList<Aberturas>();
				
				for (int i=0; i<qtdeJanelas; i++) {
					Janela janela = new Janela();
					janela.setDescricao(EntradaSaida.solicitaDescricao("janela", (i+1)));
					janela.setEstado(EntradaSaida.solicitaEstado("janela"));
					ListaDeJanelas.add(janela);
				}
				
				this.casa.constroiCasa(descricao, cor, ListaDePortas, ListaDePortas);
				break;

			case 1:
				String tipoAbertura = EntradaSaida.solicitaTipoAbertura();
				
				ArrayList<Aberturas> listaDeAberturas = new ArrayList<Aberturas>();
				
				if(tipoAbertura.equals("porta")) {
					listaDeAberturas = this.casa.getListaDePortas();
				} else {
					listaDeAberturas = this.casa.getListaDeJanelas();
				}
				
				int posicao = EntradaSaida.solicitaAberturaMover(listaDeAberturas);
				int novoEstado=0;
				
				if(posicao!=-1) {
					novoEstado = EntradaSaida.solicitaEstado(tipoAbertura);
					Aberturas abertura = this.casa.retornaAbertura(posicao, tipoAbertura);
					this.casa.moverAbertura(abertura, novoEstado);
				} else {
					EntradaSaida.exibeMsgAbertura();
				}
				break;

			case 2:
				String informacoes = this.casa.geraInfoCasa();
				EntradaSaida.exibeinfoCasa(informacoes);
				break;
			}
		} while (opcao != 3);
		
		EntradaSaida.exibeMsgEncerraPrograma();
		
		System.exit(0);
	}
}
