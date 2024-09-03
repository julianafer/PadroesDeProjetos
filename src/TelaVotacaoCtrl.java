import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaVotacaoCtrl implements ActionListener {
    private EnqueteSimples enquete;

    public TelaVotacaoCtrl(EnqueteSimples enquete) {
        this.enquete = enquete;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String opcao = e.getActionCommand();
        for (int i = 0; i < enquete.getOpcoes().length; i++) {
            if (enquete.getOpcoes()[i].equals(opcao)) {
                enquete.votar(i);
            }
        }
    }
}
