import javax.swing.*;
import java.awt.event.*;

public class p144_Temperaturas extends JFrame implements ActionListener {
    JLabel lblTitulo, lblTemperatura, lblResultado;
    JTextField txtTemperatura;
    JButton btnConvertir, btnSalir;
    JRadioButton rdbFahrenheitACelsius, rdbCelsiusAFahrenheit;
    ButtonGroup conversionGroup;

    public p144_Temperaturas() {
        super("Conversión de Temperaturas");
        setLayout(null);

        lblTitulo = new JLabel("Conversión de Temperatura");
        lblTitulo.setBounds(70, 10, 200, 30);
        add(lblTitulo);

        lblTemperatura = new JLabel("Temperatura:");
        lblTemperatura.setBounds(10, 50, 100, 30);
        add(lblTemperatura);

        txtTemperatura = new JTextField();
        txtTemperatura.setBounds(120, 50, 150, 30);
        add(txtTemperatura);

        
        rdbFahrenheitACelsius = new JRadioButton("Fahrenheit a Celsius");
        rdbFahrenheitACelsius.setBounds(10, 90, 150, 30);
        rdbCelsiusAFahrenheit = new JRadioButton("Celsius a Fahrenheit");
        rdbCelsiusAFahrenheit.setBounds(160, 90, 150, 30);

        conversionGroup = new ButtonGroup();
        conversionGroup.add(rdbFahrenheitACelsius);
        conversionGroup.add(rdbCelsiusAFahrenheit);

        add(rdbFahrenheitACelsius);
        add(rdbCelsiusAFahrenheit);

      
        btnConvertir = new JButton("Convertir");
        btnConvertir.setBounds(30, 130, 100, 40);
        add(btnConvertir);

      
        btnSalir = new JButton("Salir");
        btnSalir.setBounds(150, 130, 100, 40);
        add(btnSalir);

  
        lblResultado = new JLabel("[Resultado Aquí]");
        lblResultado.setBounds(90, 180, 200, 30);
        add(lblResultado);

     
        btnConvertir.addActionListener(this);
        btnSalir.addActionListener(this);
    }

    public float fahrenheitToCelsius(float fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public float celsiusToFahrenheit(float celsius) {
        return (celsius * 9 / 5) + 32;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnConvertir) {
            try {
                float temperatura = Float.parseFloat(txtTemperatura.getText());
                float resultado;

              
                if (rdbFahrenheitACelsius.isSelected()) {
                    resultado = fahrenheitToCelsius(temperatura);
                    lblResultado.setText(String.format("Celsius: %.2f °C", resultado));
                } else if (rdbCelsiusAFahrenheit.isSelected()) {
                    resultado = celsiusToFahrenheit(temperatura);
                    lblResultado.setText(String.format("Fahrenheit: %.2f °F", resultado));
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor seleccione una opción de conversión.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un valor numérico válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnSalir) {
            JOptionPane.showMessageDialog(this, "Gracias por usar este programa", "Despedida", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        p144_Temperaturas app = new p144_Temperaturas();
        app.setBounds(10, 10, 350, 250);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
