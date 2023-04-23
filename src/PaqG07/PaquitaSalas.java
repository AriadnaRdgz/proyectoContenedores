package PaqG07;

import javax.swing.*;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaquitaSalas extends JFrame {
    private JTextField IdContenedor;
    private JTextField PesoCont;
    private JTextField Pais;
    private JComboBox Prioridad;
    private JTextField Descripcion;
    private JTextField E_Emisora;
    private JTextField E_Receptora;
    private JButton desapilarButton;
    private JPanel mainPanel;
    private JButton apilarButton;
    private JTextField textField4;
    private JTextPane Texto;
    private JButton mostrarContenedorButton;
    private JComboBox InspeccionBool;
    private JTabbedPane tabbedPane1;
    private JButton mostrarHubButton;
    private JTextField IdContenedor2;
    private JTextField paisCoso;
    private JButton paisButton;

    private Integer id;
    private Integer peso;
    private String país = Pais.getText();
    private boolean inspeccionado = InspeccionBool.getAutoscrolls();
    private Integer prioridad;
    private String descripción = Descripcion.getText();
    private String empresaEmisora = E_Emisora.getText();
    private String empresaReceptora = E_Receptora.getText();
    private Integer columna;
    private Integer fila;

    protected Hub hub = new Hub();

    public PaquitaSalas() {
        setContentPane(mainPanel);
        setTitle("Programa contenedores");
        setSize(500, 650);
        setMinimumSize(new Dimension(500, 650));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        apilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                id = Integer.parseInt(IdContenedor.getText());
                peso = Integer.parseInt(PesoCont.getText());
                prioridad = Integer.parseInt(Prioridad.getModel().getSelectedItem().toString());

                país = Pais.getText();
                descripción = Descripcion.getText();
                empresaEmisora = E_Emisora.getText();
                empresaReceptora = E_Receptora.getText();

                Contenedor contenedor = new Contenedor(id, peso, país, inspeccionado, prioridad, descripción, empresaEmisora, empresaReceptora);
                int res = hub.AñadirContenedor(contenedor);
                if(res == 0){
                    DatosContenedor myFrame = new DatosContenedor("El contenedor ha sido apilado con éxito");
                    System.out.println(hub.toString());
                }else if(res == 1){
                    DatosContenedor myFrame = new DatosContenedor("No se ha podido apilar este contenedor, el hub está lleno para un contenedor con esta prioridad");
                }else{
                    DatosContenedor myFrame = new DatosContenedor("El Id de este contenedor coincide con otro Id del hub, por favor revise el Id");
                }
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

                //System.out.println(hub.toString());

                id = Integer.parseInt(IdContenedor.getText());
                Texto.setText(hub.MostrarDatos(id));

                //DatosContenedor myFrame = new DatosContenedor(hub, id);

            }
        });

    }


}


