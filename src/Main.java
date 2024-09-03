import java.awt.event.ActionEvent;

public class Main {
    public static void main(String[] args) {
        String[] opcoes = {"Opção 1", "Opção 2", "Opção 3"};
        EnqueteSimples enquete = new EnqueteSimples(opcoes);

        TelaResultado telaResultado = new TelaResultado();
        TelaResultadoPercentual telaResultadoPercentual = new TelaResultadoPercentual();

        enquete.addEnqueteListener(telaResultado);
        enquete.addEnqueteListener(telaResultadoPercentual);

        TelaVotacaoCtrl controller = new TelaVotacaoCtrl(enquete);

        // Simulação de votos
        controller.actionPerformed(new ActionEvent(new Object(), 0, "Opção 1"));
        controller.actionPerformed(new ActionEvent(new Object(), 0, "Opção 2"));
        controller.actionPerformed(new ActionEvent(new Object(), 0, "Opção 1"));
    }
}
