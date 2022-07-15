public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Adicao adicao = new Adicao(20, 40);
        Multiplicacao multiplicacao = new Multiplicacao(2, 10);
        Divisao divisao = new Divisao(25, 5);
        Subtracao subtracao = new Subtracao(150, 50);
        Subtracao subtracao1 = new Subtracao(150, 20);

        try {
            calculadora.executa(adicao);
            calculadora.executa(multiplicacao);
            calculadora.executa(divisao);
            calculadora.executa(subtracao);
            calculadora.executa(subtracao1);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        for (Operacao operacao : calculadora.operacaos) {
            System.out.println(operacao);
        }


    }
}
