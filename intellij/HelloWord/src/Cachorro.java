public class Cachorro extends Mamifero {
    private String raca;
    private int idade;

    public String brincar(){
        return "brincando";
    }

    public String getRaca(){
        return raca;
    }

    public void setRaca(String novaRaca) {
        this.raca = novaRaca;
    }

    //construtor
    public Cachorro(String novaRaca, int idade){
        this.raca = novaRaca;
        this.idade = idade;
    }
}

