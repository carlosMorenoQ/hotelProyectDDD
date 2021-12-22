package reserva;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class MedioDePago implements ValueObject<String> {

    private final String value;

    public MedioDePago(String value) {
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
        MedioDePago that = (MedioDePago) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
