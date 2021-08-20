/*
 * 3.Certo a�o � classificado de acordo com o resultado de tr�s testes, que 
 * devem verificar se o mesmo satisfaz �s seguintes especifica��es:
 *Teste 1- conte�do de carbono abaixo de 7%;
 *Teste 2- dureza Rokwell maior que 50;
 *Teste 3- resist�ncia � tra��o maior do que 80.000 psi.

 *Ao a�o � atribu�do o grau 10, se passa pelos tr�s testes;
 *9, se passa apenas nos testes 1 e 2; 
 *8 , se passa no teste 1; 
 *e 7, para as outras alternativas. 

 *Supondo que sejam lidos de uma unidade de entrada o n�mero de amostra, 
 *conte�do de carbono, a dureza Rokwell e a resist�ncia � tra��o fa�a um
 *programa que leia os dados de uma amostra de a�o, escrevendo para ela 
 *o grau obtido
*/

package controle;
import java.util.Scanner;
import dominio.Amostra;

public class ControlaAmostra {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite o codigo da amostra: ");
		int codigo = leia.nextInt();
		System.out.print("O conte�do de carbono.....: ");
		int carbono = leia.nextInt();
		System.out.print("A dureza Rokwell..........: ");
		int dureza = leia.nextInt();
		System.out.print("A resist�ncia a tra��o....: ");
		int resistencia = leia.nextInt();
		
		Amostra amostra = new Amostra(codigo, carbono, dureza, resistencia);
		System.out.print("Grau da amostra do a�o....: "+ amostra.informaGrau());
	}

}
