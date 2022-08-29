package poo.interfacesRepositorio.modelo;

import java.util.Objects;

public class BaseEntidad {

    protected Integer id;

    private static int ultimoId;

    public BaseEntidad() {
        this.id = ++ultimoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntidad baseEntidad = (BaseEntidad) o;
        return Objects.equals(id, baseEntidad.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
