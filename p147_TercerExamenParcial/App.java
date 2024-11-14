package p147_TercerExamenParcial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class App extends JFrame implements ActionListener {
    private ArrayList<Jugador> datos;
    private JMenuBar menuBar;
    private JMenu mnuArchivo, mnuAyuda;
    private JMenuItem smnAbrir, smnSalir, smnAcercade, smnGuardar;
    private JPanel pnlTabla, pnlDatos, pnlBotones;
    private JDialog jdlAcercaDe;
    private JLabel lblNombre, lblEdad, lblSexo, lblEstadoCivil, lblDescripcion, lblSalario;
    private JTextField txtNombre, txtEdad, txtSexo, txtEstadoCivil, txtDescripcion, txtSalario;
    private JScrollPane spane;
    private JTable table;
    private DefaultTableModel modelo;
    private JFileChooser fchArchivo;
    private JButton btnAgregar, btnGrabar;
    private JLabel lblTotalSalario, lblCantidadHombres, lblCantidadMujeres, lblSolteros, lblCasados;

    public App() {
        super("Liga de Futbol - Control de Jugadores");
        initComponents();
        datos = Util.inicializarDatos();
        cargarDatos();
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
        JLabel lblDatos = new JLabel("<html>Liga de Futbol<br>Control de Jugadores</html>", JLabel.CENTER);
        lblDatos.setFont(new Font("Times New Roman", Font.BOLD, 18));
        jdlAcercaDe.add(lblDatos);

        setLayout(new GridLayout(3, 1));

        pnlTabla = new JPanel();
        pnlTabla.setLayout(new BoxLayout(pnlTabla, BoxLayout.X_AXIS));
        add(pnlTabla);

        spane = new JScrollPane();
        pnlTabla.add(spane);

        table = new JTable();
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Nombre", "Edad", "Sexo", "Estado Civil", "Descripción", "Salario"});
        table.setModel(modelo);
        spane.setViewportView(table);

        pnlDatos = new JPanel(new GridLayout(6, 2));
        add(pnlDatos);

        lblNombre = new JLabel("Nombre");
        txtNombre = new JTextField();
        pnlDatos.add(lblNombre);
        pnlDatos.add(txtNombre);

        lblEdad = new JLabel("Edad");
        txtEdad = new JTextField();
        pnlDatos.add(lblEdad);
        pnlDatos.add(txtEdad);

        lblSexo = new JLabel("Sexo");
        txtSexo = new JTextField();
        pnlDatos.add(lblSexo);
        pnlDatos.add(txtSexo);

        lblEstadoCivil = new JLabel("Estado Civil");
        txtEstadoCivil = new JTextField();
        pnlDatos.add(lblEstadoCivil);
        pnlDatos.add(txtEstadoCivil);

        lblDescripcion = new JLabel("Descripción");
        txtDescripcion = new JTextField();
        pnlDatos.add(lblDescripcion);
        pnlDatos.add(txtDescripcion);

        lblSalario = new JLabel("Salario");
        txtSalario = new JTextField();
        pnlDatos.add(lblSalario);
        pnlDatos.add(txtSalario);

        pnlBotones = new JPanel();
        btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(this);
        pnlBotones.add(btnAgregar);

        btnGrabar = new JButton("Grabar");
        btnGrabar.addActionListener(this);
        pnlBotones.add(btnGrabar);
        add(pnlBotones);

        lblTotalSalario = new JLabel("Total Salarios: ");
        lblCantidadHombres = new JLabel("Hombres: ");
        lblCantidadMujeres = new JLabel("Mujeres: ");
        lblSolteros = new JLabel("Solteros: ");
        lblCasados = new JLabel("Casados: ");
        add(lblTotalSalario);
        add(lblCantidadHombres);
        add(lblCantidadMujeres);
        add(lblSolteros);
        add(lblCasados);
    }

    private void cargarDatos() {
        modelo.setRowCount(0);
        for (Jugador jugador : datos) {
            modelo.addRow(new Object[]{jugador.getNombre(), jugador.getEdad(), jugador.getSexo(), jugador.getEstadoCivil(), jugador.getDescripcion(), jugador.getSalario()});
        }
        actualizarEstadisticas();
    }

    private void actualizarEstadisticas() {
        double totalSalario = 0;
        int hombres = 0, mujeres = 0, solteros = 0, casados = 0;

        for (Jugador jugador : datos) {
            totalSalario += jugador.getSalario();
            if (jugador.getSexo() == 'M') hombres++;
            else mujeres++;

            if ("Soltero".equalsIgnoreCase(jugador.getEstadoCivil())) solteros++;
            else casados++;
        }

        lblTotalSalario.setText("Total Salarios: " + totalSalario);
        lblCantidadHombres.setText("Hombres: " + hombres);
        lblCantidadMujeres.setText("Mujeres: " + mujeres);
        lblSolteros.setText("Solteros: " + solteros);
        lblCasados.setText("Casados: " + casados);
    }

    private void agregarJugador() {
        String nombre = txtNombre.getText();
        int edad = Integer.parseInt(txtEdad.getText());
        char sexo = txtSexo.getText().charAt(0);
        String estadoCivil = txtEstadoCivil.getText();
        String descripcion = txtDescripcion.getText();
        double salario = Double.parseDouble(txtSalario.getText());

        Jugador jugador = new Jugador(nombre, edad, sexo, estadoCivil, descripcion, salario);
        datos.add(jugador);
        cargarDatos();
        limpiarCampos();
    }

    private void guardarDatos() {
        try {
            fchArchivo = new JFileChooser();
            fchArchivo.setDialogTitle("Guardar archivo");
            fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos", "dat"));
            int seleccion = fchArchivo.showSaveDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                File archivo = fchArchivo.getSelectedFile();
                if (!archivo.getName().endsWith(".dat")) archivo = new File(archivo.getPath() + ".dat");
                Util.serializarDatos(archivo.getPath(), datos);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar los datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cargarArchivo() {
        try {
            fchArchivo = new JFileChooser();
            fchArchivo.setDialogTitle("Abrir archivo");
            fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos", "dat"));
            int seleccion = fchArchivo.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                File archivo = fchArchivo.getSelectedFile();
                datos = Util.desSerializarDatos(archivo.getPath());
                cargarDatos();
            }
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Error al abrir los datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtEdad.setText("");
        txtSexo.setText("");
        txtEstadoCivil.setText("");
        txtDescripcion.setText("");
        txtSalario.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == smnSalir) {
            System.exit(0);
        } else if (e.getSource() == smnAcercade) {
            jdlAcercaDe.setVisible(true);
        } else if (e.getSource() == btnAgregar) {
            agregarJugador();
        } else if (e.getSource() == btnGrabar) {
            agregarJugador();
        } else if (e.getSource() == smnAbrir) {
            cargarArchivo();
        } else if (e.getSource() == smnGuardar) {
            guardarDatos();
        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.setSize(800, 600);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}

