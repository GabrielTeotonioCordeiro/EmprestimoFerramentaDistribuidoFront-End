package servico;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class EmprestimoService {
   private static IEmprestimo instanciaEmprestimo; 
   
   public static IEmprestimo getInstanciaEmprestimo() throws Exception{
    if(instanciaEmprestimo == null){
        Registry registro = LocateRegistry.getRegistry("localhost");
        Object obj = registro.lookup("EmprestimoService");
        instanciaEmprestimo = (IEmprestimo) obj;
    }
    return instanciaEmprestimo;
}
}
