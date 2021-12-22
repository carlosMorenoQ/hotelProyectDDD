package reserva.values;

import co.com.sofka.domain.generic.Identity;

public class HabitacionId extends Identity {


    public HabitacionId(String value) {
        super(value);
    }

    public HabitacionId() {
    }

    public static HabitacionId of(String value){
        return new HabitacionId(value);
    }


}
