package checkIn.values;


import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class NumeroHabitacionHuesped implements ValueObject<Integer> {

    private final Integer value;

    public NumeroHabitacionHuesped(Integer value) {
        this.value = value;
    }

    @Override
    public Integer value() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumeroHabitacionHuesped that = (NumeroHabitacionHuesped) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
