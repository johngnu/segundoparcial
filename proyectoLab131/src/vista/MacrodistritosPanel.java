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
import estructuras.LSimpleM;
import estructuras.Macrodistrito;
import estructuras.NodoM;

public class MacrodistritosPanel extends JPanel {

    private JLabel titulo = new JLabel("<html><h1 style=\"background: #cb2525;color:white;padding: 20px\">MACRODISTRITOS</h1></html>", JLabel.CENTER);
    private JTextField t1, t2;
    private JButton guardar, cancelar;
    private DefaultTableModel model;
    private int rowCount = 0;
    private JTable tabla;
    private JScrollPane tablaSp;
    private LSimpleM lista;
    private JLabel salida;

    public MacrodistritosPanel(LSimpleM lista) {
        this.lista = lista;
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
        String[] columnNames = {"CODIGO", "NOMBRE"};
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
        cajaIzq.add(new JLabel("PROBLEMA 1"));

        Box enbox = Box.createHorizontalBox();
        enbox.add(new JLabel("<html>Registrar Macrodistrito si no esta en la Lista generando el código automáticamente.</html>"));
        cajaIzq.add(enbox);

        Box caja1 = Box.createHorizontalBox();
        caja1.add(new JLabel("NRO:"));
        caja1.add(Box.createHorizontalStrut(10));
        caja1.add(t1);
        //cajaIzq.add(caja1);

        Box caja2 = Box.createHorizontalBox();
        caja2.add(new JLabel("NOMBRE:"));
        caja2.add(Box.createHorizontalStrut(10));
        caja2.add(t2);
        cajaIzq.add(caja2);

        Box outbox = Box.createHorizontalBox();
        outbox.add(salida);
        cajaIzq.add(outbox);

        Box caja5 = Box.createHorizontalBox();
        caja5.add(cancelar);
        caja5.add(Box.createHorizontalStrut(10));
        caja5.add(guardar);
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
        Object[][] v = new Object[x][2];

        NodoM r = lista.getP();
        int i = 0;
        while (r != null) {
            v[i][0] = r.getM().getNro();
            v[i][1] = r.getM().getNombre();
            r = r.getSig();
            i++;
        }
        rowCount = i + 1;
        return v;   
    }

    /* PROBLEMA 1 */
    public void ejecutar() {
        guardar = new JButton("EJECUTAR");
        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (t2.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "RELLENE DATOS");
                    return;
                }

                boolean sw = false;
                NodoM r = lista.getP();

                // Recorrido de la lista simpel
                while (r != null) {
                    if (r.getM().getNombre().toLowerCase().equals(t2.getText().toLowerCase())) {
                        sw = true;
                    }
                    r = r.getSig();
                }

                if (!sw) {
                    t2.setEditable(true);
                    model.addRow(new Object[]{rowCount + "", t2.getText()});

                    // Adicionar nuevo elemento en la lista
                    lista.adiFinal(new Macrodistrito(t2.getText(), rowCount + ""));

                    rowCount++;
                } else {
                    JOptionPane.showMessageDialog(null, "EL SEGISTRO YA SE ENCUENTRA");
                }
                t2.setText("");
            }
        });
    }
}
