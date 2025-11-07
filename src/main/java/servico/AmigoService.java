package servico;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AmigoService {
   private static IAmigo instanciaAmigo; 
   
   public static IAmigo getInstanciaAmigo() throws Exception{
    if(instanciaAmigo == null){
        Registry registro = LocateRegistry.getRegistry("localhost");
        Object obj = registro.lookup("Amigo");
        instanciaAmigo = (IAmigo) obj;
    }
    return instanciaAmigo;
}
}
