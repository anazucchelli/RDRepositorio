public class Main {
    public static void main(String[] args) {
        Aviao aviao1 = new Aviao(100);
        SuperHomem superHomem1 = new SuperHomem(100);
        Pato pato1 = new Pato(100);

        TorreDeControle torre1 = new TorreDeControle();

        torre1.adicionarVoador(aviao1);
        torre1.adicionarVoador(superHomem1);
        torre1.adicionarVoador(pato1);

        torre1.voemTodos();
        torre1.voemTodos();
        torre1.voemTodos();

    }

}
