 public class Conta {
     private double saldo;
     private Cliente cliente;

     //construtor
     public Conta(Cliente cliente, double saldo) {
         this.cliente = cliente;
         this.saldo = saldo;
     }

     //metodos
     public void deposito(double quantiaDinheiro) {
         if (quantiaDinheiro > 0) {
             this.saldo += quantiaDinheiro;
             System.out.println("Deposito realizado com sucesso!");
         } else {
             System.out.println("Valor inválido para depósito...");
         }
     }

     public void saque(double quantiaDinheiro) {
         if (saldo >= quantiaDinheiro) {
             this.saldo -= quantiaDinheiro;
             System.out.println("Seu saldo é " + saldo);
         } else {
             System.out.println("Saldo insuficiente");
         }
     }

     //get e set
     public double getSaldo() {
         return saldo;
     }

     public void setSaldo(double saldo) {
         this.saldo = saldo;
     }

     public Cliente getCliente() {
         return cliente;
     }

     public void setCliente(Cliente cliente) {
         this.cliente = cliente;
     }
 }

