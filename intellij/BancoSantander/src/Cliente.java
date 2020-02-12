public class Cliente {
    private int idCliente;
    private String sobrenome;
    private String RG;
    private String CPF;

    //CONSTRUTOR
    public Cliente(int idCliente, String sobrenome, String RG, String CPF) {
        this.idCliente = idCliente;
        this.sobrenome = sobrenome;
        this.RG = RG;
        this.CPF = CPF;
    }

    //GET E SET
    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    //------------------------------------------------------
    public String getSobrenome(){
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    //------------------------------------------------------
    public String getRG() {
        return RG;
    }
    public void setRG(String RG) {
        this.RG = RG;
    }
    //------------------------------------------------------
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

}
