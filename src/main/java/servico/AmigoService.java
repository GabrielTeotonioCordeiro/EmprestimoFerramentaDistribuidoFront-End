package servico;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AmigoService {

    private static IAmigo instanciaAmigo;

    public static IAmigo getInstanciaAmigo() throws Exception {
        if (instanciaAmigo == null) {
            Registry registroAmigo = LocateRegistry.getRegistry("localhost", 1098);
            Object obj = registroAmigo.lookup("AmigoService");
            instanciaAmigo = (IAmigo) obj;
        }
        return instanciaAmigo;
    }
}
