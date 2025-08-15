/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import view.BibliotecaView;
import model.ConexionBd;
/**
 *
 * @author Andrei
 */
public class app {

    public static void main(String[] args) {
        ConexionBd conexion = new ConexionBd();
        BibliotecaView biblio = new BibliotecaView(conexion);
        biblio.setVisible(true);
    }
}
