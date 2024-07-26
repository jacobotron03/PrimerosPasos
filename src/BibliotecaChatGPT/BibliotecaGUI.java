package BibliotecaChatGPT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BibliotecaGUI extends JFrame {
    private Biblioteca biblioteca;

    // Componentes de la GUI
    private JTextField txtTituloLibro;
    private JTextField txtAutorLibro;
    private JTextField txtNombreMiembro;
    private JTextField txtIdMiembro;
    private JTextField txtTituloPrestamo;
    private JTextField txtIdPrestamo;
    private JTextField txtFechaPrestamo;

    private JTextArea txtAreaInfo;

    public BibliotecaGUI() {
        biblioteca = new Biblioteca();
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        setTitle("Sistema de Gestión de Biblioteca");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        // Panel para agregar libro
        JPanel panelAgregarLibro = new JPanel();
        panelAgregarLibro.setBorder(BorderFactory.createTitledBorder("Agregar Libro"));
        panelAgregarLibro.setLayout(new GridLayout(3, 2));
        txtTituloLibro = new JTextField();
        txtAutorLibro = new JTextField();
        JButton btnAgregarLibro = new JButton("Agregar Libro");
        btnAgregarLibro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarLibro();
            }
        });
        panelAgregarLibro.add(new JLabel("Título:"));
        panelAgregarLibro.add(txtTituloLibro);
        panelAgregarLibro.add(new JLabel("Autor:"));
        panelAgregarLibro.add(txtAutorLibro);
        panelAgregarLibro.add(new JLabel(""));
        panelAgregarLibro.add(btnAgregarLibro);

        // Panel para registrar miembro
        JPanel panelRegistrarMiembro = new JPanel();
        panelRegistrarMiembro.setBorder(BorderFactory.createTitledBorder("Registrar Miembro"));
        panelRegistrarMiembro.setLayout(new GridLayout(3, 2));
        txtNombreMiembro = new JTextField();
        txtIdMiembro = new JTextField();
        JButton btnRegistrarMiembro = new JButton("Registrar Miembro");
        btnRegistrarMiembro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarMiembro();
            }
        });
        panelRegistrarMiembro.add(new JLabel("Nombre:"));
        panelRegistrarMiembro.add(txtNombreMiembro);
        panelRegistrarMiembro.add(new JLabel("ID:"));
        panelRegistrarMiembro.add(txtIdMiembro);
        panelRegistrarMiembro.add(new JLabel(""));
        panelRegistrarMiembro.add(btnRegistrarMiembro);

        // Panel para prestar libro
        JPanel panelPrestarLibro = new JPanel();
        panelPrestarLibro.setBorder(BorderFactory.createTitledBorder("Prestar Libro"));
        panelPrestarLibro.setLayout(new GridLayout(4, 2));
        txtTituloPrestamo = new JTextField();
        txtIdPrestamo = new JTextField();
        txtFechaPrestamo = new JTextField();
        JButton btnPrestarLibro = new JButton("Prestar Libro");
        btnPrestarLibro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prestarLibro();
            }
        });
        panelPrestarLibro.add(new JLabel("Título del Libro:"));
        panelPrestarLibro.add(txtTituloPrestamo);
        panelPrestarLibro.add(new JLabel("ID del Miembro:"));
        panelPrestarLibro.add(txtIdPrestamo);
        panelPrestarLibro.add(new JLabel("Fecha de Préstamo:"));
        panelPrestarLibro.add(txtFechaPrestamo);
        panelPrestarLibro.add(new JLabel(""));
        panelPrestarLibro.add(btnPrestarLibro);

        // Panel para mostrar información
        JPanel panelInfo = new JPanel();
        panelInfo.setBorder(BorderFactory.createTitledBorder("Información"));
        panelInfo.setLayout(new BorderLayout());
        txtAreaInfo = new JTextArea();
        txtAreaInfo.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtAreaInfo);
        panelInfo.add(scrollPane, BorderLayout.CENTER);

        // Panel principal
        panel.add(panelAgregarLibro);
        panel.add(panelRegistrarMiembro);
        panel.add(panelPrestarLibro);
        panel.add(panelInfo);

        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);

        // Barra de menú
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Opciones");
        JMenuItem menuItemMostrarLibros = new JMenuItem("Mostrar Libros");
        menuItemMostrarLibros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarLibros();
            }
        });
        JMenuItem menuItemMostrarMiembros = new JMenuItem("Mostrar Miembros");
        menuItemMostrarMiembros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarMiembros();
            }
        });
        JMenuItem menuItemMostrarPrestamos = new JMenuItem("Mostrar Préstamos");
        menuItemMostrarPrestamos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPrestamos();
            }
        });
        menu.add(menuItemMostrarLibros);
        menu.add(menuItemMostrarMiembros);
        menu.add(menuItemMostrarPrestamos);
        menuBar.add(menu);
        setJMenuBar(menuBar);
    }

    private void agregarLibro() {
        String titulo = txtTituloLibro.getText();
        String autor = txtAutorLibro.getText();
        biblioteca.agregarLibro(new Libro(titulo, autor));
        txtTituloLibro.setText("");
        txtAutorLibro.setText("");
        mostrarLibros();
    }

    private void registrarMiembro() {
        String nombre = txtNombreMiembro.getText();
        String id = txtIdMiembro.getText();
        biblioteca.registrarMiembro(new Miembro(nombre, id));
        txtNombreMiembro.setText("");
        txtIdMiembro.setText("");
        mostrarMiembros();
    }

    private void prestarLibro() {
        String titulo = txtTituloPrestamo.getText();
        String id = txtIdPrestamo.getText();
        String fecha = txtFechaPrestamo.getText();
        biblioteca.prestarLibro(titulo, id, fecha);
        txtTituloPrestamo.setText("");
        txtIdPrestamo.setText("");
        txtFechaPrestamo.setText("");
        mostrarPrestamos();
    }

    private void mostrarLibros() {
        txtAreaInfo.setText("");
        for (Libro libro : biblioteca.getLibros()) {
            txtAreaInfo.append(libro + "\n");
        }
    }

    private void mostrarMiembros() {
        txtAreaInfo.setText("");
        for (Miembro miembro : biblioteca.getMiembros()) {
            txtAreaInfo.append(miembro + "\n");
        }
    }

    private void mostrarPrestamos() {
        txtAreaInfo.setText("");
        for (Prestamo prestamo : biblioteca.getPrestamos()) {
            txtAreaInfo.append(prestamo + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BibliotecaGUI().setVisible(true);
            }
        });
    }
}

