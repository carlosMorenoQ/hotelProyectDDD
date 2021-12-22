package reserva.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoAcomodacion implements ValueObject<String> {

    private final String value;

    public TipoAcomodacion(String value) {
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
        TipoAcomodacion that = (TipoAcomodacion) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
