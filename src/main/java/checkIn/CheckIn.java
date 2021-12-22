package checkIn;

import checkIn.events.CheckInCreado;
import checkIn.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Set;

public class CheckIn extends AggregateEvent<CheckInId> {

    private FechaLLegada fechaLLegada;
    private Set<Huesped> Huespedes;
    private ContratoHospedaje contratoHospedaje;
    private Recepcionista recepcionista;

    public CheckIn(CheckInId checkInId, FechaLLegada fechaLLegada, Set<Huesped> huespedes, ContratoHospedaje contratoHospedaje, Recepcionista recepcionista) {
        super(checkInId);
        appendChange(new CheckInCreado())
    }


}
