package controle;
import dominio.*; 
import java.util.Scanner;

public class ControleCadastroSetor {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Setor[] listaSetor = null;
		
		for(int i=0;i<=4;i++) {
		System.out.print("Digite a sigla do Setor: ");
		String sigla = leia.nextLine();
		System.out.print("Digite a descrição do Setor: ");
		String descr = leia.nextLine();
		listaSetor[i] = new Setor(sigla,descr);
				
		}
		leia.close();
	}
}
