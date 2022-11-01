package co.edu.javeriana.as.jakarta.personapp.web.resources;


import co.edu.javeriana.as.jakarta.personapp.ejb.beans.EstudiosFacadeLocal;
import co.edu.javeriana.as.jakarta.personapp.ejb.entities.EstudiosEntity;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("estudios")
public class EstudiosResource {


    @Inject
    private EstudiosFacadeLocal estudiosFacadeLocal;

    public EstudiosResource() {
    }

    @GET
    public Response getEstudios() {
        return Response.ok(estudiosFacadeLocal.findAll()).build();
    }

    @POST
    public Response createEstudios(EstudiosEntity estudios) {
        estudiosFacadeLocal.create(estudios);
        return Response.ok(estudios).build();
    }

    @DELETE
    public Response deleteEstudios(EstudiosEntity estudios) {
        estudiosFacadeLocal.remove(estudios);
        return Response.ok(estudios).build();
    }

    @PUT
    public Response updateEstudios(EstudiosEntity estudios) {
        estudiosFacadeLocal.edit(estudios);
        return Response.ok(estudios).build();
    }
}
