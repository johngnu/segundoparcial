package vista;

import javax.swing.JFrame;
import estructuras.ColaParticipantes;

public class EscuelasFrame extends JFrame {

    private ColaParticipantes lista;    

    public EscuelasFrame(ColaParticipantes lista) {
        this.lista = lista;
        setTitle("PARTICIPANTES");        
        setBounds(100, 100, 900, 500);
        ParticipantesPanel lm = new ParticipantesPanel(lista);
        add(lm);
    }
}
