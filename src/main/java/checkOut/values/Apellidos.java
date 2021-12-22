package checkOut.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Apellidos implements ValueObject<String> {

    private final String value;

    public Apellidos(String value) {
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
        Apellidos apellidos = (Apellidos) o;
        return Objects.equals(value, apellidos.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
