package dominio;

public class Funcionario {
	
	private String nome;
	private float salarioBase;
	
	public Funcionario(String nome, float salarioBase) {
		super();
		this.nome = nome;
		this.salarioBase = salarioBase;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public float descontoInss() {
		return salarioBase * 11/100;
	}
	
	public float gratificacao() {
		return salarioBase * 5/100;
	}
	
	public float salarioFinal() {
		return salarioBase + gratificacao() - descontoInss();
	}
}
