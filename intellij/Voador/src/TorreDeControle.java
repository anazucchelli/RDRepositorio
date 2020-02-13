import java.util.ArrayList;
import java.util.List;

public class TorreDeControle{
    List<Voador> listaVoadores = new ArrayList<>();

    public TorreDeControle() {
    }

    public  void voemTodos(){
        for(int i=0; i<listaVoadores.size(); i++){
            listaVoadores.get(i).voar();
        }
    }

    public void adicionarVoador(Voador umVoador){
        this.listaVoadores.add(umVoador);
    }
}
