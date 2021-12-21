package checkIn.values;

import java.io.Serializable;
import java.util.Objects;

public final class ContratoHospedaje implements Serializable {

    private final Integer numeroContrato;

    public ContratoHospedaje(Integer numeroContrato) {
        this.numeroContrato = Objects.requireNonNull(numeroContrato);
    }

    public Integer getNumeroContrato() {
        return this.numeroContrato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContratoHospedaje that = (ContratoHospedaje) o;
        return Objects.equals(numeroContrato, that.numeroContrato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroContrato);
    }

}
