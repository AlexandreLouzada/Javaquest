package dominio;

public class Mensalista extends Funcionario {
	private double salarioBase;

	public Mensalista(String nome, String endereco, String dataNasc, String email, String telefone, char sexo, double salarioBase) {
		super(nome, endereco, dataNasc, email, telefone, sexo);
		this.salarioBase = salarioBase;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
}
