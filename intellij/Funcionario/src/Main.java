public class Main {
    public static void main(String[] args) {
        Dev Ana = new Dev();
        GP Paula = new GP();
        DBA Lolla = new DBA();

        System.out.println(Ana.digitar());
        System.out.println(Ana.calcularSalario(10, 15));

        System.out.println(Paula.pensar());
        System.out.println(Paula.calcularSalario(10,10.33));

        System.out.println(Lolla.planejar());
        System.out.println(Lolla.calcularSalario(6, 50));
    }
}
