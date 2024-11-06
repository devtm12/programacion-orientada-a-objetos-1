import javax.swing.*;
import java.awt.event.*;

public class p141_AreaTrianguloGUI extends JFrame implements ActionListener {
    JLabel lblBase, lblAltura, lblResultado;
    JTextField txtBase, txtAltura;
    JButton btnCalcular, btnSalir;

    public p141_AreaTrianguloGUI() {
        super("Calcular el área de un triángulo");
        setLayout(null);
        
        lblBase = new JLabel("Base:");
        lblBase.setBounds(10, 20, 200, 30);
        add(lblBase);
        
        txtBase = new JTextField();
        txtBase.setBounds(80, 20, 200, 30);
        add(txtBase);
        
        lblAltura = new JLabel("Altura:");
        lblAltura.setBounds(10, 50, 200, 30);
        add(lblAltura);
        
        txtAltura = new JTextField();
        txtAltura.setBounds(80, 50, 200, 30);
        add(txtAltura);
        
        lblResultado = new JLabel(" [Resultado Aquí]");
        lblResultado.setBounds(90, 80, 200, 30);
        add(lblResultado);
        
        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(30, 110, 100, 40);
        add(btnCalcular);
        
        btnSalir = new JButton("Salir");
        btnSalir.setBounds(150, 110, 100, 40);
        add(btnSalir);
        
        btnCalcular.addActionListener(this);
        btnSalir.addActionListener(this);
    }

    public float getArea(float base, float altura) {
        return (base * altura) / 2;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcular) {
            try {
                float base = Float.parseFloat(txtBase.getText());
                float altura = Float.parseFloat(txtAltura.getText());
                float area = getArea(base, altura);
                lblResultado.setText(String.format("Área: %.2f", area));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnSalir) {
            JOptionPane.showMessageDialog(this, "Gracias por usar este programa", "Despedida", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        p141_AreaTrianguloGUI app = new p141_AreaTrianguloGUI();
        app.setBounds(10, 10, 300, 200);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
