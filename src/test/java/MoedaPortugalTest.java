import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoedaPortugalTest {

    @Test
    public void deveRetornarMoedaPortugal(){
        IMoeda moeda = MoedaFactory.obterMoeda("Portugal");
        assertEquals("€", moeda.getSimbolo());
    }

}

