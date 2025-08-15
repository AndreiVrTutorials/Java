/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Andrei
 */
public class Libros {
    private int id;
    private String titulo;
    private String autor;
    private String genero;
    private int anio_publicacion;

    public Libros(int id, String titulo, String autor, String genero, int anio_publicacion) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anio_publicacion = anio_publicacion;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnio_publicacion() {
        return anio_publicacion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAnio_publicacion(int anio_publicacion) {
        this.anio_publicacion = anio_publicacion;
    }
    
    
}
