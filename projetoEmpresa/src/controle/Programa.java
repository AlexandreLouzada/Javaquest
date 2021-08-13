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
		
		System.out.println("\n\nFUNCIONÁRIO 1");
		System.out.println("Matricula: " + f1.getMatricula());
		System.out.println("CPF: " + f1.getCpf());
		System.out.println("Nome: " + f1.getNome());
		System.out.println("Salário: R$ " + f1.getSalario());
		
		System.out.println("\n\nFUNCIONÁRIO 2");
		System.out.println("Matricula: " + f2.getMatricula());
		System.out.println("CPF: " + f2.getCpf());
		System.out.println("Nome: " + f2.getNome());
		System.out.println("Salário: R$ " + f2.getSalario());
		System.out.println("Gratificação: R$ " + f2.getGratificacao());
		
		System.out.println("\n\nFUNCIONÁRIO 3");
		System.out.println("Matricula: " + f3.getMatricula());
		System.out.println("CPF: " + f3.getCpf());
		System.out.println("Nome: " + f3.getNome());
		System.out.println("Salário: R$ " + f3.getSalario());
		System.out.println("Gratificação: R$ " + f3.getGratificacao());
		System.out.println("Participação nos Lucros: R$ " + f3.getParticipacaoLucros());
	
	}
}
