package controle;

import dominio.Funcionario;
import dominio.Vendedor;

public class Programa {
	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario("4432","Gabriel", 1000);
		
		Vendedor func2 = new Vendedor("4433", "Maria", 1000, 400);
		
		System.out.println("FOLHA DE PAGAMENTO");
		System.out.println("Funcionário 1: " + 
				func1.getNome() + " - R$ " + 
				func1.calcularSalario());
		
		System.out.println("Funcionário 2: " + 
				func2.getNome() + " - R$ " + 
				func2.calcularSalario());
	}
}

