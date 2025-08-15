/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import java.util.List;
import model.employees;
import model.csvReader;
import view.employeesView;

/**
 *
 * @author Andrei
 */
public class app {
    /* -------------PRUEBA 1---------
    public static void main(String[] args) {
        //prueba
        List<employees> empleados = csvReader.leerEmpleados();
        for (employees emp : empleados){
            System.out.println(emp); 
       }
    }
*/
    public static void main(String[] args) {
        employeesView ventana = new employeesView();
        ventana.setVisible(true);
    }
}
