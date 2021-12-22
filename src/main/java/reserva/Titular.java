package reserva;

import co.com.sofka.domain.generic.Entity;
import reserva.values.TipoCliente;
import reserva.values.TitularId;

import java.util.Objects;

public class Titular extends Entity<TitularId> {

    private TipoCliente tipoCliente;
    private MedioDePago medioDePago;

    public Titular(
            TitularId titularId,
            TipoCliente tipoCliente,
            MedioDePago medioDePago) {
        super(titularId);
        this.tipoCliente = tipoCliente;
        this.medioDePago = medioDePago;
    }

    public void modificarMedioDePago(MedioDePago medioDePago){
        this.medioDePago= Objects.requireNonNull(medioDePago);
    }

    public TipoCliente tipoCliente() {
        return tipoCliente;
    }

    public MedioDePago medioDePago() {
        return medioDePago;
    }
}
