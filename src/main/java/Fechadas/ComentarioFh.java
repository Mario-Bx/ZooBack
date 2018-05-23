/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fechadas;

import DaoGenerico.ConexionException;
import DaoGenerico.ServiceImpl;
import DaoGenerico.SingletonConnection;
import DatoClases.Comentario;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author MARIO
 */
public class ComentarioFh extends ServiceImpl<Comentario>{
    public ComentarioFh() throws ConexionException {
        super(Comentario.class);
        try {
            EntityManager objetoEnty = SingletonConnection.getConnection();
            super.setEntityManager(objetoEnty);

        } catch (Exception e) {
            throw new ConexionException("Problemas en la realizacion de conexion con la base de datos en Deporte Fachada");
        }
    }

    @Override
    public List<Comentario> buscarTodoObj() {
        return super.buscarTodoObj();
    }
}
