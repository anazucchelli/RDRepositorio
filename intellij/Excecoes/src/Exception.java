import java.util.ArrayList;

public class Exception {
    public static void main(String[] args) {
        try{
            ArrayList<String> lista1 = new ArrayList<>();

            lista1.add("Ana");
            lista1.add("Paula");
            lista1.add("Alves");

            System.out.println(lista1.get(3));

        }catch(IndexOutOfBoundsException e){
            System.out.println("Ocorreu um erro: "+ e.getMessage());
            e.printStackTrace();
        }
    }
}
