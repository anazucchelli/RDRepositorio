public class Cliente {
    private String nome;
    private String CPF;

    //construtor
    public Cliente(String nome, String CPF){
        this.nome = nome;
        this.CPF = CPF;
    }

    //GET E SET
    public String getNome(){
        return nome;
    }
    public void setNome(String nomeNome) {
        this.nome = nomeNome;
    }

    public String getCPF(){
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }



}
