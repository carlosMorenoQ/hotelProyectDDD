package reserva.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CantidadPersonas implements ValueObject<Integer> {

    private final Integer value;

    public CantidadPersonas(Integer value) {
        this.value = value;
    }

    @Override
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CantidadPersonas capacidad = (CantidadPersonas) o;
        return Objects.equals(value, capacidad.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
