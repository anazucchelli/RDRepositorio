package Apelidos;

import java.util.HashMap;
import java.util.Map;

public class Exercicio1 {
    public static void main(String[] args) {
        Map<String, String> apelidos = new HashMap<>();

        apelidos.put("João", "Juan, Fissura, Maromba");
        apelidos.put("Miguel", "Night Watch, Bruce Wayne, Tampinha");
        apelidos.put("Maria", "Wonder Woman, Mary, Marilene");
        apelidos.put("Lucas", "Lukinha, Jorge, George");

        for(String chave : apelidos.keySet()) {
            String valor = apelidos.get(chave);
            System.out.println(chave + " >> " + valor);
        }

    }
}
