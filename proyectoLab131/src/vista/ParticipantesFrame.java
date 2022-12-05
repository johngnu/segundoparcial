package vista;

import javax.swing.JFrame;
import estructuras.ColaParticipantes;

public class ParticipantesFrame extends JFrame {

    private ColaParticipantes lista;    

    public ParticipantesFrame(ColaParticipantes lista) {
        this.lista = lista;
        setTitle("PARTICIPANTES");        
        setBounds(100, 100, 900, 500);
        ParticipantesPanel lm = new ParticipantesPanel(lista);
        add(lm);
    }
}
