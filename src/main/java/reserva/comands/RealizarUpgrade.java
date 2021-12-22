package reserva.comands;

import co.com.sofka.domain.generic.Command;
import reserva.values.HabitacionId;
import reserva.values.TipoAcomodacion;

public class RealizarUpgrade extends Command {

    private final HabitacionId habitacionId;
    private final TipoAcomodacion tipoAcomodacion;

    public RealizarUpgrade(
            HabitacionId habitacionId,
            TipoAcomodacion tipoAcomodacion) {
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
