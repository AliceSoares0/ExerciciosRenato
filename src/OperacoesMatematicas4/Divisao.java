package OperacoesMatematicas4;

public class Divisao extends Operacoes {

    public Divisao(double valor1, double valor2) {
        setValor1(valor1);
        setValor2(valor2);
    }

    public Divisao(){
        setValor1(1);
        setValor2(2);
    }

    @Override
    public double calcula() {
        return (getValor1()/getValor2());
    }
}
