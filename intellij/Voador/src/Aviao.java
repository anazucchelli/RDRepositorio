public class Aviao implements Voador{
    private double horasVoo;

    @Override
    public void voar() {
        this.horasVoo += 13;
        System.out.println("Estou voando como um aviao! Horas: "+this.horasVoo);
    }

    public Aviao(int horasVoo) {
        this.horasVoo = horasVoo;
    }

    public double gethorasVoo() {
        return horasVoo;
    }

    public void sethorasVoo(double horasVoo) {
        this.horasVoo = horasVoo;
    }
}
