package vista;

import javax.swing.JFrame;

public class Marco extends JFrame {

    public Marco() {
        setTitle("SISTEMA ESCUELAS");
        setBounds(0, 0, 1000, 500);
        PantallaPrincipal lm = new PantallaPrincipal();
        add(lm);
    }

}
