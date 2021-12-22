package checkIn.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public final class FechaLLegada implements ValueObject<Date> {

    private final Date value;

    public FechaLLegada(Date value) {
        this.value = Objects.requireNonNull(value,"la fecha no puede ser null");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FechaLLegada that = (FechaLLegada) o;
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
