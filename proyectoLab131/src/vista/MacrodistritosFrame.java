package vista;

import javax.swing.JFrame;
import proyectolab131.LSimpleM;

public class MacrodistritosFrame extends JFrame {

    private LSimpleM lista;    

    public MacrodistritosFrame(LSimpleM lista) {
        this.lista = lista;
        setTitle("MACRODISTRITOS");        
        setBounds(100, 100, 800, 500);
        MacrodistritosPanel lm = new MacrodistritosPanel(lista);
        add(lm);
    }
}
