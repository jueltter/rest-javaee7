/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.samagua.rest.javaee7;

import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;
import tech.samagua.rest.beans.EmpleadoFacade;
import tech.samagua.rest.entidades.Empleado;

/**
 *
 * @author Stalin
 */
@Path("/message")
public class JerseyService {
    
    @EJB
    private EmpleadoFacade ejbEmpleado;

    /*@GET
    public String getMsg() {
        return "Hello World !! - Jersey 2";
    }*/
    
    @GET
    @Produces({"application/json"})
    public Response consultar()  {
        List<Empleado> lista = ejbEmpleado.findAll();
        GenericEntity<List<Empleado>> entity;
        entity = new GenericEntity<List<Empleado>>(lista) {
        };
        return Response.ok(entity).build();
    }

}
