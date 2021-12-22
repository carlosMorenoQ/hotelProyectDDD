package genericos;

import java.io.Serializable;
import java.util.Objects;

public abstract class ObjetoNumero implements Serializable {

    private final Integer numero;

    protected ObjetoNumero(Integer numero) {
        this.numero = Objects.requireNonNull(numero);
    }

    public Integer getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjetoNumero that = (ObjetoNumero) o;
        return Objects.equals(numero, that.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }
}
