package controle;
import java.util.Scanner;
import dominio.Amostra;

public class ControlaAmostra {
    Scanner leia=new Scanner(System.in);
    System.out.print("Numero da amostra: ");
    int amos=leia.nextInt();
    System.out.print("Conteudo de carbono: ");
    int carb=leia.nextInt();
    System.out.print("Resistencia em PSI: ");
    int psi=leia.nextInt();
    
    Amostra result=new Amostra(amos,carb,psi);
    if(amos<7 && carb>50 && psi>80000) {
        System.out.print("Resultado:Aço de Grau  "+ result.resultado());
    }
    else if(amos<7 && carb>50 && psi<80000) {
        System.out.print("Resultado:Aço de Grau "+ result.resultado2());
    }
    else if (amos<7 && carb<50 && psi<80.000) {
        System.out.print("Resultado:Aço de Grau "+ result.resultado3());
    }
    else
        System.out.print("Resultado:Aço de Grau 7");
}

}
