import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoedaBrasilTest {

    @Test
    public void deveRetornarMoedaBrasil(){
        IMoeda moeda = MoedaFactory.obterMoeda("Brasil");
        assertEquals("R$", moeda.getSimbolo());
    }

}
