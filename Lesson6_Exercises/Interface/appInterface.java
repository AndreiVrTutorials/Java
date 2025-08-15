/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo.Interface;

/**
 *
 * @author Andrei
 */
public class appInterface {
    public static void main(String[] args) {
        Barco ref =null;
        ref=new Lancha();// por ligadura dinamica
        ref.alarma();
    }
}
