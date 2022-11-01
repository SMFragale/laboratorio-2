package co.edu.javeriana.as.jakarta.personapp.web.resources;

import co.edu.javeriana.as.jakarta.personapp.ejb.beans.TelefonoFacadeLocal;
import co.edu.javeriana.as.jakarta.personapp.ejb.entities.TelefonoEntity;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.enterprise.context.RequestScoped;


@Path("telefono")
@RequestScoped
public class TelefonoResource {
    @Inject
    private TelefonoFacadeLocal telefonoFacadeLocal;

    public TelefonoResource() {
    }

    @GET
    public Response getTelefonos() {
        return Response.ok(telefonoFacadeLocal.findAll()).build();
    }

    @POST
    public Response createTelefono(TelefonoEntity telefono) {
        telefonoFacadeLocal.create(telefono);
        return Response.ok(telefono).build();
    }

    @DELETE
    public Response deleteTelefono(TelefonoEntity telefono) {
        telefonoFacadeLocal.remove(telefono);
        return Response.ok(telefono).build();
    }

    @PUT
    public Response updateTelefono(TelefonoEntity telefono) {
        telefonoFacadeLocal.edit(telefono);
        return Response.ok(telefono).build();
    }

}
