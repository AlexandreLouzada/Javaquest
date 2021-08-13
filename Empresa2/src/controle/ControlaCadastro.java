package controle;
import dominio.*; 
import java.util.Scanner;

public class ControlaCadastro {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a sigla do Setor: ");
		String sigla = leia.nextLine();
		System.out.print("Digite a descrição do Setor: ");
		String descr = leia.nextLine();
		Setor setor = new Setor(sigla,descr);

		System.out.print("Digite o CPF do Funcionário: ");
		String cpf = leia.nextLine();
		System.out.print("Digite o nome do Funcionário: ");
		String nome = leia.nextLine();
		
		Funcionario func = new Funcionario(cpf,nome,setor);
		setor.addFuncionario(func);
		
		System.out.println("CPF do Funcionário : " + func.getCpf());
		System.out.println("Nome do Funcionário: " + func.getNome());
		System.out.println("Nome do Setor      : " + func.mostraSetor());		
		
	}
}
