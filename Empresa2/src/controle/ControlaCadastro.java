package controle;
import dominio.*; 
import java.util.Scanner;

public class ControlaCadastro {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a sigla do Setor: ");
		String sigla = leia.nextLine();
		System.out.print("Digite a descri��o do Setor: ");
		String descr = leia.nextLine();
		Setor setor = new Setor(sigla,descr);

		System.out.print("Digite o CPF do Funcion�rio: ");
		String cpf = leia.nextLine();
		System.out.print("Digite o nome do Funcion�rio: ");
		String nome = leia.nextLine();
		
		Funcionario func = new Funcionario(cpf,nome,setor);
		setor.addFuncionario(func);
		
		System.out.println("CPF do Funcion�rio : " + func.getCpf());
		System.out.println("Nome do Funcion�rio: " + func.getNome());
		System.out.println("Nome do Setor      : " + func.mostraSetor());		
		
	}
}
