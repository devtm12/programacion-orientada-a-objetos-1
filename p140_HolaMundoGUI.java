import javax.swing.*;
import java.awt.*;
public class p140_HolaMundoGUI extends JFrame {
    private JLabel lblSaludo;
   
    public p140_HolaMundoGUI() {
        setTitle("Mi primer programa de integración Gráfica en Java");
        setLayout(null);
        lblSaludo=new JLabel("Hola Mundo.;]");
        lblSaludo.setFont(new Font("Times new roman",Font.BOLD, 30));
        lblSaludo.setBounds(10,20,200,30);
        add(lblSaludo);
    }
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        p140_HolaMundoGUI app = new p140_HolaMundoGUI();

        app.setBounds(10,10,400,300);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}