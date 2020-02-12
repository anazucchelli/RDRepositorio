public class Jogador {
    private String nome;
    public int energia;
    public int alegria;
    public int gol;
    public int experiencia;
//metodos
    public void fazerGol(){
        if(this.energia>=5){
            this.energia-=5;
            this.alegria+=10;
            this.gol++;

            System.out.println("Goooool");
        }else{
            System.out.println("Sem energia");
        }
    }

    public void correr(){
        if (this.energia >= 10){
            this.energia -=10;
            System.out.println("Cansei!");
        }else{
            System.out.println("Sem energia");
        }
    }

    //construtor
    public Jogador(String nome, int energia, int alegria, int gol, int experiencia) {
        this.nome = nome;
        this.energia = energia;
        this.alegria = alegria;
        this.gol = gol;
        this.experiencia = experiencia;
    }

    //get e set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    public int getGol() {
        return gol;
    }

    public void setGol(int gol) {
        this.gol = gol;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}
