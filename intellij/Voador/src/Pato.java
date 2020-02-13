public class Pato implements Voador {
    public  int energia;


    @Override
    public void voar() {
        if (this.energia < 5) {
            System.out.println("Pato, voce não tem energia pra voar");
        } else {
            this.energia -= 5;
            System.out.println("Estou voando como um pato! Energia: "+this.energia);
        }
    }


    public Pato(int energia) {
        this.energia = energia;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
}
