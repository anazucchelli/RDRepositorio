import java.util.ArrayList;
import java.util.List;

public class Impressora {
    List<Imprimivel> listaImprimiveis = new ArrayList<>();

    public Impressora() {

    }

    //metodos
    public void imprimirTudo() {
        for (int i = 0; i < listaImprimiveis.size(); i++) {
           listaImprimiveis.get(i).imprimir();
        }
    }

    public void adicionarImprimivel(Imprimivel umImprimivel) {
        this.listaImprimiveis.add(umImprimivel);
    }


}