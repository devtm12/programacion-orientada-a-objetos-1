package p146_EstudianteGUI_V2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class App extends JFrame implements ActionListener {
    private ArrayList<Estudiante> datos;
    private JMenuBar menuBar;
    private JMenu mnuArchivo, mnuAyuda;
    private JMenuItem smnAbrir, smnSalir, smnAcercade, smnGuardar;
    private JPanel pnlTabla, pnlDatos, pnlBotones;
    private JDialog jdlAcercaDe;
    private JLabel lblDatos, lblNombre, lblEdad, lblPeso, lblCorreo;
    private JTextField txtNombre, txtEdad, txtPeso, txtCorreo;
    private JScrollPane spane;
    private JTable table;
    private DefaultTableModel modelo;
    private JFileChooser fchArchivo;
    private JButton btnAgregar, btnGrabar;

    public App() {
        super("Datos de Estudiantes");
        initComponents();
        datos = Util.inicializarDatos();
        cargarDatos();
        activarCampos(false);
    }

    private void initComponents() {
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        mnuArchivo = new JMenu("Archivo");
        menuBar.add(mnuArchivo);

        smnAbrir = new JMenuItem("Abrir");
        smnAbrir.addActionListener(this);
        mnuArchivo.add(smnAbrir);

        smnGuardar = new JMenuItem("Guardar");
        smnGuardar.addActionListener(this);
        mnuArchivo.add(smnGuardar);

        mnuArchivo.add(new JSeparator());

        smnSalir = new JMenuItem("Salir");
        smnSalir.addActionListener(this);
        mnuArchivo.add(smnSalir);

        mnuAyuda = new JMenu("Ayuda");
        menuBar.add(mnuAyuda);

        smnAcercade = new JMenuItem("Acerca de ..");
        smnAcercade.addActionListener(this);
        mnuAyuda.add(smnAcercade);

        jdlAcercaDe = new JDialog(this, "Acerca de ..");
        jdlAcercaDe.setSize(300, 250);
        jdlAcercaDe.setLocationRelativeTo(null);
        lblDatos = new JLabel("<html>Programación Orientada a Objetos I<br>Carlos Castañeda Ramírez</html>", JLabel.CENTER);
        lblDatos.setFont(new Font("Times New Roman", Font.BOLD, 18));
        jdlAcercaDe.add(lblDatos);

        setLayout(new GridLayout(3, 1));

        pnlTabla = new JPanel();
        pnlTabla.setLayout(new BoxLayout(pnlTabla, BoxLayout.X_AXIS));
        add(pnlTabla);

        spane = new JScrollPane();
        spane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        pnlTabla.add(spane);

        table = new JTable();
        table.getTableHeader().setBackground(Color.yellow);
        table.getTableHeader().setForeground(Color.black);
        spane.setViewportView(table);

        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Nombre", "Edad", "Peso", "Correo"});
        table.setModel(modelo);
        table.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int ren = table.rowAtPoint(e.getPoint());
                mostrarDatos(ren);
            }
        });

        pnlDatos = new JPanel(new GridLayout(4, 2, 0, 0));
        add(pnlDatos);

        lblNombre = new JLabel("Nombre", SwingConstants.RIGHT);
        txtNombre = new JTextField();
        pnlDatos.add(lblNombre);
        pnlDatos.add(txtNombre);

        lblEdad = new JLabel("Edad", SwingConstants.RIGHT);
        txtEdad = new JTextField();
        pnlDatos.add(lblEdad);
        pnlDatos.add(txtEdad);

        lblPeso = new JLabel("Peso", SwingConstants.RIGHT);
        txtPeso = new JTextField();
        pnlDatos.add(lblPeso);
        pnlDatos.add(txtPeso);

        lblCorreo = new JLabel("Correo:", SwingConstants.RIGHT);
        txtCorreo = new JTextField();
        pnlDatos.add(lblCorreo);
        pnlDatos.add(txtCorreo);

        pnlBotones = new JPanel();
        btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(this);
        pnlBotones.add(btnAgregar);

        btnGrabar = new JButton("Grabar");
        btnGrabar.setEnabled(false);
        btnGrabar.addActionListener(this);
        pnlBotones.add(btnGrabar);
        add(pnlBotones);
    }

    private void cargarDatos() {
        modelo.setRowCount(0);
        for (Estudiante est : datos) {
            modelo.addRow(new Object[]{est.getNombre(), est.getEdad(), est.getPeso(), est.getCorreo()});
        }
    }

    private void mostrarDatos(int ren) {
        Estudiante est = datos.get(ren);
        txtNombre.setText(est.getNombre());
        txtEdad.setText(Integer.toString(est.getEdad()));
        txtPeso.setText(Double.toString(est.getPeso()));
        txtCorreo.setText(est.getCorreo());
    }

    private void activarCampos(boolean actdes) {
        txtNombre.setEnabled(actdes);
        txtEdad.setEnabled(actdes);
        txtPeso.setEnabled(actdes);
        txtCorreo.setEnabled(actdes);
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtEdad.setText("");
        txtPeso.setText("");
        txtCorreo.setText("");
    }

    private void guardarCampos() {
        Estudiante est = new Estudiante(txtNombre.getText(), Integer.parseInt(txtEdad.getText()),
                Double.parseDouble(txtPeso.getText()), txtCorreo.getText());
        datos.add(est);
        cargarDatos();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == smnSalir) {
            dispose();
        } else if (e.getSource() == smnAcercade) {
            jdlAcercaDe.setVisible(true);
        } else if (e.getSource() == smnAbrir) {
            abrirArchivo();
        } else if (e.getSource() == smnGuardar) {
            guardarArchivo();
        } else if (e.getSource() == btnAgregar) {
            activarCampos(true);
            limpiarCampos();
            btnAgregar.setEnabled(false);
            btnGrabar.setEnabled(true);
        } else if (e.getSource() == btnGrabar) {
            guardarCampos();
            limpiarCampos();
            activarCampos(false);
            btnGrabar.setEnabled(false);
            btnAgregar.setEnabled(true);
        }
    }

    private void abrirArchivo() {
        fchArchivo = new JFileChooser();
        fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos (.dat)", "dat"));
        fchArchivo.setCurrentDirectory(new File("."));
        int res = fchArchivo.showOpenDialog(this);
        if (res == JFileChooser.APPROVE_OPTION) {
            File archivo = fchArchivo.getSelectedFile();
            try {
                datos = Util.desSerializarDatos(archivo.getName());
                cargarDatos();
            } catch (IOException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(this, "Error al procesar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void guardarArchivo() {
        fchArchivo = new JFileChooser();
        fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos (.dat)", "dat"));
        fchArchivo.setCurrentDirectory(new File("."));
        int res = fchArchivo.showSaveDialog(this);
        if (res == JFileChooser.APPROVE_OPTION) {
            File archivo = fchArchivo.getSelectedFile();
            try {
                Util.serializarDatos(archivo.getName(), datos);
                JOptionPane.showMessageDialog(this, "Datos guardados en: " + archivo.getName(), "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error al guardar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.setBounds(10, 10, 550, 400);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

    