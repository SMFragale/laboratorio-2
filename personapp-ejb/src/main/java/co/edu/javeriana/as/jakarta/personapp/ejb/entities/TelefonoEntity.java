package co.edu.javeriana.as.jakarta.personapp.ejb.entities;

import javax.persistence.*;

@Entity
@Table(name = "telefono", schema = "arq_per_db", catalog = "")
public class TelefonoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "num", nullable = false, length = 15)
    private String num;
    @Basic
    @Column(name = "oper", nullable = false, length = 45)
    private String oper;
    @Basic
    @Column(name = "duenio", nullable = false)
    private int duenio;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    public int getDuenio() {
        return duenio;
    }

    public void setDuenio(int duenio) {
        this.duenio = duenio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TelefonoEntity that = (TelefonoEntity) o;

        if (duenio != that.duenio) return false;
        if (num != null ? !num.equals(that.num) : that.num != null) return false;
        if (oper != null ? !oper.equals(that.oper) : that.oper != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = num != null ? num.hashCode() : 0;
        result = 31 * result + (oper != null ? oper.hashCode() : 0);
        result = 31 * result + duenio;
        return result;
    }
}
