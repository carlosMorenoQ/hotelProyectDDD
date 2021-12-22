package reserva.events;

import co.com.sofka.domain.generic.DomainEvent;
import reserva.values.HabitacionId;
import reserva.values.IsBloqueada;

public class BloqueoHabitacionModificado extends DomainEvent {

    private final HabitacionId habitacionId;
    private final IsBloqueada isBloqueada;

    public BloqueoHabitacionModificado(
            HabitacionId habitacionId,
            IsBloqueada isBloqueada) {
        super("hotel.reserva.bloqueHabitacionModificado");
        this.habitacionId = habitacionId;
        this.isBloqueada = isBloqueada;
    }

    public HabitacionId getHabitacionId() {
        return habitacionId;
    }

    public IsBloqueada getIsBloqueada() {
        return isBloqueada;
    }

}
