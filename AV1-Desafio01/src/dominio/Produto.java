package dominio;

public class Produto {
	
	private int codigo;
	private int quantidade;
	private double valorUnitario;
	private int formaPagamento;

	public Produto(int codigo, int quantidade, double valorUnitario, int formaPagamento) {
		 
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
		this.formaPagamento = formaPagamento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(int formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public double calculaDesconto() {
	    double total=0;
		if (formaPagamento == 1)
			total=(valorUnitario*quantidade)*10/100;
		else if (formaPagamento == 2)
			total=(valorUnitario*quantidade)*2/100;
		else if (formaPagamento == 3 || formaPagamento == 4)
			total=(valorUnitario*quantidade)*5/100;
		return total;
	}
			
		public double valorFinal() {
			return quantidade*valorUnitario-calculaDesconto();				
	}
	
}