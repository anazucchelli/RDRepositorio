public class Contrato implements  Imprimivel{

    public String nome;
    public String tipo;

    //construtor
  public Contrato(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }


    //interface
    public void imprimir() {
        System.out.println("Sou um contrato muito legal "+this.nome+"."+this.tipo);
    }

    //get e set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
