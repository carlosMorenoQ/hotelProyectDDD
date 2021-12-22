package checkIn.comands;

import checkIn.values.HuespedId;
import checkIn.values.LLaveHabitacionId;
import checkIn.values.NumeroHabitacionEnLLave;
import checkIn.values.NumeroHabitacionHuesped;
import co.com.sofka.domain.generic.Command;

public class ModificarNumeroHabitacionEnHuesped extends Command {

    private final HuespedId huespedId;
    private final NumeroHabitacionHuesped numeroHabitacionHuespe;

    public ModificarNumeroHabitacionEnHuesped(HuespedId huespedId,
                                              NumeroHabitacionHuesped numeroHabitacionHuespe) {
        this.huespedId = huespedId;
        this.numeroHabitacionHuespe = numeroHabitacionHuespe;
    }

    public HuespedId getHuespedId() {
        return huespedId;
    }

    public NumeroHabitacionHuesped getNumeroHabitacionHuespe() {
        return numeroHabitacionHuespe;
    }
}
