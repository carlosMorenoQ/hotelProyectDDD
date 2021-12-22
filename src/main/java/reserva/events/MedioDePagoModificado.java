package reserva.events;

import co.com.sofka.domain.generic.DomainEvent;
import reserva.MedioDePago;
import reserva.values.TitularId;

public class MedioDePagoModificado extends DomainEvent {
    public final TitularId titularId;
    public final MedioDePago medioDePago;

    public MedioDePagoModificado(
            TitularId titularId,
            MedioDePago medioDePago) {
        super("hotel.reserva.medioDePagoModificado");
        this.medioDePago = medioDePago;
        this.titularId = titularId;
    }

    public TitularId getTitularId() {
        return titularId;
    }

    public MedioDePago getMedioDePago() {
        return medioDePago;
    }

}
