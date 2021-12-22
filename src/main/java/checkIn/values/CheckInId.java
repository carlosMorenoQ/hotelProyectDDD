package checkIn.values;

import co.com.sofka.domain.generic.Identity;

public final class CheckInId extends Identity {

    public CheckInId(String value) {
        super(value);
    }

    public CheckInId() {
    }

    public static CheckInId of(String value) {
        return new CheckInId(value);
    }

}
