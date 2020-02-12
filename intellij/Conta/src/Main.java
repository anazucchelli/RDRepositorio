public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ana Paula Alves", "123.456.789-00");

        Conta conta1 = new Conta(cliente1, 00);

        conta1.deposito(10.00);
       conta1.saque(4.00);


    }
}
