package controle;
import java.util.Scanner;
import dominio.Curso;
import dominio.Professor;

public class Programa {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String matricula, cpf, nome;
		System.out.println("CADASTRO DE CURSO");
		System.out.print("Digite o codigo: ");
		int codigo = leia.nextInt();
		System.out.print("Digite a descri??o: ");
		String descricao = leia.next();
		
		Curso curso = new Curso(codigo, descricao);
		System.out.println("CADASTRO DE PROFESSORES");
		for (int i = 0; i <= 2; i++) {
			System.out.print("Digite a matricula: ");
			matricula = leia.next();
			System.out.print("Digite o CPF: ");
			cpf = leia.next();
			System.out.print("Digite o nome: ");
			nome = leia.next();
			Professor prof = new Professor(matricula, cpf, nome);
			curso.addProfessor(prof);
		}
		leia.close();
	}
}