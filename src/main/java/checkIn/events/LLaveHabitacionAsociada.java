package checkIn.events;

import checkIn.values.LLaveHabitacionId;
import checkIn.values.NumeroHabitacionEnLLave;
import checkIn.values.NumeroHabitacionHuesped;
import co.com.sofka.domain.generic.DomainEvent;

public class LLaveHabitacionAsociada extends DomainEvent {

    public final NumeroHabitacionEnLLave numeroHabitacionEnLLave;
    public final LLaveHabitacionId lLaveHabitacionId;

    public LLaveHabitacionAsociada(
            LLaveHabitacionId lLaveHabitacionId,
            NumeroHabitacionEnLLave numeroHabitacionEnLLave) {
        super("hotel.checkIn.llaveHabitacionAgregada");
        this.numeroHabitacionEnLLave = numeroHabitacionEnLLave;
        this.lLaveHabitacionId = lLaveHabitacionId;
    }

    public NumeroHabitacionEnLLave getNumeroHabitacionEnLLave() {
        return numeroHabitacionEnLLave;
    }

    public LLaveHabitacionId getlLaveHabitacionId() {
        return lLaveHabitacionId;
    }
}
