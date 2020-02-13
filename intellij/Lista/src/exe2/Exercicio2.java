package exe2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("--------Aqui os números se repetem----------");
        List<Integer> lista1 = new ArrayList<>();

        lista1.add(1);
        lista1.add(5);
        lista1.add(5);
        lista1.add(6);
        lista1.add(7);
        lista1.add(8);
        lista1.add(8);
        lista1.add(8);


        for (Integer valor : lista1) {
            System.out.println(valor);
        }
        System.out.println("--------Aqui os números não se repetem----------");
        Set<Integer> conjunto1 = new HashSet<>();
        conjunto1.add(1);
        conjunto1.add(5);
        conjunto1.add(5);
        conjunto1.add(6);
        conjunto1.add(7);
        conjunto1.add(8);
        conjunto1.add(8);
        conjunto1.add(8);

        for (Integer valor : conjunto1) {
            System.out.println(valor);
        }

    }
}
