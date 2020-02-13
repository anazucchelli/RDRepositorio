public class Foto implements Imprimivel {
    public String nome;
    public String tipo;

    //construtor
    public Foto(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }


    //interface
    @Override
    public void imprimir() {
        System.out.println("Sou uma selfie "+nome+ "." +tipo);
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
