package vista;

import estructuras.ColaParticipantes;
import javax.swing.JFrame;
import estructuras.LSimpleE;
import estructuras.LSimpleM;

public class EscuelasFrame extends JFrame {

    public EscuelasFrame(LSimpleM lm, LSimpleE le, ColaParticipantes cp) {
        setTitle("ESCUELAS");
        setBounds(100, 100, 900, 500);
        EscuelasPanel ep = new EscuelasPanel(lm, le, cp);
        add(ep);
    }
}
