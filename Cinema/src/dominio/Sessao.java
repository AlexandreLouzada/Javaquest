package dominio;

public class Sessao {
	private int sala;
	private String data, hora, filme;
	
	public Sessao(int sala, String data, String hora, String filme) {
		this.sala = sala;
		this.data = data;
		this.hora = hora;
		this.filme = filme;
	}

	public int getSala() {
		return sala;
	}

	public void setSala(int sala) {
		this.sala = sala;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getFilme() {
		return filme;
	}

	public void setFilme(String filme) {
		this.filme = filme;
	}
	
	public String formatarData() {
		return data.substring(6, 10) + "-" +
			   data.substring(3, 5) + "-" +
			   data.substring(0, 2);
	}
}