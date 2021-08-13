package dominio;

public class Vendedor extends Funcionario {
	private float comissao;

	public Vendedor(String matricula, String nome, float salario, float comissao) {
		super(matricula, nome, salario);
		this.comissao = comissao;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	public float calcularSalario() {
		return super.calcularSalario() + comissao;
	}
}

