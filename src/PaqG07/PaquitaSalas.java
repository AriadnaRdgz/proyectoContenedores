package PaqG07;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaquitaSalas extends JFrame{
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

    public PaquitaSalas(){
        setContentPane(mainPanel);
        setTitle("Welcome");
        setSize(700,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        apilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                java.lang.String Id = textField1.getText();
                java.lang.String peso = textField2.getText();
                java.lang.String pais = textField3.getText();
                boolean inspeccionado = comboBox1.getAutoscrolls();
                java.lang.String prioridad = textField5.getText();
                java.lang.String descripcion = textField6.getText();
                java.lang.String emisor = textField7.getText();
                java.lang.String receptor = textField8.getText();
                Contenedor contenedor = new Contenedor(Id,peso,pais,inspeccionado,prioridad,descripcion,emisor,receptor);
                Hub hub = new Hub();
                hub.AñadirContenedor(contenedor);
            }
        });



    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        PaquitaSalas gui = new PaquitaSalas();
    }
}
