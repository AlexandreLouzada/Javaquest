package dominio;

public class PessoaJuridica extends Cliente {
	private String cnpj, razaoSocial;

	public PessoaJuridica(String endereco, String telefone, String cnpj, String razaoSocial) {
		super(endereco, telefone);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
}
