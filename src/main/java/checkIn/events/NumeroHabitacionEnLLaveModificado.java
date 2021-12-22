package checkIn.events;

import checkIn.values.LLaveHabitacionId;
import checkIn.values.NumeroHabitacionEnLLave;
import co.com.sofka.domain.generic.DomainEvent;

public class NumeroHabitacionEnLLaveModificado extends DomainEvent {

    private final LLaveHabitacionId lLaveHabitacionId;
    private final NumeroHabitacionEnLLave numeroHabitacionEnLLave;

    public NumeroHabitacionEnLLaveModificado(
            LLaveHabitacionId lLaveHabitacionId,
            NumeroHabitacionEnLLave numeroHabitacionEnLLave) {
        super("hotel.checkin.numeroHabitacionEnLLaveModificado");
        this.lLaveHabitacionId = lLaveHabitacionId;
        this.numeroHabitacionEnLLave=numeroHabitacionEnLLave;

    }

    public LLaveHabitacionId getlLaveHabitacionId() {
        return lLaveHabitacionId;
    }

    public NumeroHabitacionEnLLave getNumeroHabitacionEnLLave() {
        return numeroHabitacionEnLLave;
    }

}
