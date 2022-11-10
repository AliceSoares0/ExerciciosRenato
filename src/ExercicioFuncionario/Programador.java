package ExercicioFuncionario;

public class Programador extends Funcionario {

    @Override
    public void aumentoSalario(){
        setSalario(getSalario()*1.2);
    }
}
