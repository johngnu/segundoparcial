package vista;

import javax.swing.JFrame;
import estructuras.ColaParticipantes;
import estructuras.LSimpleE;

public class ParticipantesFrame extends JFrame {    

    public ParticipantesFrame(ColaParticipantes lista, LSimpleE le) {        
        setTitle("PARTICIPANTES");        
        setBounds(100, 100, 900, 500);
        ParticipantesPanel lm = new ParticipantesPanel(lista, le);
        add(lm);
    }
}
