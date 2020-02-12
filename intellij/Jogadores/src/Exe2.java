public class Exe2 {

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ana", 100, 100, 0, 3);
        Jogador jogador2 = new Jogador("Paula", 100, 100, 0, 3);

        SessaoTreinamento treino = new SessaoTreinamento();

        System.out.println("--------Jogador 1-------");
        treino.treinarA(jogador1);
        System.out.println("--------Jogador 2--------");
        treino.treinarA(jogador2);
    }

    }

