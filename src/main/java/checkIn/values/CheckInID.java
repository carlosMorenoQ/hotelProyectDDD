package checkIn.values;

import checkIn.CheckIn;
import genericos.Id;

public final class CheckInID extends Id {

    private CheckInID(String value) {
        super(value);
    }

    public CheckInID() {
    }

    public static CheckInID of(String value) {
        return new CheckInID(value);
    }

}
