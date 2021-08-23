/*
 * 5.Um determinado material radioativo perde metade de sua massa 
 * a cada 50 segundos. Dada a massa inicial em gramas, faça um 
 * programa que determine o tempo necessário para que essa massa 
 * se torne menor que 0,5 grama. Escreva a massa inicial, a massa 
 * final e o tempo calculado em segundos.
 */

package controle;
import java.util.Scanner;
import dominio.Massa;

public class ControlaMassa {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a massa inicial em gramas: ");
		float massaInicial = leia.nextFloat();
		leia.close();
		
		Massa massa = new Massa(massaInicial);
		massa.calculaTempo();
		
		System.out.println("Massa inicial: " + massa.getMassaInicial() + " gramas");
		System.out.println("Massa final  : " + massa.getMassaFinal() + " gramas");
		System.out.println("Tempo obtido : " + massa.getTempo() + " segundos");
	}
}	
