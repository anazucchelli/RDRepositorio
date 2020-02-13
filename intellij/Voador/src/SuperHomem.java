public class SuperHomem implements  Voador {
    public int experiencia;


    @Override
    public void voar() {
        this.experiencia =+ 3;
        System.out.println("Estou voando como um Campeão! Experiencia: "+this.experiencia);
    }


    public SuperHomem(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}
