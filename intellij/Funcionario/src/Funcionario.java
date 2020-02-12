public class Funcionario {
    protected double salario;

    public double calcularSalario( double horasTrabalhadas, double valorHora){
        salario = valorHora * horasTrabalhadas;
        return salario;

    }
}
