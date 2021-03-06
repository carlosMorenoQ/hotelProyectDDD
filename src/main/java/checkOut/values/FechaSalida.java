package checkOut.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public final class FechaSalida implements ValueObject<Date> {

    private final Date value;

    public FechaSalida(Date value) {
        this.value = Objects.requireNonNull(value,"la fecha no puede ser null");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FechaSalida that = (FechaSalida) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public Date value() {
        return value;
    }

}
