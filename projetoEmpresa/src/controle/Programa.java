package controle;

import dominio.Funcionario;
import dominio.Gerente;
import dominio.Vendas;

public class Programa {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("4411", "09876543212",
				"Gabriel", 1000);
		Gerente f2 = new Gerente("4422", "12345678909", 
				"Maria", 1500, 350);
		Vendas f3 = new Vendas("4433", "123456098767",
				"Fernanda", 1500, 350, 560);
		
		System.out.println("\n\nFUNCION�RIO 1");
		System.out.println("Matricula: " + f1.getMatricula());
		System.out.println("CPF: " + f1.getCpf());
		System.out.println("Nome: " + f1.getNome());
		System.out.println("Sal�rio: R$ " + f1.getSalario());
		
		System.out.println("\n\nFUNCION�RIO 2");
		System.out.println("Matricula: " + f2.getMatricula());
		System.out.println("CPF: " + f2.getCpf());
		System.out.println("Nome: " + f2.getNome());
		System.out.println("Sal�rio: R$ " + f2.getSalario());
		System.out.println("Gratifica��o: R$ " + f2.getGratificacao());
		
		System.out.println("\n\nFUNCION�RIO 3");
		System.out.println("Matricula: " + f3.getMatricula());
		System.out.println("CPF: " + f3.getCpf());
		System.out.println("Nome: " + f3.getNome());
		System.out.println("Sal�rio: R$ " + f3.getSalario());
		System.out.println("Gratifica��o: R$ " + f3.getGratificacao());
		System.out.println("Participa��o nos Lucros: R$ " + f3.getParticipacaoLucros());
	
	}
}
