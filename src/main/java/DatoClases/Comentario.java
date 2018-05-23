/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatoClases;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author MARIO
 */
@Entity
@Table(name = "COMENTARIOS")
public class Comentario implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_Comentario;
    
    private String nombre;
    private String fecha;
    private String contenido;

    public Comentario() {
    }

    public Comentario(String nombre, String fecha, String contenido) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.contenido = contenido;
    }

    public int getID_Comentario() {
        return ID_Comentario;
    }

    public void setID_Comentario(int ID_Comentario) {
        this.ID_Comentario = ID_Comentario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    
    
    

    
    
    
}
