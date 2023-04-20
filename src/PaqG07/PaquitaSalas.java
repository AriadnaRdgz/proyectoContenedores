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

    private Integer Id;
    private Integer peso;
    private String pais = textField3.getText();
    private boolean inspeccionado = comboBox1.getAutoscrolls();
    private Integer prioridad;
    private String descripcion = textField6.getText();
    private String emisor = textField7.getText();
    private String receptor = textField8.getText();

    public PaquitaSalas(){
        setContentPane(mainPanel);
        setTitle("Welcome");
        setSize(700,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        apilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Id = Integer.parseInt(textField1.getText());
                peso = Integer.parseInt(textField2.getText());
                prioridad = Integer.parseInt(textField5.getText());
                Contenedor contenedor = new Contenedor(Id,peso,pais,inspeccionado,prioridad,descripcion,emisor,receptor);
                Hub hub = new Hub();
                hub.AñadirContenedor(contenedor);
            }
        });


    }
}

