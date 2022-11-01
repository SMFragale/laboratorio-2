/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.jakarta.personapp.ejb.beans;

import co.edu.javeriana.as.jakarta.personapp.ejb.entities.ProfesionEntity;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aasanchez
 */
@Local
public interface ProfesionFacadeLocal {

    void create(ProfesionEntity profesion);

    void edit(ProfesionEntity profesion);

    void remove(ProfesionEntity profesion);

    ProfesionEntity find(Object id);

    List<ProfesionEntity> findAll();

    List<ProfesionEntity> findRange(int[] range);

    int count();
    
}
