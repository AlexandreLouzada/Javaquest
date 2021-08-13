package controle;

import dominio.PessoaFisica;

public class ControlePessoaFisica {
	private PessoaFisica pf = new PessoaFisica(null, null, null, null);
	
	public void incluirPessoaFisica(String endereco, String telefone, String cpf, String nome) {
		pf.setEndereco(endereco);
		pf.setTelefone(telefone);
		pf.setCpf(cpf);
		pf.setNome(nome);
	}
}
