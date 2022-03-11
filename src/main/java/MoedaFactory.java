public class MoedaFactory {

    public static IMoeda obterMoeda(String pais){
        Class classe = null;
        Object objeto = null;

        try {
            classe = Class.forName(pais);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("País Inexistente");
        }
        if (!(objeto instanceof IMoeda)) {
            throw new IllegalArgumentException("País Inválido");
        }
        return (IMoeda) objeto;
    }

}
