package controle;
import java.util.Scanner;
import dominio.Funcionario;

public class ControlaFuncionario {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o nome do funcion�rio: ");
		String nome = leia.nextLine();
		System.out.print("Digite o sal�rio base: R$ ");
		float salarioBase = leia.nextFloat();
		leia.close();

		Funcionario funcionario = new Funcionario(nome,salarioBase);
        System.out.println("Desconto - INSS: R$ " + funcionario.descontoInss());
		System.out.println("Gratifica��o   : R$ " + funcionario.gratificacao());
		System.out.println("Sal�rio l�quido: R$ " + funcionario.salarioFinal());
	}

}
