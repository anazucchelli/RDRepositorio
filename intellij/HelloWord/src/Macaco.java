public class Macaco extends Mamifero{

    public String nome;

    public String getNome(){
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String saltar(){
        return "Vamos de galho em galho";
    }
}
