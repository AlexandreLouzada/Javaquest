package controle;
import java.util.Scanner;
import dominio.Funcionario;

public class ControlaFuncionario {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o nome do funcionário: ");
		String nome = leia.nextLine();
		System.out.print("Digite o salário base: R$ ");
		float salarioBase = leia.nextFloat();
		leia.close();

		Funcionario funcionario = new Funcionario(nome,salarioBase);
        System.out.println("Desconto - INSS: R$ " + funcionario.descontoInss());
		System.out.println("Gratificação   : R$ " + funcionario.gratificacao());
		System.out.println("Salário líquido: R$ " + funcionario.salarioFinal());
	}

}
