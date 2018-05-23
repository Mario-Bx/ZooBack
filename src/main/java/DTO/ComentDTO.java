/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import DatoClases.Comentario;
import DatoClases.Raza;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author MARIO
 */
@XmlRootElement(name = "CoemntDTO")
@XmlAccessorType(XmlAccessType.FIELD)
public class ComentDTO {
    
    private int ID_Comentario;
    private String nombre;
    private String fecha;
    private String contenido;

    public ComentDTO() {
    }

    public ComentDTO(Comentario objetoCL) {
        this.ID_Comentario = objetoCL.getID_Comentario();
        this.nombre = objetoCL.getNombre();
        this.fecha = objetoCL.getFecha();
        this.contenido = objetoCL.getContenido();
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
