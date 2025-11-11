package servico;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class EmprestimoService {
   private static IEmprestimo instanciaEmprestimo; 
   
   public static IEmprestimo getInstanciaEmprestimo() throws Exception{
    if(instanciaEmprestimo == null){
        Registry registroEmprestimo = LocateRegistry.getRegistry(1099);
        Object obj = registroEmprestimo.lookup("EmprestimoService");
        instanciaEmprestimo = (IEmprestimo) obj;
    }
    return instanciaEmprestimo;
}
}
