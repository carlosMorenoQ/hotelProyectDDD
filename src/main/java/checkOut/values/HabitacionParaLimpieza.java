package checkOut.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class HabitacionParaLimpieza implements ValueObject<Integer> {

    private final Integer value;

    public HabitacionParaLimpieza(Integer value) {
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
        HabitacionParaLimpieza that = (HabitacionParaLimpieza) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
