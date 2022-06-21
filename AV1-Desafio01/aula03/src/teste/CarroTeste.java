package teste;

import org.junit.Test;

import java.time.LocalDate;

public class CarroTest {

    @Test(expected = IllegalArgumentException.class)
    public void testExcecaoAoCriarCarroComAnoDeLancamentoInvalido() {
        new Carro("Mustang", "Ford", 2018, LocalDate.now());
    }

}