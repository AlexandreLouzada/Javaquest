/*
 * 2.Dado três valores X,Y,Z, verificar se eles podem ser o comprimento dos
 *  lados de um triângulo e, se forem, verificar se é um triângulo, equilátero,
 *  isósceles ou escaleno. Se eles não formarem um triângulo, escreverem uma 
 *  mensagem. O comprimento de cada lado de um triângulo é menor do que a soma
 *  do comprimento dos outros dois lados; chama-se triângulo equilátero ao 
 *  triângulo que tem os comprimentos dos três lados iguais; chama-se triângulo
 *  isósceles ao triângulo que tem os comprimentos de dois lados iguais. 
 *  Portanto, todo triângulo equilátero é também isósceles; chama-se triângulo
 *  escaleno ao triângulo que tem os comprimentos dos três lados diferentes.
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
