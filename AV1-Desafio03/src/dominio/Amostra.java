package dominio;

public class Amostra {
	private int codigoAmostra;
	private int conteudoCarbono;
	private int durezaRokwell;
	private int resistenciaTracao;

	public Amostra(int codigoAmostra, int conteudoCarbono, int durezaRokwell, int resistenciaTracao) {
		super();
		this.codigoAmostra = codigoAmostra;
		this.conteudoCarbono = conteudoCarbono;
		this.durezaRokwell = durezaRokwell;
		this.resistenciaTracao = resistenciaTracao;
	}

		public int getCodigoAmostra() {
		return codigoAmostra;
	}

	public void setCodigoAmostra(int codigoAmostra) {
		this.codigoAmostra = codigoAmostra;
	}

	public int getConteudoCarbono() {
		return conteudoCarbono;
	}

	public void setConteudoCarbono(int conteudoCarbono) {
		this.conteudoCarbono = conteudoCarbono;
	}

	public int getDurezaRokwell() {
		return durezaRokwell;
	}

	public void setDurezaRokwell(int durezaRokwell) {
		this.durezaRokwell = durezaRokwell;
	}

	public int getResistenciaTracao() {
		return resistenciaTracao;
	}

	public void setResistenciaTracao(int resistenciaTracao) {
		this.resistenciaTracao = resistenciaTracao;
	}

	public int informaGrau(){
		if(conteudoCarbono<7 && durezaRokwell>50 && resistenciaTracao>80000) {
			return 10;
		}
		else if (conteudoCarbono<7 && durezaRokwell>50) {
			return 9;
		}
		else if (conteudoCarbono<7) {
			return 8;
		}
		else 
			return 7;
	}

}
	
