package PaqG07;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        PaquitaSalas myFrame = new PaquitaSalas();

        JButton boton = new JButton();
        boton.addActionListener(new Oyente());
        

    }
}