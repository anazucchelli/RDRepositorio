    public class Conta {
        private Cliente cliente;
        private double saldo;

    //CONSTRUTOR
        public Conta(Cliente cliente, double saldo) {
            this.cliente = cliente;
            this.saldo = saldo;
        }

       //METODOS
    public void depositar(double quantiaDinheiro){
            if(quantiaDinheiro > 0){
                this.saldo = saldo + quantiaDinheiro;
                System.out.println("Depósito de " + quantiaDinheiro + " realizado com sucesso!");
                System.out.println("Seu saldo atual é " + saldo);
            }else{
                System.out.println("Depósito não realizado");
            }
    }

    public void sacar(double quantiaDinheiro){
            if(saldo >= quantiaDinheiro){
                this.saldo = saldo - quantiaDinheiro;
                System.out.println("Saque de " + quantiaDinheiro + " realizado!");
                System.out.println("Seu saldo atual é "+saldo);
            }else{
                System.out.println("Saldo insuficiente");
            }
    }

//    public void consultaSaldo(double quantiaDinheiro){
////
////    }

    //GET E SET


        public Cliente getCliente() {
            return cliente;
        }
        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }
//-----------------------------------------------------------
        public double getSaldo() {
            return saldo;
        }
        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }
    }





