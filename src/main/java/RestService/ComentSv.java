/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestService;

import DTO.ComentDTO;
import DaoGenerico.ConexionException;
import DatoClases.Comentario;
import DatoClases.Raza;
import Fechadas.ComentarioFh;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author MARIO
 */
@Path("/ComentSv")
public class ComentSv {
    ComentarioFh objetoFH = null;
    ComentDTO dto = null;
    
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<ComentDTO> getListaDto_JSON() throws ConexionException {
        objetoFH = new ComentarioFh();
        List<Comentario> objetoCl = objetoFH.buscarTodoObj();
        List<ComentDTO> objetoDTO = new ArrayList<ComentDTO>();
        for (Comentario objetoCLS : objetoCl) {
            dto = new ComentDTO(objetoCLS);
            objetoDTO.add(dto);
        }
        return objetoDTO;
    }

    /////
    /////OBTENER UN DEPORTE ESPECIFICO
    @GET
    @Path("/{ID}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public ComentDTO buscarObjeto(@PathParam("ID") String id) throws ConexionException {
        objetoFH = new ComentarioFh();
        Comentario objetoCLS = objetoFH.busacarObj(Integer.parseInt(id));
        dto = new ComentDTO(objetoCLS);
        return dto;
    }

    /////INSERTAR UN NUEVO DEPORTE
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public ComentDTO addObjeto(ComentDTO objetoDto) throws ConexionException {

        objetoFH = new ComentarioFh();
        Comentario objetoCLS = new Comentario();

        objetoCLS.setNombre(objetoDto.getNombre());
        objetoCLS.setFecha(objetoDto.getFecha());
        objetoCLS.setContenido(objetoDto.getContenido());

        objetoFH.crearObj(objetoCLS);
        return dto;
    }

    //// ACTUALIZAR UN DEPORTE
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public ComentDTO actualizarObjeto(ComentDTO objetoDto) throws ConexionException {

        objetoFH = new ComentarioFh();
        Comentario objetoCLS = new Comentario();

        objetoCLS.setNombre(objetoDto.getNombre());
        objetoCLS.setFecha(objetoDto.getFecha());
        objetoCLS.setContenido(objetoDto.getContenido());

        objetoFH.actualizarObj(objetoCLS);
        return dto;
    }

    ///////ELIMINAR UN DEPORTE
    @DELETE
    @Path("/{ID}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void deleteStudent(@PathParam("ID") String id) throws ConexionException {

        objetoFH = new ComentarioFh();
        Comentario objetoCLS = objetoFH.busacarObj(Integer.parseInt(id));
        objetoFH.eliminarObje(objetoCLS);
    }
    
}
