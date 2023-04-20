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


    public PaquitaSalas() {
        setContentPane(mainPanel);
        setTitle("¡Hola, soy VInce con ApilaciónWOW");
        setSize(700, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        apilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(IdContenedor.getText());
                int peso = Integer.parseInt(PesoCont.getText());
                String país = Pais.getText();
                boolean inspeccionado = comboBox1.getAutoscrolls();
                int prioridad = Integer.parseInt(Prioridad.getText());
                String descripción = Descripcion.getText();
                String empresaEmisora = E_Emisora.getText();
                String empresaReceptora = E_Receptora.getText();
                Contenedor contenedor = new Contenedor(id, peso, país, inspeccionado, prioridad, descripción, empresaEmisora, empresaReceptora);
                Hub hub = new Hub();
                hub.AñadirContenedor(contenedor);
                Texto.setText("El contenedor ha sido apilado con éxito");
            }
        });
    }
}


