/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Andrei
 */
public class Respuesta {
    private int id_resp;
    private int y;
    private int n;
    private int ns;

    public Respuesta( int y, int n, int ns) {
        this.y = y;
        this.n = n;
        this.ns = ns;
    }

    public void setId_resp(int id_resp) {
        this.id_resp = id_resp;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setNs(int ns) {
        this.ns = ns;
    }

    public int getId_resp() {
        return id_resp;
    }

    public int getY() {
        return y;
    }

    public int getN() {
        return n;
    }

    public int getNs() {
        return ns;
    }

    @Override
    public String toString() {
        return "Respuesta{" + "id_resp=" + id_resp + ", y=" + y + ", n=" + n + ", ns=" + ns + '}';
    }
    
}
