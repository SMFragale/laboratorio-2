/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.jakarta.personapp.ejb.beans;

import co.edu.javeriana.as.jakarta.personapp.ejb.entities.TelefonoEntity;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aasanchez
 */
@Local
public interface TelefonoFacadeLocal {

    void create(TelefonoEntity telefono);

    void edit(TelefonoEntity telefono);

    void remove(TelefonoEntity telefono);

    TelefonoEntity find(Object id);

    List<TelefonoEntity> findAll();

    List<TelefonoEntity> findRange(int[] range);

    int count();
    
}
