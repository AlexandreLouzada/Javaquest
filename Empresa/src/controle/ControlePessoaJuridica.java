package controle;

import dominio.PessoaJuridica;

public class ControlePessoaJuridica {
	private PessoaJuridica pj = new PessoaJuridica(null, null, null, null);
	
	public void incluirPessoaJuridica(String endereco, String telefone, String cnpj, String razaoSocial) { 
		pj.setEndereco(endereco);
		pj.setTelefone(telefone);
		pj.setCnpj(cnpj);
		pj.setRazaoSocial(razaoSocial);
	}
}
