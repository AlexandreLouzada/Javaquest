package dominio;

public class Funcionario {
	private String cpf, nome;
	private Setor setor;
	public Funcionario(String cpf, String nome, Setor setor) {
		this.cpf = cpf;
		this.nome = nome;
		this.setor = setor;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf ) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public String mostraSetor() {
		return setor.getDescricao();
	}
	
}