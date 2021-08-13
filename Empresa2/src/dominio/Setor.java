package dominio;

public class Setor {
	private String sigla, descricao;
	private Funcionario[] listaFunc;
	private int i = 0;
	public Setor(String sigla, String descricao) {
		this.sigla = sigla;
		this.descricao = descricao;
		listaFunc = new Funcionario[10];
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void addFuncionario(Funcionario novoFunc) {

		if (i < listaFunc.length) {
			listaFunc[i] = novoFunc;
			i++;
			novoFunc.setSetor(this);
		}
		else
			return;
	}
	public void removeFuncionario(Funcionario exFunc) {
	}
}