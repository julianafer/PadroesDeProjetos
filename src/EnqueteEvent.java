public class EnqueteEvent {
    private String opcao;
    private EnqueteSimples enquete;

    public EnqueteEvent(String opcao, EnqueteSimples enquete) {
        this.opcao = opcao;
        this.enquete = enquete;
    }

    public String getOpcao() {
        return opcao;
    }

    public EnqueteSimples getEnquete() {
        return enquete;
    }

    public int getVotos() {
        int index = findOpcaoIndex(opcao);
        return enquete.getVotos(index);
    }

    public int getTotalVotos() {
        return enquete.getTotalVotos();
    }

    private int findOpcaoIndex(String opcao) {
        for (int i = 0; i < enquete.getOpcoes().length; i++) {
            if (enquete.getOpcoes()[i].equals(opcao)) {
                return i;
            }
        }
        return -1; // Se não encontrar a opção, retorna -1 (idealmente deve ser tratado)
    }
}
