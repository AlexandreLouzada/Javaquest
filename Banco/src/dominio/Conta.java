package dominio;

public class Conta {
	private int numero;
	private double saldo;
	private Cliente correntista;

	public Conta(int numero, double saldo, Cliente correntista) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.correntista = correntista;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCorrentista() {
		return correntista;
	}

	public void setCorrentista(Cliente correntista) {
		this.correntista = correntista;
	}
	
	public void consultar() {
		System.out.println("Dados da conta");
		System.out.println("Número.....:"+numero);
		System.out.println("Saldo......:"+saldo);
		System.out.println("Correntista");
		correntista.consultar();
	}
	
}
