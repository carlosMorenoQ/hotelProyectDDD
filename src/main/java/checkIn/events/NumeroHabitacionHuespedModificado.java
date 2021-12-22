package checkIn.events;

import checkIn.values.HuespedId;
import checkIn.values.NumeroHabitacionHuesped;
import co.com.sofka.domain.generic.DomainEvent;

public class NumeroHabitacionHuespedModificado extends DomainEvent {

    public final HuespedId huespedId;
    public final NumeroHabitacionHuesped numeroHabitacionHuesped;


    public NumeroHabitacionHuespedModificado(
            HuespedId huespedId,
            NumeroHabitacionHuesped numeroHabitacionHuesped) {
        super("hotel.checkIn.numeroHabitacionHuespedModificado");
        this.huespedId = huespedId;
        this.numeroHabitacionHuesped = numeroHabitacionHuesped;
    }

    public HuespedId getHuespedId() {
        return huespedId;
    }

    public NumeroHabitacionHuesped getNumeroHabitacionHuesped() {
        return numeroHabitacionHuesped;
    }


}
