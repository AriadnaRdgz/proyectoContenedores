import javax.swing.*;

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
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
