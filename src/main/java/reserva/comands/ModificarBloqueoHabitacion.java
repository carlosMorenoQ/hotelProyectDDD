package reserva.comands;

import co.com.sofka.domain.generic.Command;
import reserva.values.HabitacionId;
import reserva.values.IsBloqueada;

public class ModificarBloqueoHabitacion extends Command {

    private final HabitacionId habitacionId;
    private final IsBloqueada isBloqueada;

    public ModificarBloqueoHabitacion(
            HabitacionId habitacionId,
            IsBloqueada isBloqueada) {
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
