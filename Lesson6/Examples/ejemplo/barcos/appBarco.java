/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo.barcos;

/**
 *
 * @author Andrei
 */
public class appBarco {
    public static void naufragio(Barco barco){
        barco.alarma();//generico,para todos los barcos //metodo polimorfico,ejecuta un metodo u otro dependiendo del objeto que lo llama 
        //viene de una ligadura dinamica
        if (barco instanceof Velero){
           ((Velero) barco).arriar();
        }
        if (barco instanceof Yate){
            ((Yate) barco).lanzarVengala();//casting se puede  hacer automatico de barco a yate/velero, pero  si fuese al reves, de forma manual
        }
    }
    
    public static void main(String[] args) {
        
        Barco barco = null;//referencia clase base, objeto barco no creado
        Velero velero= new Velero();
        Yate yate= new Yate();
        
        
        //barco.alarma();
        
        naufragio(velero);
        naufragio(yate);
    }
}
