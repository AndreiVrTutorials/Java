        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import com.opencsv.CSVReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrei
 */
public class csvReader {
    public static List<employees> leerEmpleados(){
        
        List<employees> empleados = new ArrayList<>();
        
        try{
            InputStream is = csvReader.class.getClassLoader().getResourceAsStream("csv/employees.csv");
            if(is ==null){
                System.err.println("Error. No se encontro el archivo csv");
                return empleados;
            }else{
                System.out.println("Archivo encontrado correctamente");
                CSVReader reader = new CSVReader(new InputStreamReader(is));            
                String[] fila;
                boolean cabecera = true;
                
                while ((fila =reader.readNext())!=null){
                    if (cabecera!=false){
                        cabecera = false;
                        continue;
                    }else{
                        int employee_id = Integer.parseInt(fila[0].trim());
                        String first_name = fila[1].trim();
                        String last_name = fila[2].trim();
                        String department_id = fila[3].trim();
                        
                        empleados.add(new employees(employee_id, first_name, last_name, department_id));          
                    }
                }
            }
        }catch (Exception ex){
            System.out.println(ex);
        }
        return empleados;
    }
}
