/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema.pkg7;

import java.util.Arrays;

/**
 *
 * @author Andrei
 */
public class ejemploBusqueda {
    public static void main(String[] args) {
        int[] array={4,2,8,1,3,0,6};
        System.out.println(Arrays.toString(array));
        
        Arrays.sort(array);//sort ordenacion
        System.out.println(Arrays.toString(array));
        int posicion = Arrays.binarySearch(array, 2);
        System.out.println(posicion);
        
        int posicion1 = Arrays.binarySearch(array, 5);
        System.out.println(posicion1);
        
    }
}
