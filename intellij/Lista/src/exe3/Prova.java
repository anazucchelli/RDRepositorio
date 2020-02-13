package exe3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Prova {

    public void somaTotal(Set<Integer>conjuntoDeInteiros){

        int soma = 0;
        for (Integer conjuntoDeInteiro : conjuntoDeInteiros) {
            soma += conjuntoDeInteiro;
        }
        System.out.println(conjuntoDeInteiros);

    }
}
