import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class p143_PagaTrabajador extends JFrame {
    private JLabel lblHoras, lblPagaHora, lblTasaImpuestos, lblPagaBruta, lblImpuesto, lblPagaNeta;
    private JTextField txtHoras, txtPagaHora, txtTasaImpuestos;
    private JButton btnCalcular;

    public p143_PagaTrabajador() {
        setTitle("Calculadora de Paga del Trabajador");
        setLayout(null);

        lblHoras = new JLabel("Horas trabajadas:");
        lblHoras.setBounds(20, 20, 120, 25);
        add(lblHoras);

        txtHoras = new JTextField();
        txtHoras.setBounds(150, 20, 150, 25);
        add(txtHoras);

        lblPagaHora = new JLabel("Paga por hora:");
        lblPagaHora.setBounds(20, 60, 120, 25);
        add(lblPagaHora);

        txtPagaHora = new JTextField();
        txtPagaHora.setBounds(150, 60, 150, 25);
        add(txtPagaHora);

        lblTasaImpuestos = new JLabel("Tasa de impuestos (%):");
        lblTasaImpuestos.setBounds(20, 100, 150, 25);
        add(lblTasaImpuestos);

        txtTasaImpuestos = new JTextField();
        txtTasaImpuestos.setBounds(180, 100, 120, 25);
        add(txtTasaImpuestos);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(100, 140, 120, 30);
        add(btnCalcular);

        lblPagaBruta = new JLabel("Paga bruta:");
        lblPagaBruta.setBounds(20, 190, 300, 25);
        add(lblPagaBruta);

        lblImpuesto = new JLabel("Impuesto:");
        lblImpuesto.setBounds(20, 230, 300, 25);
        add(lblImpuesto);

        lblPagaNeta = new JLabel("Paga neta:");
        lblPagaNeta.setBounds(20, 270, 300, 25);
        add(lblPagaNeta);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularPago();
            }
        });

        setSize(350, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void calcularPago() {
        try {
            double horas = Double.parseDouble(txtHoras.getText());
            double pagaHora = Double.parseDouble(txtPagaHora.getText());
            double tasaImpuestos = Double.parseDouble(txtTasaImpuestos.getText());

           
            double pagaBruta = horas * pagaHora;
            double impuesto = pagaBruta * (tasaImpuestos / 100);
            double pagaNeta = pagaBruta - impuesto;

            lblPagaBruta.setText("Paga bruta: $" + String.format("%.2f", pagaBruta));
            lblImpuesto.setText("Impuesto: $" + String.format("%.2f", impuesto));
            lblPagaNeta.setText("Paga neta: $" + String.format("%.2f", pagaNeta));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new p143_PagaTrabajador().setVisible(true);
        });
    }
}
