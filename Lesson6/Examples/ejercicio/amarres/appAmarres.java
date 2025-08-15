/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.amarres;

import java.time.LocalDate;

/**
 *
 * @author Andrei
 */
public class appAmarres {
    public static void main(String[] args) {
        BARCO barco= new BARCO("6665DTR", 0, LocalDate.MIN, "Manu", "12345678M", LocalDate.MIN, LocalDate.MIN, "A1", "Yate xxl");
        System.out.println(barco);
    }
}
