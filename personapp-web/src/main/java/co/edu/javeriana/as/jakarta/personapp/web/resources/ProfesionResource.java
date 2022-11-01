package co.edu.javeriana.as.jakarta.personapp.web.resources;
import co.edu.javeriana.as.jakarta.personapp.ejb.beans.ProfesionFacadeLocal;
import co.edu.javeriana.as.jakarta.personapp.ejb.entities.ProfesionEntity;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("profesion")
public class ProfesionResource {


    @Inject
    private ProfesionFacadeLocal profesionFacadeLocal;

    public ProfesionResource() {
    }

    @GET
    public Response getProfesion() {
        return Response.ok(profesionFacadeLocal.findAll()).build();
    }

    @POST
    public Response createProfesion(ProfesionEntity profesion) {
        profesionFacadeLocal.create(profesion);
        return Response.ok(profesion).build();
    }

    @DELETE
    public Response deleteProfesion(ProfesionEntity profesion) {
        profesionFacadeLocal.remove(profesion);
        return Response.ok(profesion).build();
    }

    @PUT
    public Response updateProfesion(ProfesionEntity profesion) {
        profesionFacadeLocal.edit(profesion);
        return Response.ok(profesion).build();
    }
}
