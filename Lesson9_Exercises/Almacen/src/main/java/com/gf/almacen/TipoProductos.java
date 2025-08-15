/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gf.almacen;

/**
 *
 * @author laccasda
 */
public class TipoProductos {
    
   private int idTipo;
   private char tipo;

    public TipoProductos() {
    }

    public TipoProductos(int idTipo, char tipo) {
        this.idTipo = idTipo;
        this.tipo = tipo;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return tipo + "";
    }
   
   
    
}
