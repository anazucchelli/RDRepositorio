import java.util.Date;

public class ContaCorrente extends Conta {
    private double chequeEspecial;

    //construtor
    public ContaCorrente(Cliente cliente, double saldo, double chequeEspecial) {
        super(cliente, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    //metodos

    public void depositarCheque(double valorCheque, String banco, String dataPagamento) {
        if (valorCheque > 0) {
            double saldo = getSaldo();
            double resultado = saldo += valorCheque;
            this.setSaldo(resultado);
            System.out.println(saldo);
            System.out.println("Depósito de " + valorCheque + " realizado com sucesso!");
            System.out.println("Seu saldo atual é " + getSaldo());
        } else {
            System.out.println("Depósito não realizado");
        }

    }
//outro jeito
public void depositarCheque(Cheque cheque) {
    depositar(cheque.getValor());
    System.out.println(cheque.getBanco());
    System.out.println(cheque.getData());
}




    @Override
    public void sacar(double quantiaDinheiro) {
        //chequeEspecial = 1000.00;
        double saldo = getSaldo();
        if (chequeEspecial >= quantiaDinheiro) {
            double resultado = saldo -= quantiaDinheiro;
            this.setSaldo(resultado);
        }
    }

    //outro jeito

//    @Override
//    public void sacar(double sacar) {
//        double saldo = getSaldo();
//        if (saldo >= sacar){
//            saldo -= sacar;
//            setSaldo(saldo);
//
//   }    else if(sacar <= (saldo+this.limite){
            //          double diferenca = sacar - saldo;
    //                  setSaldo(0);
    //                  this.limite -= diferenca;

    //                  setSaldo(saldo-sacar);
 //               else {
    //            System.out.println("chore");
    //        }
    //
    //    }



    //get e set
    public double getChequeEspecial() {
        return chequeEspecial;
    }
    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
}
