package reserva.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoCliente implements ValueObject<String> {

    private final String value;

    public TipoCliente(String value) {
        this.value = value;
    }

    @Override
    public String value() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoCliente that = (TipoCliente) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
