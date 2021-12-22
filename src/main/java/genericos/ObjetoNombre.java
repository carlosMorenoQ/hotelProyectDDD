package genericos;

import java.io.Serializable;
import java.util.Objects;

public abstract class ObjetoNombre implements Serializable {

    private final String valor;

    protected ObjetoNombre(String valor) {
        this.valor = Objects.requireNonNull(valor);
    }

    public String getValor() {
        return valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjetoNombre that = (ObjetoNombre) o;
        return Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }

}
