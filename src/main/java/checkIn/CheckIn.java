package checkIn;

import checkIn.events.CheckInCreado;
import checkIn.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import java.util.Set;

public class CheckIn extends AggregateEvent<CheckInId> {

    protected FechaLLegada fechaLLegada;
    protected Set<Huesped> huespedes;
    protected ContratoHospedaje contratoHospedaje;
    protected Recepcionista recepcionista;
    protected LLaveHabitacion lLaveHabitacion;

    public CheckIn(CheckInId checkInId,
                   FechaLLegada fechaLLegada,
                   ContratoHospedaje contratoHospedaje,
                   Recepcionista recepcionista,
                   Huesped huesped,
                   LLaveHabitacion lLaveHabitacion) {
        super(checkInId);
        appendChange(new CheckInCreado(fechaLLegada,contratoHospedaje,recepcionista)).apply();
    }


}
