/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.samagua.rest.beans;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import tech.samagua.rest.entidades.Empleado;

/**
 *
 * @author Stalin
 */
@Stateless
public class EmpleadoFacade {

    public List<Empleado> findAll() {
        List<Empleado> retorno = new ArrayList<>();
        for (int i= 0; i<10; i++) {
            Empleado empleado = new Empleado();
            empleado.setCedula("cédula" + i);
            empleado.setNombre("nombre" + i);
            retorno.add(empleado);
        }
        return retorno;
    }
}
