package checkIn.values;

import genericos.Id;

public final class LLaveHabitacionId extends Id {

    public LLaveHabitacionId(String value) {
        super(value);
    }

    public LLaveHabitacionId() {
    }

    public static LLaveHabitacionId of(String value) {
        return new LLaveHabitacionId(value);
    }

}
