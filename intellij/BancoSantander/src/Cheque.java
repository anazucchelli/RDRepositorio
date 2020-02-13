public class Cheque extends Conta {
    private double valor;
    private String banco;
    private String data;

    public Cheque(Cliente cliente, double saldo, double valor, String banco, String data) {
        super(cliente, saldo);
        this.valor = valor;
        this.banco = banco;
        this.data = data;
    }

    public Cheque(double valor, String banco, String data) {
        this.valor = valor;
        this.banco = banco;
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

