package dominio;
public class Parto {
	private String data, hora;
//	private Medico med;
	public Parto(String data, String hora) {
		this.data = data;
		this.hora = hora;
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
	public void setMed(Medico med) {
		this.med = med;
	}
}
