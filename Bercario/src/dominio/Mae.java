package dominio;

import java.util.Date;

public class Mae {
	private String cpf;
	private String nome;
	private Date data;
	private int pressao1;
	private int pressao2;
	
	public Mae(String cpf, String nome, Date data, int pressao1, int pressao2) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.data = data;
		this.pressao1 = pressao1;
		this.pressao2 = pressao2;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getPressao1() {
		return pressao1;
	}

	public void setPressao1(int pressao1) {
		this.pressao1 = pressao1;
	}

	public int getPressao2() {
		return pressao2;
	}

	public void setPressao2(int pressao2) {
		this.pressao2 = pressao2;
	}

}
