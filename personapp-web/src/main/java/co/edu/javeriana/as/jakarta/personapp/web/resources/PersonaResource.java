package co.edu.javeriana.as.jakarta.personapp.web.resources;

import co.edu.javeriana.as.jakarta.personapp.ejb.beans.PersonaFacadeLocal;
import co.edu.javeriana.as.jakarta.personapp.ejb.entities.PersonaEntity;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.enterprise.context.RequestScoped;


@Path("persona")
@RequestScoped
public class PersonaResource {
    @Inject
    private PersonaFacadeLocal personaFacadeLocal;

    public PersonaResource() {
    }

    @GET
    public Response getPersonas() {
        return Response.ok(personaFacadeLocal.findAll()).build();
    }

    @POST
    public Response createPersona(PersonaEntity persona) {
        personaFacadeLocal.create(persona);
        return Response.ok(persona).build();
    }

    @DELETE
    public Response deletePersona(PersonaEntity persona) {
        personaFacadeLocal.remove(persona);
        return Response.ok(persona).build();
    }

    @PUT
    public Response updatePersona(PersonaEntity persona) {
        personaFacadeLocal.edit(persona);
        return Response.ok(persona).build();
    }

}
