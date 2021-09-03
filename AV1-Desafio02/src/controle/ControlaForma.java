/*
 * 2.Dado tr�s valores X,Y,Z, verificar se eles podem ser o comprimento dos
 *  lados de um tri�ngulo e, se forem, verificar se � um tri�ngulo, equil�tero,
 *  is�sceles ou escaleno. Se eles n�o formarem um tri�ngulo, escreverem uma 
 *  mensagem. O comprimento de cada lado de um tri�ngulo � menor do que a soma
 *  do comprimento dos outros dois lados; chama-se tri�ngulo equil�tero ao 
 *  tri�ngulo que tem os comprimentos dos tr�s lados iguais; chama-se tri�ngulo
 *  is�sceles ao tri�ngulo que tem os comprimentos de dois lados iguais. 
 *  Portanto, todo tri�ngulo equil�tero � tamb�m is�sceles; chama-se tri�ngulo
 *  escaleno ao tri�ngulo que tem os comprimentos dos tr�s lados diferentes.
 */

package controle;
import java.util.Scanner;
import dominio.Forma;

public class ControlaForma {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite primeiro valor: ");
		float lado1 = leia.nextFloat();
		
		System.out.print("Digite segundo  valor: ");
		float lado2 = leia.nextFloat();
		
		System.out.print("Digite terceiro valor: ");
		float lado3 = leia.nextFloat();

		leia.close();
		
		Forma forma = new Forma(lado1,lado2,lado3);
		
		System.out.println("Resultado da analise dos tres valores: " + forma.verificaForma());
	}

}
