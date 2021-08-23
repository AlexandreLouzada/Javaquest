package controle;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;
import dominio.Mae;

public class ControlaMae {
	public static void main(String[] args) throws ParseException {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o CPF: ");
		String cpf = leia.nextLine();
		System.out.print("Digite o nome: ");
		String nome = leia.nextLine();
		System.out.print("Digite a data de nascimento: ");
		String dataDigitada = leia.nextLine();
		
		DateFormat f = DateFormat.getDateInstance();
		Date data = f.parse(dataDigitada);
		
		System.out.print("Digite o primeiro valor da pressão: ");
		int pressao1 = leia.nextInt();
		System.out.print("Digite o segundo valor da pressão: ");
		int pressao2 = leia.nextInt();
		leia.close();
		
		Mae mamae = new Mae(cpf,nome,data,pressao1,pressao2);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("DADOS DA MÃE");
		System.out.println("CPF: " + mamae.getCpf());
		System.out.println("Nome: " + mamae.getNome());
		System.out.println("Data de nascimento: " + sdf.format(mamae.getData()));
		//System.out.println("Data de nascimento: " + mamae.getData());
	}

	
}
