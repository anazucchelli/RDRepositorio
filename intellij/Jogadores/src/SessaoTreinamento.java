public class SessaoTreinamento {
    private int experiencia;

//construtor
    public SessaoTreinamento(){

    }

    public SessaoTreinamento(int experiencia) {
        this.experiencia = experiencia;
    }

    public void treinarA(Jogador jogador){
        System.out.println("Experiencia inicial: "+ jogador.getExperiencia());
        this.experiencia = jogador.getExperiencia();

        jogador.correr();
        jogador.fazerGol();
        jogador.correr();

        this.experiencia++;

       jogador.setExperiencia(this.experiencia);

       System.out.println("Experiencia Final: "+jogador.getExperiencia());
    }
//get e set
    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}
