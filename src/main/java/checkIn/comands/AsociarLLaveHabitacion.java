package checkIn.comands;

import checkIn.values.LLaveHabitacionId;
import checkIn.values.NumeroHabitacionEnLLave;
import co.com.sofka.domain.generic.Command;

public class AsociarLLaveHabitacion extends Command {

    private final LLaveHabitacionId lLaveHabitacionId;
    private final NumeroHabitacionEnLLave numeroHabitacionEnLLave;

    public AsociarLLaveHabitacion(LLaveHabitacionId lLaveHabitacionId,
                                  NumeroHabitacionEnLLave numeroHabitacionEnLLave) {
        this.lLaveHabitacionId = lLaveHabitacionId;
        this.numeroHabitacionEnLLave = numeroHabitacionEnLLave;
    }

    public LLaveHabitacionId getlLaveHabitacionId() {
        return lLaveHabitacionId;
    }

    public NumeroHabitacionEnLLave getNumeroHabitacionEnLLave() {
        return numeroHabitacionEnLLave;
    }

}
