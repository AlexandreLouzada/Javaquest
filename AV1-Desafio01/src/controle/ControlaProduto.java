/*
 * 1.Fa�a um programa que leia o c�digo, a quantidade, o pre�o unit�rio e 
 * a forma de pagamento:
 * (1 � Dinheiro, 2 � Cheque, 3 � Cart�o d�bito, 4 � Cart�o cr�dito) 
 * de um produto. Pagamentos em dinheiro recebem um desconto de 10%, 
 * em cart�o 5% e em cheque 2%. O programa deve informar o valor do 
 * desconto e o valor final a pagar.
 */

package controle;
import java.util.Scanner;
import dominio.Produto;

public class ControlaProduto {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o c�digo do produto....: ");
		int codigo = leia.nextInt();
		System.out.print("Digite quantidade.............: ");
		int quantidade = leia.nextInt();
		System.out.print("Digite o valor unit�rio.......: ");
		double valorUnitario=leia.nextDouble();
		System.out.print("Digite a forma de pagamento...: ");
		int formaPagamento=leia.nextInt();
		
		Produto produto = new Produto(codigo,quantidade,valorUnitario,formaPagamento);
        
		System.out.println("---------------------------------------");
		System.out.println("Desconto.......: R$ " + produto.calculaDesconto());
		System.out.println("Valor final....: R$ " + produto.valorFinal());
		System.out.println("---------------------------------------");
	}

}
