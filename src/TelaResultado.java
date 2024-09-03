public class TelaResultado implements EnqueteListener {
    @Override
    public void novoVoto(EnqueteEvent event) {
        System.out.println("Votos para " + event.getOpcao() + ": " + event.getVotos());
    }
}
