package checkIn.values;

import genericos.Id;

public final class HuespedId extends Id {


    private HuespedId(String value) {
        super(value);
    }

    public HuespedId() {
    }

    public static HuespedId of(String value) {
        return new HuespedId(value);
    }

}
