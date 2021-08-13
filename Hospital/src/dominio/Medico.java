package dominio;
import java.util.Vector;

public class Medico {
	private String crm, cpf, nome;
	private Vector<Parto> listaPartos;

	public Medico(String crm, String cpf, String nome) {
		this.crm = crm;
		this.cpf = cpf;
		this.nome = nome;
		listaPartos = new Vector<Parto>();
	}
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void addParto(Parto novoParto) {
		if (listaPartos.contains(novoParto))
			return;
		else {
			listaPartos.add(novoParto);
			novoParto.setMed(this);
		}
	}
	public void removeParto(Parto exParto) {
		if (!listaPartos.contains(exParto))
			return;
		else {
			listaPartos.remove(exParto);
			exParto.setMed(null);
		}
	}
}