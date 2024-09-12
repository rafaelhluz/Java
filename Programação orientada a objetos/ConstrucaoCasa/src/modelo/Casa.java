package modelo;
import java.util.ArrayList;

public class Casa {
	private String descricao;
	private String cor;
	private ArrayList<Aberturas> ListaDePortas = new ArrayList<Aberturas>();
	private ArrayList<Aberturas> ListaDeJanelas = new ArrayList<Aberturas>();

	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public ArrayList<Aberturas> getListaDePortas(){
		return ListaDePortas;
	}
	public void setListasDePortas(ArrayList<Aberturas> ListaDePortas) {
		this.ListaDePortas = ListaDePortas;
	}
	public ArrayList<Aberturas> getListaDeJanelas() {
		return ListaDeJanelas;
	}
	public void setListasDejanelas(ArrayList<Aberturas> ListaDeJanelas) {
		this.ListaDeJanelas = ListaDeJanelas;
	}
	public void constroiCasa(String descricao, String cor, ArrayList<Aberturas> ListaDePortas,
			ArrayList<Aberturas> ListaDeJanelas) {
		setDescricao(descricao);
		setCor(cor);
		setListasDePortas(ListaDePortas);
		setListasDejanelas(ListaDeJanelas);
	}
	public Aberturas retornaAbertura(int posicao, String tipoAbertura) {
		if(tipoAbertura.equals("porta")) {
			return this.ListaDePortas.get(posicao);
		} else {
			return this.ListaDeJanelas.get(posicao);
		}
	}
	public void moverAbertura(Aberturas abertura, int novoEstado) {
		abertura.setEstado(novoEstado);
	}
	
	public String geraInfoCasa() {
		String informacoes = "Descrição: " + this.descricao + "\nCor: " + this.cor + this.cor + "\nLista de portas:\n";
		
		for(Aberturas abertura:this.ListaDePortas) {
			int estado = abertura.getEstado();
			informacoes += abertura.getDescricao() + " Estado: " + abertura.getEstado() + "\n";
		}
		
		informacoes += "\nLista de janelas: \n";
		
		for(Aberturas abertura:this.ListaDeJanelas) {
			int estado = abertura.getEstado();
			informacoes += abertura.getDescricao() + " Estado: " + abertura.getEstado() + "\n";
		}
		return informacoes;
	}
}
