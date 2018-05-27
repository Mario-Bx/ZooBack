/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestService;

import DTO.RazaDTO;
import DaoGenerico.ConexionException;
import DatoClases.Raza;
import Fechadas.RazaFh;

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
@Path("/RazaSv")
public class RazaSv {
    RazaFh objetoFH = null;
    RazaDTO dto = null;
    
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<RazaDTO> getListaDto_JSON() throws ConexionException {
        objetoFH = new RazaFh();
        List<Raza> objetoCl = objetoFH.buscarTodoObj();
        List<RazaDTO> objetoDTO = new ArrayList<RazaDTO>();
        for (Raza objetoCLS : objetoCl) {
            dto = new RazaDTO(objetoCLS);
            objetoDTO.add(dto);
        }
        return objetoDTO;
    }

    /////
    /////OBTENER UN DEPORTE ESPECIFICO
    @GET
    @Path("/{ID}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public RazaDTO buscarObjeto(@PathParam("ID") String id) throws ConexionException {
        objetoFH = new RazaFh();
        Raza objetoCLS = objetoFH.busacarObj(Integer.parseInt(id));
        dto = new RazaDTO(objetoCLS);
        return dto;
    }

    /////INSERTAR UN NUEVO DEPORTE
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public RazaDTO addObjeto(RazaDTO objetoDto) throws ConexionException {

        objetoFH = new RazaFh();
        Raza objetoCLS = new Raza();

        objetoCLS.setImagen(objetoDto.getImagen());
        objetoCLS.setNombre(objetoDto.getNombre());
        objetoCLS.setEnergia(objetoDto.getEnergia());
        objetoCLS.setDescripcion(objetoDto.getDescripcion());

        objetoFH.crearObj(objetoCLS);
        return dto;
    }

    //// ACTUALIZAR UN DEPORTE
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public RazaDTO actualizarObjeto(RazaDTO objetoDto) throws ConexionException {

        objetoFH = new RazaFh();
        Raza objetoCLS = new Raza();
        objetoCLS.setID_Raza(0);objetoDto.getID_Raza();
        objetoCLS.setImagen(objetoDto.getImagen());
        objetoCLS.setNombre(objetoDto.getNombre());
        objetoCLS.setEnergia(objetoDto.getEnergia());
        objetoCLS.setDescripcion(objetoDto.getDescripcion());

        objetoFH.actualizarObj(objetoCLS);
        return dto;
    }

    ///////ELIMINAR UN DEPORTE
    @DELETE
    @Path("/{ID}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void deleteStudent(@PathParam("ID") String id) throws ConexionException {

        objetoFH = new RazaFh();
        Raza objetoCLS = objetoFH.busacarObj(Integer.parseInt(id));
        objetoFH.eliminarObje(objetoCLS);
    }
}
