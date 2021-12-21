package checkIn.values;

import java.io.Serializable;
import java.util.Objects;

public final class Recepcionista implements Serializable {

    private final Integer cedula;
    private final String nombre;
    private final String apellido;

    public Recepcionista(Integer cedula, String nombre, String apellido) {
        this.cedula = Objects.requireNonNull(cedula);
        this.nombre = Objects.requireNonNull(nombre);
        this.apellido = Objects.requireNonNull(apellido);
    }

    public Integer getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recepcionista that = (Recepcionista) o;
        return Objects.equals(cedula, that.cedula) && Objects.equals(nombre, that.nombre) && Objects.equals(apellido, that.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cedula, nombre, apellido);
    }

}
