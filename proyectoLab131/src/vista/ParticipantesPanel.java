package vista;

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
import estructuras.ColaParticipantes;
import estructuras.LSimpleE;
import estructuras.NodoE;
import estructuras.Participante;

public class ParticipantesPanel extends JPanel {

    private JLabel titulo = new JLabel("<html><h1 style=\"background: #cb2525;color:white;padding: 20px\">PARTICIPANTES</h1></html>", JLabel.CENTER);
    private JTextField t1, t2;
    private JButton ejecutar, cancelar;
    private DefaultTableModel model;
    private int rowCount = 0;
    private JTable tabla;
    private JScrollPane tablaSp;
    private ColaParticipantes lista;
    private LSimpleE le;
    private JLabel salida;

    public ParticipantesPanel(ColaParticipantes lista, LSimpleE le) {
        this.lista = lista;
        this.le = le;
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
        String[] columnNames = {"CI", "NOMBRE", "EDAD", "CATEGORIA", "ID ESC."};
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
        cajaIzq.add(new JLabel("PROBLEMA 2"));

        Box enbox = Box.createHorizontalBox();
        enbox.add(new JLabel("<html>Mostrar la ESCUELA al que pertenece el PARTICIPANTE con CI 'X'</html>"));
        cajaIzq.add(enbox);

        Box caja1 = Box.createHorizontalBox();
        caja1.add(new JLabel("CI:"));
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
        int x = lista.nroelem();
        Object[][] v = new Object[x][5];
        Participante elem;
        int i = 0;
        ColaParticipantes aux = new ColaParticipantes();
        while (!lista.esvacia()) {
            elem = lista.eliminar();
            v[i][0] = elem.getCi();
            v[i][1] = elem.getNombre();
            v[i][2] = elem.getEdad();
            v[i][3] = elem.getCategoria();
            v[i][4] = elem.getIdEscuela();
            aux.adicionar(elem);
            i++;
        }
        lista.vaciar(aux);
        rowCount = 1;
        return v;
    }

    /* PROBLEMA 2 */
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

                Participante elem;
                boolean sw = false;
                ColaParticipantes aux = new ColaParticipantes();
                while (!lista.esvacia()) {
                    elem = lista.eliminar();
                    if (elem.getCi().equals(t1.getText())) {
                        sw = true;
                        NodoE r = le.getP();
                        while (r != null) {
                            if (r.getIdEscuela().equals(elem.getIdEscuela())) {
                                salida.setText("<html>El participante est?? en la escuela: " + r.getNombre() + ", Direcci??n: " + r.getDireccion() + "</html>");
                            }
                            r = r.getSig();
                        }
                    }
                    aux.adicionar(elem);
                }
                lista.vaciar(aux);

                if (!sw) {
                    salida.setText("EL REGISTRO NO EXISTE");
                }

            }
        });
    }
}
