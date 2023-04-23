package PaqG07;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class DatosContenedor extends JFrame{
    private JList list1;
    protected JPanel panel1;
    private JTextPane datitos;

    public DatosContenedor(Hub datos, Integer id){

        setContentPane(panel1);
        setTitle("Datos del contenedor");

        setSize(370, 200);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        setVisible(true);

        datitos.setText(datos.MostrarDatos(id));

    }



}
