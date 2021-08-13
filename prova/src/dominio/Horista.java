package dominio;

public class Horista extends Funcionario {
	private double quantidadeHoras, salarioHora;
	public Horista(String nome, String endereco, String dataNasc, String email, String telefone, char sexo, double quantidadeHoras, double salarioHora) {
		super(nome, endereco, dataNasc, email, telefone, sexo);
		this.quantidadeHoras = quantidadeHoras;
		this.salarioHora = salarioHora;
	}
	public double getQuantidadeHoras() {
		return quantidadeHoras;
	}
	public void setQuantidadeHoras(double quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}
	public double getSalarioHora() {
		return salarioHora;
	}
	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}

}
