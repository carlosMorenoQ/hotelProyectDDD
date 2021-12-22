package checkOut.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ConsumoMinibar implements ValueObject<Double> {

    private final Double value;

    public ConsumoMinibar(Double value) {
        this.value = value;
    }

    @Override
    public Double value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConsumoMinibar that = (ConsumoMinibar) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
