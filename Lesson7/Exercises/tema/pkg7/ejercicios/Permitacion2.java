/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema.pkg7.ejercicios;

import java.util.Random;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andrei
 */



public class Permitacion2 extends JFrame {

    private Integer[][] matriz;
    private JTable tabla;
    private DefaultTableModel modeloTabla;
    private String[] nombresColumnas;
    private JSpinner spinnerFilas;
    private JSpinner spinnerColumnas;
    private JButton botonCrearMatriz;
    private JButton botonPermutarFilas;
    private JButton botonPermutarColumnas;
    private JScrollPane scrollTabla;

    public Permitacion2() {
        initComponents();
        setFrame();
        setSpinner();
    }

    private void setFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Permutacion");
    }

    private void setSpinner() {
        spinnerFilas.setModel(new SpinnerNumberModel(1, 1, 10, 1));
        spinnerColumnas.setModel(new SpinnerNumberModel(1, 1, 10, 1));
    }

    private void initComponents() {
        JPanel panel1 = new JPanel();
        spinnerFilas = new JSpinner();
        spinnerColumnas = new JSpinner();
        botonCrearMatriz = new JButton("Crear Matriz");
        botonCrearMatriz.addActionListener(e -> {
            crearMatriz();
            mostrarMatriz();
        });
        panel1.add(spinnerFilas);
        panel1.add(new JLabel("x"));
        panel1.add(spinnerColumnas);
        panel1.add(botonCrearMatriz);

        JPanel panel2 = new JPanel();
        botonPermutarFilas = new JButton("Permutar Filas");
        botonPermutarColumnas = new JButton("Permutar Columnas");
        panel2.add(botonPermutarFilas);
        panel2.add(botonPermutarColumnas);

        modeloTabla = new DefaultTableModel();
        tabla = new JTable(modeloTabla);
        scrollTabla = new JScrollPane(tabla);

        this.setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        this.add(panel1);
        this.add(panel2);
        this.add(scrollTabla);
    }

    private void crearMatriz() {
        int numFilas = (Integer) spinnerFilas.getValue();
        int numColumnas = (Integer) spinnerColumnas.getValue();
        matriz = new Integer[numFilas][numColumnas];
        nombresColumnas = new String[numColumnas];

        for (int i = 0; i < numColumnas; i++) {
            nombresColumnas[i] = "Col " + (i + 1);
        }
        
        modeloTabla.setColumnIdentifiers(nombresColumnas);
        modeloTabla.setRowCount(numFilas);

        Random r = new Random();
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                matriz[i][j] = r.nextInt(1, 101);
                modeloTabla.setValueAt(matriz[i][j], i, j);
            }
        }
    }

    private void mostrarMatriz() {
        for (Integer[] fila : matriz) {
            System.out.println(java.util.Arrays.toString(fila));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Permitacion2().setVisible(true));
    }
}

