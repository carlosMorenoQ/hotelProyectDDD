package checkOut.events;

import checkOut.values.CamareraId;
import checkOut.values.HabitacionParaLimpieza;
import co.com.sofka.domain.generic.DomainEvent;

public class HabitacionParaLimpiezaAsignada extends DomainEvent {
    public HabitacionParaLimpiezaAsignada(CamareraId camareraId, HabitacionParaLimpieza habitacionParaLimpieza) {
        super();
    }
}
