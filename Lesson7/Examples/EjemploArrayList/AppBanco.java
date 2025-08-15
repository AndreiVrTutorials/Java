/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemploArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrei
 */
public class AppBanco {

    // Método que devuelve cuentas con saldo superior a un importe dado
    public ArrayList<CuentaBancaria> getCuentas(ArrayList<CuentaBancaria> lista, double importe) {
        ArrayList<CuentaBancaria> listaResultado = new ArrayList<>();
        for (CuentaBancaria cuenta : lista) { // Corrección en el for
            if (cuenta.getSaldo() > importe) {
                listaResultado.add(cuenta);
            }
        }
        return listaResultado;
    }

    // Método que ordena los clientes por NIF (DNI)
    public void ordenarClientesXNIF(ArrayList<Cliente> lista) {
        Collections.sort(lista);
    }

    // Método que busca un cliente por su código
    public Cliente getCliente(ArrayList<Cliente> listaCliente, int codigoCliente) {
        for (Cliente cliente : listaCliente) {
            if (cliente.getCodigoCliente() == codigoCliente) { 
                return cliente;
            }
        }
        return null;
    }

    // Método que ordena las cuentas por fecha de apertura en orden descendente
    public void ordenarCuentasXFecha(ArrayList<CuentaBancaria> listaCuentas) {
        listaCuentas.sort(Comparator.comparing(CuentaBancaria::getFechaApertura).reversed());
    }
    
    //
    public static void main(String[] args) {
        AppBanco app = new AppBanco();
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<CuentaBancaria> listaCuentas = new ArrayList<>();

        try {
            Cliente cliente1 = new Cliente("1233445Y", "Andrei", "Vrote", "Valladolid", 232134);
            Cliente cliente2 = new Cliente("1233345Y", "Alicia", "Nose", "Medina", 5434634);

            listaClientes.add(cliente1);
            listaClientes.add(cliente2);

            System.out.println("Lista de clientes:");
            System.out.println(listaClientes);

            CuentaBancaria cuenta1 = new CuentaBancaria(cliente1, "233455356");
            listaCuentas.add(cuenta1); // Se añade la cuenta creada a la lista
            //--------------------------------------------------------------------------
            // Prueba de método getCuentas
            ArrayList<CuentaBancaria> resultado = app.getCuentas(listaCuentas, 1000); 
            if (resultado.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay ninguna cuenta con saldo superior al importe dado.");
            }
            //-----------------------------------------------------------------------
            // Ordenar clientes por NIF
            System.out.println("Lista de clientes ordenada por NIF:");
            app.ordenarClientesXNIF(listaClientes);
            System.out.println(listaClientes);
            //-----------------------------------------------------------------------
            // Búsqueda de cliente por código
            Cliente clienteResultado = app.getCliente(listaClientes, 1); // Se pasa directamente el código
            if (clienteResultado != null) {
                System.out.println("Cliente encontrado:");
                System.out.println(clienteResultado);
            } else {
                JOptionPane.showMessageDialog(null, "No hay cliente con ese código.");
            }
            //------------------------------------------------------------------------
            // Ordenar cuentas por fecha de apertura (descendente)
            System.out.println("Lista de cuentas ordenadas por fecha de apertura:");
            app.ordenarCuentasXFecha(listaCuentas);
            System.out.println(listaCuentas);

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
