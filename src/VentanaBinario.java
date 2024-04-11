import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaBinario {
    private JTextField textNumero;
    private JTextArea textArea1;
    private JButton calcularButton;
    private JPanel VentanaBinario;
    private Pila pila = new Pila();

    public VentanaBinario() {

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int decimal = Integer.parseInt(textNumero.getText());
                while (decimal > 0) {
                    int residuo = decimal % 2;
                    pila.apilar(residuo);
                    decimal /= 2;
                    }
                //textArea1.setText(pila.toString());

                try {
                    //JOptionPane.showMessageDialog(null,"Respuesta: "+pila.toString2());;
                    textArea1.setText(pila.toString2());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
                textNumero.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("VentanaBinario");
        frame.setContentPane(new VentanaBinario().VentanaBinario);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
