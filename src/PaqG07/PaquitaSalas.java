package PaqG07;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaquitaSalas extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JButton desapilarButton;
    private JComboBox comboBox1;
    private JPanel mainPanel;
    private JButton apilarButton;
    private JTextField textField4;
    private JTextPane Texto;
    private JButton mostrarContenedorButton;
    int id = Integer.parseInt(textField1.getText());
    int peso = Integer.parseInt(textField1.getText());
    String país = textField3.getText();
    boolean inspeccionado = comboBox1.getAutoscrolls();
    int prioridad = Integer.parseInt(textField1.getText());
    String descripción = textField5.getText();
    String empresaEmisora = textField6.getText();
    String empresaReceptora = textField7.getText();

    public PaquitaSalas() {
        setContentPane(mainPanel);
        setTitle("¡Hola, soy VInce con ApilaciónWOW");
        setSize(700, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        apilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Contenedor contenedor = new Contenedor(id, peso, país, inspeccionado, prioridad, descripción, empresaEmisora, empresaReceptora);
                Hub hub = new Hub();
                hub.AñadirContenedor(contenedor);
                Texto.setText("El contenedor ha sido apilado con éxito");
            }
        });
    }
}


