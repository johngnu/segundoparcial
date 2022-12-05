package vista;

import javax.swing.JFrame;
import estructuras.LSimpleE;
import estructuras.LSimpleM;

public class EscuelasFrame extends JFrame {

    public EscuelasFrame(LSimpleM lm, LSimpleE le) {
        setTitle("ESCUELAS");
        setBounds(100, 100, 900, 500);
        EscuelasPanel ep = new EscuelasPanel(lm, le);
        add(ep);
    }
}
