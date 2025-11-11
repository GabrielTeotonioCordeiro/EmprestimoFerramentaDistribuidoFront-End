package servico;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class FerramentaService {

    private static IFerramenta instanciaFerramenta;

    public static IFerramenta getInstanciaFerramenta() throws Exception {
        if (instanciaFerramenta == null) {
            Registry registro = LocateRegistry.getRegistry("localhost", 1100);
            Object obj = registro.lookup("FerramentaService");
            instanciaFerramenta = (IFerramenta) obj;
        }
        return null;
    }
}
