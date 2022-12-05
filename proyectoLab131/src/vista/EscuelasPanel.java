package vista;

import estructuras.ColaParticipantes;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import estructuras.LSimpleE;
import estructuras.LSimpleM;
import estructuras.NodoE;
import estructuras.Participante;

public class EscuelasPanel extends JPanel {

    private JLabel titulo = new JLabel("<html><h1 style=\"background: #cb2525;color:white;padding: 20px\">ESCUELAS</h1></html>", JLabel.CENTER);
    private JTextField t1, t2;
    private JButton ejecutar, cancelar;
    private DefaultTableModel model;
    private int rowCount = 0;
    private JTable tabla;
    private JScrollPane tablaSp;
    private LSimpleE lista;
    private LSimpleM lm;
    private ColaParticipantes cp;
    private JLabel salida;

    public EscuelasPanel(LSimpleM lm, LSimpleE le, ColaParticipantes cp) {
        this.lista = le;
        this.lm = lm;
        this.cp = cp;
        init();
    }

    public void init() {
        CrearInterfaz();
        ejecutar();
        cancelar();
        CreateBox();
    }

    public void cancelar() {
        cancelar = new JButton("CANCELAR");
        cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input = JOptionPane.showConfirmDialog(null, "CONFIRMAR...");
                if (input == JOptionPane.YES_OPTION) {
                    t1.setEditable(true);
                    t2.setEditable(true);
                    t1.setText("");
                    t2.setText("");
                    model.setRowCount(0);
                    rowCount = 0;
                }
                /*else if (input == JOptionPane.NO_OPTION){
		            System.out.println("You selected: No");
		        }else{
		            System.out.println("none cancel");
		            }
                 */
            }
        });
    }

    public void CrearInterfaz() {
        setLayout(new BorderLayout());
        titulo.setAlignmentY(CENTER_ALIGNMENT);
        titulo.setBorder(new LineBorder(Color.white));
        titulo.setBackground(Color.decode("#cb2525"));
        titulo.setOpaque(true);
        titulo.setPreferredSize(new Dimension(200, 60));

        salida = new JLabel();
        salida.setBorder(new LineBorder(Color.white));

        Object data[][] = llenarTabla();
        String[] columnNames = {"ID", "NOMBRE", "TELF.", "DIRECCION"};
        model = new DefaultTableModel(data, columnNames);
        tabla = new JTable(model);

        tablaSp = new JScrollPane(tabla);
        //tablaSp.setPreferredSize(new Dimension(400, 120));

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t1.setMaximumSize(t1.getPreferredSize());
        t2.setMaximumSize(t2.getPreferredSize());
    }

    public void CreateBox() {
        Box h1 = Box.createHorizontalBox();
        h1.add(titulo);

        Box cajaIzq = Box.createVerticalBox();
        cajaIzq.add(new JLabel("PROBLEMA 3"));

        Box enbox = Box.createHorizontalBox();
        enbox.add(new JLabel("<html>Mostrar al Participante con mayor edad inscrito en la escuela X</html>"));
        cajaIzq.add(enbox);

        Box caja1 = Box.createHorizontalBox();
        caja1.add(new JLabel("ID:"));
        caja1.add(Box.createHorizontalStrut(10));
        caja1.add(t1);
        cajaIzq.add(caja1);

        Box outbox = Box.createHorizontalBox();
        outbox.add(salida);
        cajaIzq.add(outbox);

        Box caja5 = Box.createHorizontalBox();
        //caja5.add(cancelar);
        caja5.add(Box.createHorizontalStrut(10));
        caja5.add(ejecutar);
        cajaIzq.add(caja5);

        Box cajaDer = Box.createVerticalBox();
        cajaDer.add(tablaSp);

        add(h1, BorderLayout.NORTH);
        add(cajaIzq, BorderLayout.CENTER);
        add(Box.createRigidArea(new Dimension(5, 0)), BorderLayout.WEST);
        add(cajaDer, BorderLayout.EAST);
    }

    public Object[][] llenarTabla() {
        int x = lista.nroNodos();
        Object[][] v = new Object[x][4];

        NodoE r = lista.getP();
        int i = 0;
        while (r != null) {
            v[i][0] = r.getIdEscuela();
            v[i][1] = r.getNombre();
            v[i][2] = r.getTelefono();
            v[i][3] = r.getDireccion();
            r = r.getSig();
            i++;
        }
        rowCount = i + 1;
        return v;
    }

    /* PROBLEMA 3 */
    public void ejecutar() {
        ejecutar = new JButton("EJECUTAR");
        ejecutar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //int input = JOptionPane.showConfirmDialog(null, "CONFIRMAR...");

                if (t1.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "RELLENE DATOS");
                    return;
                }

                boolean sw = false;
                int may = 0;

                NodoE r = lista.getP();
                while (r != null) {
                    if (r.getIdEscuela().equals(t1.getText())) {
                        Participante elem;

                        ColaParticipantes aux = new ColaParticipantes();
                        while (!lista.esvacia()) {
                            elem = cp.eliminar();
                            if (elem.getEdad() > may) {
                                may = elem.getEdad();
                            }
                            aux.adicionar(elem);
                        }
                        cp.vaciar(aux);
                    }
                    r = r.getSig();
                }

                salida.setText("El mayor tiene :" + may + " anios");

            }
        });
    }
}
