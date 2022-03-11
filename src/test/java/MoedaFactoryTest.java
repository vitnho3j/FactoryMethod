import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MoedaFactoryTest {

    @Test
    public void deveRetornarExcessaoParaPaisInexistente(){
        try {
            IMoeda moeda = MoedaFactory.obterMoeda("Teste");
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("País Inexistente", e.getMessage());
        }
    }

    @Test public void deveRetornarExcessaoParaPaisInvalido(){
        try {
            IMoeda moeda = MoedaFactory.obterMoeda("Argentina");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("País Inválido", e.getMessage());
        }
    }
}
