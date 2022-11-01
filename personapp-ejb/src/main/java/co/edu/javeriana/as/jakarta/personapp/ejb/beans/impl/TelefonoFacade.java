/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.javeriana.as.jakarta.personapp.ejb.beans.impl;

import co.edu.javeriana.as.jakarta.personapp.ejb.beans.AbstractFacade;
import co.edu.javeriana.as.jakarta.personapp.ejb.beans.TelefonoFacadeLocal;
import co.edu.javeriana.as.jakarta.personapp.ejb.entities.TelefonoEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 *
 * @author aasanchez
 */
@Stateless
public class TelefonoFacade extends AbstractFacade<TelefonoEntity> implements TelefonoFacadeLocal {

    @PersistenceContext(unitName = "persona_pu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TelefonoFacade() {
        super(TelefonoEntity.class);
    }

    @Override
    public List<TelefonoEntity> findRange(int[] range) {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }
}
