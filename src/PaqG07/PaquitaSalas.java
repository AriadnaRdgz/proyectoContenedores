package PaqG07;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaquitaSalas extends JFrame {
    private JTextField IdContenedor;
    private JTextField PesoCont;
    private JTextField Pais;
    private JTextField Prioridad;
    private JTextField Descripcion;
    private JTextField E_Emisora;
    private JTextField E_Receptora;
    private JButton desapilarButton;
    private JComboBox comboBox1;
    private JPanel mainPanel;
    private JButton apilarButton;
    private JTextField textField4;
    private JTextPane Texto;
    private JButton mostrarContenedorButton;

    private Integer id;
    private Integer peso;
    private String país = Pais.getText();
    private boolean inspeccionado = comboBox1.getAutoscrolls();
    private Integer prioridad;
    private String descripción = Descripcion.getText();
    private String empresaEmisora = E_Emisora.getText();
    private String empresaReceptora = E_Receptora.getText();
    private Integer columna;

    protected Hub hub = new Hub();

    public PaquitaSalas() {
        setContentPane(mainPanel);
        setTitle("¡Hola, soy VInce con ApilaciónWOW");
        setSize(700, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        apilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                id = Integer.parseInt(IdContenedor.getText());
                peso = Integer.parseInt(PesoCont.getText());
                prioridad = Integer.parseInt(Prioridad.getText());

                Contenedor contenedor = new Contenedor(id, peso, país, inspeccionado, prioridad, descripción, empresaEmisora, empresaReceptora);

                hub.AñadirContenedor(contenedor);

                Texto.setText("El contenedor ha sido apilado con éxito");
            }
        });

        desapilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                columna = Integer.parseInt(textField4.getText());

                hub.QuitarContenedor(columna);

                Texto.setText("El contenedor ha sido desapilado");

            }
        });

        mostrarContenedorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                id = Integer.parseInt(IdContenedor.getText());

                Texto.setText(hub.MostrarDatos(id));

            }
        });

    }
}


