package ExercicioFuncionario;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Gerente();
        Funcionario funcionario2 = new Programador();

        funcionario1.setNome("Renato");
        funcionario1.setSalario(2000);

        funcionario2.setNome("Davi");
        funcionario2.setSalario(14000);

        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(funcionario1);funcionarios.add(funcionario2);

        for(Funcionario f : funcionarios){
            System.out.println(f);
            f.aumentoSalario();
            System.out.println(f);
        }
    }
}
