package OperacoesMatematicas4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Operacoes operacao1 = new Soma(1, 2);
        Operacoes operacao2 = new Subtracao(4, 2);
        Operacoes operacao3 = new Multiplicacao(2, 5);
        Operacoes operacao4 = new Divisao(4, 2);
        ArrayList<Operacoes> ListaOpercaoes = new ArrayList<>();

        ListaOpercaoes.add(operacao1);ListaOpercaoes.add(operacao2);ListaOpercaoes.add(operacao3);ListaOpercaoes.add(operacao4);

        for(Operacoes o : ListaOpercaoes){
            System.out.println(o);
        }
    }
}
