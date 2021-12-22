package reserva.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Ubicacion implements ValueObject<String> {

    private final String value;

    public Ubicacion(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ubicacion ubicacion = (Ubicacion) o;
        return Objects.equals(value, ubicacion.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}
