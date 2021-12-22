package reserva.comands;

import co.com.sofka.domain.generic.Command;
import reserva.values.HabitacionId;
import reserva.values.TipoAcomodacion;

public class RealizarDowngrade extends Command {

    private final HabitacionId habitacionId;
    private final TipoAcomodacion tipoAcomodacio;

    public RealizarDowngrade(
            HabitacionId habitacionId,
            TipoAcomodacion tipoAcomodacio) {
        this.habitacionId = habitacionId;
        this.tipoAcomodacio = tipoAcomodacio;
    }

    public HabitacionId getHabitacionId() {
        return habitacionId;
    }

    public TipoAcomodacion getTipoAcomodacio() {
        return tipoAcomodacio;
    }
}
