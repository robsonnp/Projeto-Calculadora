public class Adicao extends Calculadora implements Operacao {

    private double numero1;
    private double numero2;

    public Adicao(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }


    @Override
    public double calcula() { return this.numero1 + this.numero2; }

    @Override
    public String toString(){
        return "Resultado -> "+this.numero1 + " + " + this.numero2 + " = " + calcula();
    }

}
