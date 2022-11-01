/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.javeriana.as.jakarta.personapp.ejb.beans;

import co.edu.javeriana.as.jakarta.personapp.ejb.entities.EstudiosEntity;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author aasanchez
 */
@Local
public interface EstudiosFacadeLocal {

    void create(EstudiosEntity estudios);

    void edit(EstudiosEntity estudios);

    void remove(EstudiosEntity estudios);

    EstudiosEntity find(Object id);

    List<EstudiosEntity> findAll();

    List<EstudiosEntity> findRange(int[] range);

    int count();

}
