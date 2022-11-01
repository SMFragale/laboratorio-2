/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.jakarta.personapp.ejb.beans.impl;

import co.edu.javeriana.as.jakarta.personapp.ejb.beans.AbstractFacade;
import co.edu.javeriana.as.jakarta.personapp.ejb.beans.EstudiosFacadeLocal;
import co.edu.javeriana.as.jakarta.personapp.ejb.entities.EstudiosEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 *
 * @author aasanchez
 */
@Stateless
public class EstudiosFacade extends AbstractFacade<EstudiosEntity> implements EstudiosFacadeLocal {

    @PersistenceContext(unitName = "persona_pu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstudiosFacade() {
        super(EstudiosEntity.class);
    }

    @Override
    public List<EstudiosEntity> findRange(int[] range) {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }
}
