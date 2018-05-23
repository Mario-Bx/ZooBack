/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author MARIO
 */


import DatoClases.Raza;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RazaDTO")
@XmlAccessorType(XmlAccessType.FIELD)
public class RazaDTO {
    
    private int ID_Raza;
    private String imagen;
    private String nombre;
    private int energia;
    private String descripcion;

    public RazaDTO() {
    }

    public RazaDTO(Raza objetoCL) {
        this.ID_Raza = objetoCL.getID_Raza();
        this.imagen = objetoCL.getImagen();
        this.nombre = objetoCL.getNombre();
        this.energia = objetoCL.getEnergia();
        this.descripcion = objetoCL.getDescripcion();
    }

    public int getID_Raza() {
        return ID_Raza;
    }

    public void setID_Raza(int ID_Raza) {
        this.ID_Raza = ID_Raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    
        
}
