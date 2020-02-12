public class Main {
    public static void main(String[] args) {
        //objeto do tipo cachorro
        Cachorro cachorro1 = new Cachorro();
        cachorro1.setRaca("Beagle");

        Cachorro cachorro2 = new Cachorro("shitzu", 10);
       // cachorro2.setRaca("Poodle");

        Gato gato1 = new Gato();
        gato1.setCor("Branca e preta");

        Macaco macaco1 = new Macaco();
        macaco1.setNome("Chita");

        Mamifero Baleia = new Mamifero();
        Baleia.setEspecie("Morcego");
//        Gato nina = new Gato();
//        Macaco chita = new Macaco();

        System.out.println(cachorro1.getRaca());
        System.out.println(cachorro2.getRaca());

        System.out.println(gato1.getCor());

        System.out.println(macaco1.getNome());

        System.out.println(Baleia.getEspecie());
//        System.out.println(nina.comer());
//        System.out.println(chita.comer());
    }
}
