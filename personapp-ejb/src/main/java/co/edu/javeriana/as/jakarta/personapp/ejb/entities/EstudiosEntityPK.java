package co.edu.javeriana.as.jakarta.personapp.ejb.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class EstudiosEntityPK implements Serializable {
    @Column(name = "id_prof", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProf;
    @Column(name = "cc_per", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ccPer;

    public int getIdProf() {
        return idProf;
    }

    public void setIdProf(int idProf) {
        this.idProf = idProf;
    }

    public int getCcPer() {
        return ccPer;
    }

    public void setCcPer(int ccPer) {
        this.ccPer = ccPer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EstudiosEntityPK that = (EstudiosEntityPK) o;

        if (idProf != that.idProf) return false;
        if (ccPer != that.ccPer) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProf;
        result = 31 * result + ccPer;
        return result;
    }
}
