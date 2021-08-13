package dominio;

public class Cliente {
	private String nome;
	private String cpf;
	private String rg;
	private String endereco;
	
	public Cliente(String nome, String cpf, String rg, String endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void consultar() {
		System.out.println("Nome....:"+nome);
		System.out.println("CPF.....:"+cpf);
		System.out.println("RG......:"+rg);
		System.out.println("Endereço:"+endereco);
	}
}



