public class TelaResultadoPercentual implements EnqueteListener {
    @Override
    public void novoVoto(EnqueteEvent event) {
        int totalVotos = event.getTotalVotos();
        int votos = event.getVotos();
        double percentual = (double) votos / totalVotos * 100;
        System.out.println("Percentual de votos para " + event.getOpcao() + ": " + percentual + "%");
    }
}
