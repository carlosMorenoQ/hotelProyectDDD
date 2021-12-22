package checkOut.values;

import co.com.sofka.domain.generic.Identity;

public class CheckOutId extends Identity {

    public CheckOutId(String value) {
        super(value);
    }

    public CheckOutId() {
    }

    public static CheckOutId of(String value) {
        return new CheckOutId(value);
    }


}
