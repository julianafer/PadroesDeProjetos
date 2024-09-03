import java.util.ArrayList;
import java.util.List;

public class EnqueteSimples {
    private String[] opcoes;
    private int[] votos;
    private List<EnqueteListener> listeners = new ArrayList<>();

    public EnqueteSimples(String[] opcoes) {
        this.opcoes = opcoes;
        this.votos = new int[opcoes.length];
    }

    public String[] getOpcoes() {
        return opcoes;
    }

    public int getTotalVotos() {
        int total = 0;
        for (int voto : votos) {
            total += voto;
        }
        return total;
    }

    public int getVotos(int index) {
        return votos[index];
    }

    public void addEnqueteListener(EnqueteListener listener) {
        listeners.add(listener);
    }

    public void votar(int index) {
        if (index >= 0 && index < votos.length) {
            votos[index]++;
            disparaNovoVoto(opcoes[index]);
        }
    }

    private void disparaNovoVoto(String opcao) {
        EnqueteEvent event = new EnqueteEvent(opcao, this);
        for (EnqueteListener listener : listeners) {
            listener.novoVoto(event);
        }
    }
}
