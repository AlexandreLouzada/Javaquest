package dominio;

public class Funcionario {
	private String matricula, cpf, nome;
	private float salario;
	
	public Funcionario(String matricula, String cpf, String nome, float salario) {
		this.matricula = matricula;
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
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

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
}
