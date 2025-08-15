/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

/**
 * @author vroan 
 * Realiza un programa que calcule el producto de 2 enteros, con recursividad.  
 */

public class ProductoRecursivo {
    public int producto(int n1, int n2) {
        if (n2 == 0) {
            return 0;
        }

        if (n2 >= 0) {
            return n1 + producto(n1, --n2);
        } else {
            return -n1 + producto(n1, ++n2);
        }

    }

    public static void main(String[] args) {
        ProductoRecursivo pr = new ProductoRecursivo();
        System.out.println(pr.producto(-2, 3));
    }
}
