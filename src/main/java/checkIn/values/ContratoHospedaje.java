package checkIn.values;

import co.com.sofka.domain.generic.ValueObject;
import java.util.Objects;

public final class ContratoHospedaje implements ValueObject<Integer> {

    private final Integer value;

    public ContratoHospedaje(Integer value) {
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
        ContratoHospedaje that = (ContratoHospedaje) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}
