package PaqG07;

import javax.swing.*;

public class DatosContenedor extends JFrame{
    private JList list1;
    protected JPanel panel1;
    private JTextPane datitos;

    public DatosContenedor(Hub datos, Integer id){

        setContentPane(panel1);
        setTitle("Datos del contenedor");

        setSize(700, 500);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        datitos.setText(datos.MostrarDatos(id));

    }



}
