package checkIn;

import checkIn.values.LLaveHabitacionId;
import checkIn.values.NumeroHabitacionEnLLave;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class LLaveHabitacion extends Entity<LLaveHabitacionId> {

    private NumeroHabitacionEnLLave numeroHabitacionEnLLave;

    public LLaveHabitacion(LLaveHabitacionId lLaveHabitacionId,
                           NumeroHabitacionEnLLave numeroHabitacionEnLLave) {
        super(lLaveHabitacionId);
        this.numeroHabitacionEnLLave = Objects.requireNonNull(numeroHabitacionEnLLave);
    }

    public void asignarNumeroHabitacionEnLLave(NumeroHabitacionEnLLave numeroHabitacionEnLLave){
        this.numeroHabitacionEnLLave = Objects.requireNonNull(numeroHabitacionEnLLave);
    }

    public void deasignarNumeroHabitacionEnLLave(){
        this.numeroHabitacionEnLLave = null;
    }

    public NumeroHabitacionEnLLave numeroHabitacionEnLLave() {
        return numeroHabitacionEnLLave;
    }

}
