package dominio;

public class Funcionario {
	private String nome, endereco, dataNasc, email, telefone;
	private char sexo;
	public Funcionario(String nome, String endereco, String dataNasc, String email, String telefone, char sexo) {
		this.nome = nome;
		this.endereco = endereco;
		this.dataNasc = dataNasc;
		this.email = email;
		this.telefone = telefone;
		this.sexo = sexo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
}
