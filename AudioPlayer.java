import java.util.ArrayList;
import java.util.List;

public class AudioPlayer {
    private State state;
    private boolean playing;
    private List<String> playlist;
    private String faixaAtual;

    public AudioPlayer() {
        this.state = new ReadyState(this);
        this.povoarPlaylist();
        this.playing = true;
        this.faixaAtual = this.playlist.get(0);
    }

    private void povoarPlaylist() {
        this.playlist = new ArrayList<String>();

        this.playlist.add("Jorge & Matheus - Os anjos cantam");
        this.playlist.add("Matheus & Kaua - Que sorte a nossa");
        this.playlist.add("Anitta - Medicina");
        this.playlist.add("Luísa Sonza - Sagrado profano");
        this.playlist.add("Felipe Amorim - Teus sinais");
        this.playlist.add("Nattan - Amor na praia");
        this.playlist.add("Anavitória - Dengo");
        this.playlist.add("Henrique & Juliano - Briga feia");
        this.playlist.add("Lagum - Oi");
        this.playlist.add("Manim Vaqueiro - Forró e desmantelo");
        this.playlist.add("Marília Meendonça - Esqueça-me se for capaz");
        this.playlist.add("Dilsinho - Refém");

    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public boolean isPlaying() {
        return playing;
    }

    public String startPlayback() {
        return this.faixaAtual;
    }

    public void clickNextTrack() {
        this.state.clickNext();
    }

    public void clickPreviousTrack() {
        this.state.clickPrevious();
    }

    public String nextTrack() {
        int index = this.playlist.indexOf(this.faixaAtual);

        if (index + 1 == this.playlist.size()) {
            this.faixaAtual = this.playlist.get(0);
            this.playing = false;
        } else
            this.faixaAtual = this.playlist.get(index + 1);

        return this.faixaAtual;
    }

    public String previousTrack() {
        int index = this.playlist.indexOf(this.faixaAtual);

        if (index == 0)
            this.faixaAtual = this.playlist.get(0);
        else
            this.faixaAtual = this.playlist.get(index - 1);

        return this.faixaAtual;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void stop() {
        this.state.clickStop();
    }

    public void play() {
        this.state.clickPlay();
    }

    @Override
    public String toString() {
        int indiceFaixaAtual = this.playlist.indexOf(this.faixaAtual) + 1;
        String reproduzindoString = this.playing ? "sim" : "não";

        return "Faixa Atual (" + indiceFaixaAtual + "/" + this.playlist.size() + "): " +
                this.faixaAtual + ". Reproduzindo: " + reproduzindoString + ". Estado: " + this.state;
    }

}
