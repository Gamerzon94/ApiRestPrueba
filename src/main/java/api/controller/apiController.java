package api.controller;


import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.*;
import api.domain.Usuario;

@ApplicationPath("/api")
@Path("/hola")
public class apiController extends  Application {

    private static final List<Usuario>usuarios = new ArrayList<Usuario>();

    static {
        usuarios.add(new Usuario(1,"tuto","practicante","espera que le manden codigo"));
        usuarios.add(new Usuario(2,"nico","practicante","en proceso de seleccion"));
        usuarios.add(new Usuario(3,"mati","practicante","esta mas atento de los patos que del trabajo"));
    }

    @GET
    @Path("/mundo")
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response getMensaje(){
        return Response.ok(this.usuarios).header("Acces-Control-Allow-Origin","*").build();
    }

    @POST
    @Path("/mundo")
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.TEXT_PLAIN)
    public String postMensaje(Usuario usuarioPost){
        try{
            usuarios.add(new Usuario(usuarioPost.getId(),usuarioPost.getNombre(),usuarioPost.getCargo(),usuarioPost.getMensaje()));
            return "llego usuario";
        }catch (Exception e){
            return "Error: "+e.getMessage();
        }
    }

}
