/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.jakarta.personapp.ejb.beans;

import co.edu.javeriana.as.jakarta.personapp.ejb.entities.PersonaEntity;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aasanchez
 */
@Local
public interface PersonaFacadeLocal {

    void create(PersonaEntity persona);

    void edit(PersonaEntity persona);

    void remove(PersonaEntity persona);

    PersonaEntity find(Object id);

    List<PersonaEntity> findAll();

    List<PersonaEntity> findRange(int[] range);

    int count();
    
}
