package checkOut.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Recepcionista implements ValueObject<Recepcionista.Properties> {

    private final String cedula;
    private final String nombre;
    private final String apellido;


    public Recepcionista(String cedula, String nombre, String apellido) {
        this.cedula = Objects.requireNonNull(cedula);
        this.nombre = Objects.requireNonNull(nombre);
        this.apellido = Objects.requireNonNull(apellido);
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

    @Override
    public Properties value() {

        return new Properties() {
            @Override
            public String cedula() {
                return cedula;
            }

            @Override
            public String nombre() {
                return nombre;
            }

            @Override
            public String apellido() {
                return apellido;
            }
        };
    }

    public interface Properties {
        String cedula();
        String nombre();
        String apellido();
    }
}
