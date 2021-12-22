package checkOut.events;

import checkOut.values.CamareraId;
import checkOut.values.HabitacionParaLimpieza;
import co.com.sofka.domain.generic.DomainEvent;

public class HabitacionParaLimpiezaAsignada extends DomainEvent {

    private final CamareraId camareraId;
    private final HabitacionParaLimpieza habitacionParaLimpieza;


    public HabitacionParaLimpiezaAsignada(
            CamareraId camareraId,
            HabitacionParaLimpieza habitacionParaLimpieza) {
        super("hotel.checkOut.habitacionParaLimpiezaAsignada");
        this.habitacionParaLimpieza=habitacionParaLimpieza;
        this.camareraId = camareraId;
    }

    public CamareraId getCamareraId() {
        return camareraId;
    }

    public HabitacionParaLimpieza getHabitacionParaLimpieza() {
        return habitacionParaLimpieza;
    }
}
