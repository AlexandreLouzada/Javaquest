package teste;


import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class ColecionadorTest {

    @Test
    public void testCarroComAnoDeLancamentoMaisAntigo() {
        Colecionador devmedia = new Colecionador("DevMedia");

        Carro carro1 = new Carro("Mustang", "Ford", 1994, LocalDate.now());
        Carro carro2 = new Carro("Enzo", "Ferrari", 2002, LocalDate.now());
        Carro carro3 = new Carro("Urus", "Lamborghini", 2017, LocalDate.now());

        devmedia.getColecao().add(carro1);
        devmedia.getColecao().add(carro2);
        devmedia.getColecao().add(carro3);

        Assert.assertEquals(1994, devmedia.obterAnoDoCarroMaisAntigo());
    }

}