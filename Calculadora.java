import java.util.ArrayList;
import java.util.List;

public class Calculadora {

    List<Operacao> operacaos = new ArrayList<>();

    public double executa (Operacao operacao){
        operacaos.add(operacao);
        return operacao.calcula();
    }



}
