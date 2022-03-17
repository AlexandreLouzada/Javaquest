package controle;
import java.time.LocalDate;
import dominio.Carro;
import dominio.Colecionador;

public class ControlaCarro {

	public static void main(String[] args) {
        Colecionador colecionador = new Colecionador("Alexandre");

        Carro carro1 = new Carro("Mustang", "Ford", 1994, LocalDate.now());
        Carro carro2 = new Carro("Enzo", "Ferrari", 2002, LocalDate.now());
        Carro carro3 = new Carro("Urus", "Lamborghini", 2017, LocalDate.now());

        colecionador.getColecao().add(carro1);
        colecionador.getColecao().add(carro2);
        colecionador.getColecao().add(carro3);

        System.out.println(colecionador.getNome());
        System.out.println(colecionador.getColecao());
	}
}
