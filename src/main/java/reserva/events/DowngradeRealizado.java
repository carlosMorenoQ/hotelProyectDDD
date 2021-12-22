package reserva.events;

import co.com.sofka.domain.generic.DomainEvent;
import reserva.values.HabitacionId;
import reserva.values.TipoAcomodacion;

public class DowngradeRealizado extends DomainEvent {

    private final HabitacionId habitacionId;
    private final TipoAcomodacion tipoAcomodacion;

    public DowngradeRealizado(
            HabitacionId habitacionId,
            TipoAcomodacion tipoAcomodacion) {
        super("hotel.reserva.downgradeRealizado");
        this.habitacionId = habitacionId;
        this.tipoAcomodacion = tipoAcomodacion;
    }

    public HabitacionId getHabitacionId() {
        return habitacionId;
    }

    public TipoAcomodacion getTipoAcomodacion() {
        return tipoAcomodacion;
    }

}
