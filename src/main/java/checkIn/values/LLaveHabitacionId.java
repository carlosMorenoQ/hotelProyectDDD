package checkIn.values;

import co.com.sofka.domain.generic.Identity;

public final class LLaveHabitacionId extends Identity {

    public LLaveHabitacionId(String value) {
        super(value);
    }

    public LLaveHabitacionId() {
    }

    public static LLaveHabitacionId of(String value){
        return new LLaveHabitacionId(value);
    }

}
