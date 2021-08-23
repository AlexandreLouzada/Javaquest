package controle;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o endere�o: ");
		String endereco = leia.nextLine();
		System.out.print("Digite o telefone: ");
		String telefone = leia.nextLine();
		System.out.print("Digite 1 para PF e 2 para PJ: ");
		int opcao = leia.nextInt();
		leia.close();
		
		switch (opcao) {
			case 1:
				System.out.println("PESSOA F�SICA");
				System.out.print("Digite o CPF: ");
				String cpf = leia.next();
				System.out.print("Digite o nome: ");
				String nome = leia.next();
				
				ControlePessoaFisica contPf = new ControlePessoaFisica();
				
				contPf.incluirPessoaFisica(endereco, telefone, 
						cpf, nome);
				break;
			case 2:
				System.out.println("PESSOA JUR�DICA");
				System.out.print("Digite o CNPJ: ");
				String cnpj = leia.next();
				System.out.print("Digite a Raz�o Social: ");
				String razaoSocial = leia.next();
				
				ControlePessoaJuridica contPj = new ControlePessoaJuridica();
				
				contPj.incluirPessoaJuridica(endereco, telefone, 
						cnpj, razaoSocial);
				break;
			default:
				System.out.println("Op��o Inv�lida");
		}
	}
}
