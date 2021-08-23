package controle;
import java.util.Scanner;
import java.util.Vector;
import dominio.Medico;
import dominio.Parto;

public class Programa {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("CADASTRO DE MÉDICO");
		System.out.print("Digite o CRM: ");
		String crm = leia.nextLine();
		System.out.print("Digite o CPF: ");
		String cpf = leia.nextLine();
		System.out.print("Digite o nome: ");
		String nome = leia.nextLine();
		leia.close();
		Medico med = new Medico(crm, cpf, nome);
		System.out.println("CADASTRO DE PARTOS");
		char resposta = 'S';
		do {
			System.out.print("Digite a data: ");
			String data = leia.next();
			System.out.print("Digite a hora: ");
			String hora = leia.next();
			Parto parto = new Parto(data, hora);
			med.addParto(parto);
			System.out.print("Deseja Continuar? <S/N>: ");
			resposta = leia.next().charAt(0);
		} while (resposta == 'S' || resposta == 's');
		System.out.print("ACABOU");
	}
}