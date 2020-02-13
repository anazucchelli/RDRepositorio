package LoteriaDosSonhos;

import java.util.*;

public class Main {
    public static void main(String[] args) {
       Map<Integer, String> mapa1 = new HashMap<>();

        mapa1.put(0,"Ovos");
        mapa1.put(1, "Água");
        mapa1.put(2, "Escopeta");
        mapa1.put(3, "Cavalo");
        mapa1.put(4, "Dentista");
        mapa1.put(5, "Fogo");


        for(Integer chave : mapa1.keySet()){
            String valor = mapa1.get(chave);
            System.out.println(chave +" "+ valor);
        }




    }
}
