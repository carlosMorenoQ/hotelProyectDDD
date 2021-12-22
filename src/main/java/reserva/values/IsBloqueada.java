package reserva.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class IsBloqueada implements ValueObject<Boolean> {

    private final Boolean value;

    public IsBloqueada(Boolean value) {
        this.value = value;
    }

    @Override
    public Boolean value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IsBloqueada that = (IsBloqueada) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
