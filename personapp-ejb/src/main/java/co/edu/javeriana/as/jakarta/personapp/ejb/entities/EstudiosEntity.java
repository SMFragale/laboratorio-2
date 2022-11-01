package co.edu.javeriana.as.jakarta.personapp.ejb.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "estudios", schema = "arq_per_db", catalog = "")
@IdClass(EstudiosEntityPK.class)
public class EstudiosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_prof", nullable = false)
    private int idProf;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "cc_per", nullable = false)
    private int ccPer;
    @Basic
    @Column(name = "fecha", nullable = true)
    private Date fecha;
    @Basic
    @Column(name = "univer", nullable = true, length = 50)
    private String univer;

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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUniver() {
        return univer;
    }

    public void setUniver(String univer) {
        this.univer = univer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EstudiosEntity that = (EstudiosEntity) o;

        if (idProf != that.idProf) return false;
        if (ccPer != that.ccPer) return false;
        if (fecha != null ? !fecha.equals(that.fecha) : that.fecha != null) return false;
        if (univer != null ? !univer.equals(that.univer) : that.univer != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProf;
        result = 31 * result + ccPer;
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        result = 31 * result + (univer != null ? univer.hashCode() : 0);
        return result;
    }
}
