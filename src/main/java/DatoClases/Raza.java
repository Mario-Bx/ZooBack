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
@Table(name = "RAZA")
public class Raza implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_Raza;

    private String imagen;
    private String nombre;
    private int energia;
    private String descripcion;

    public Raza() {
    }

    public Raza(String imagen, String nombre, int energia, String descripcion) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.energia = energia;
        this.descripcion = descripcion;
    }

    public int getID_Raza() {
        return ID_Raza;
    }

    public void setID_Raza(int ID_Raza) {
        this.ID_Raza = ID_Raza;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
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

    
}
