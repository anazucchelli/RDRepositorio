import java.util.Date;

public class ContaCorrente extends Conta{
    private double chequeEspecial;

    //construtor
    public ContaCorrente(Cliente cliente, double saldo, double chequeEspecial) {
        super(cliente, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    //metodos

    public void depositarCheque(double valorCheque, String banco, String dataPagamento){
        if(valorCheque > 0){
            double saldo = getSaldo();
            double resultado = saldo += valorCheque;
            this.setSaldo(resultado);
            System.out.println(saldo);
            System.out.println("Depósito de " + valorCheque + " realizado com sucesso!");
            System.out.println("Seu saldo atual é " + getSaldo());
        }else{
            System.out.println("Depósito não realizado");
        }

    }

    @Override
    public void sacar(double quantiaDinheiro) {
        super.sacar(quantiaDinheiro);
        chequeEspecial = 1000.00;
        if (chequeEspecial >= quantiaDinheiro){
            double saldo = getSaldo();
            double resultado = saldo -= quantiaDinheiro;
            this.setSaldo(resultado);
        }
    }

    //get e set
    public double getChequeEspecial() {
        return chequeEspecial;
    }
    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
}
