import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(1, "Ana", "123", "456");
        Conta conta1 = new Conta(cliente1, 1000.00);

        System.out.println("---------------Conta Poupança------------------");
        ContaPoupaca contaPoupaca1 = new ContaPoupaca(cliente1, 50, 0.1);
        contaPoupaca1.calcularJuros();
        contaPoupaca1.sacar(30);
        contaPoupaca1.sacar(60);
        contaPoupaca1.depositar(2.00);


        System.out.println("---------------Conta Corrente------------------");
        ContaCorrente contaCorrente1 = new ContaCorrente(cliente1, 100.00, 100.00);
        contaCorrente1.depositarCheque(20.00,"", "12");
        contaCorrente1.sacar(200.00);
        contaCorrente1.sacar(1200.00);


        conta1.sacar(50);
        conta1.depositar(0.30);
        contaPoupaca1.calcularJuros();








        //System.out.println("--------------------------------------------------------");


    }
}
