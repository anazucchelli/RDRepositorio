public class ContaPoupaca extends Conta{
    private double taxaJuros;

    //Construtor

    public ContaPoupaca(Cliente cliente, double saldo, double taxaJuros) {
        super(cliente, saldo);
        this.taxaJuros = taxaJuros;
    }

    public ContaPoupaca(){
    }

    //METODOS
//    public double calcularJuros(double valor, double juros){
//        this.taxaJuros = (valor*juros)+valor;
//        System.out.println("O valor do juros é de " +juros+ " Total após juros "+this.taxaJuros);
//        return taxaJuros;
    //}

    //outro exemplo
    public void calcularJuros() {
        double saldoConta = getSaldo() + (taxaJuros * getSaldo());
        setSaldo(saldoConta);
    }
        //GET E SET

        public double getTaxaJuros(){
            return taxaJuros;
        }

        public void setTaxaJuros(double taxaJuros){
            this.taxaJuros = taxaJuros;
        }

    }
