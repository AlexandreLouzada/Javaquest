package dominio;

public class Clube {
	private String nome;
	private int vitorias;
	private int derrotas;
	private int empates;
	public Clube(String nome, int vitorias, int derrotas, int empates) {
		super();
		this.nome = nome;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	public int obterJogos() {
		return vitorias+empates+derrotas;
	}
	public int obterPontosGanhos() {
		return vitorias*3+empates;
	}	
	public int obterPontosPerdidos() {
		return derrotas*3+empates*2;
	}	
	public float obterAproveitamento() {
		float ganhos = (float) obterPontosGanhos();
		float jogos = (float) obterJogos();
		float apr = (ganhos/jogos*3)*100;
		return apr;
	}
}
