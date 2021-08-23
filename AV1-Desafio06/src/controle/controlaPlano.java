/*
 * 6. Escreva um programa que calcule a distância entre dois pontos 
 * de um plano sendo fornecidas as coordenadas X1, X2, Y1, e Y2. 
 * Distância = Raiz ((X2 – X1) * (X2 – X1) + (Y2 – Y1) * (Y2 – Y1))
*/

package controle;
import java.util.Scanner;
import dominio.Plano;

public class controlaPlano {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Ponto 'A' - coordenada x: ");
		float valor1 = leia.nextFloat();
		
		System.out.print("Ponto 'A' - coordenada y: ");
		float valor2 = leia.nextFloat();
		
		System.out.print("Ponto 'B' - coordenada x: ");
		float valor3 = leia.nextFloat();
		
		System.out.print("Ponto 'B' - coordenada y: ");
		float valor4 = leia.nextFloat();
		leia.close();

		Plano plano = new Plano(valor1,valor2,valor3,valor4);
		
		System.out.print("Distância entre os dois pontos:  " + plano.calculaDistancia());
	
	}
}
