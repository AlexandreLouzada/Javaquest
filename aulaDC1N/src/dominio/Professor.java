package dominio;

public class Professor {
	private String matricula, cpf, nome;
	private Curso curso;
	public Professor(String matricula, String cpf, String nome) {
		this.matricula = matricula;
		this.cpf = cpf;
		this.nome = nome;
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
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}
