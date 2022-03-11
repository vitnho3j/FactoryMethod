import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoedaEUATest {

    @Test
    public void deveRetornarMoedaEUA(){
        IMoeda moeda = MoedaFactory.obterMoeda("EUA");
        assertEquals("$", moeda.getSimbolo());
    }

}

