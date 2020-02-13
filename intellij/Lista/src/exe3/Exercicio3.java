package exe3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercicio3 {
    public static void main(String[] args) {
        Set<Integer> lista1 = new HashSet<>();

        lista1.add(5);
        lista1.add(6);
        lista1.add(7);
        lista1.add(0);
        lista1.add(1);

        Prova prova1 = new Prova();
        prova1.somaTotal(lista1);

    }
}
