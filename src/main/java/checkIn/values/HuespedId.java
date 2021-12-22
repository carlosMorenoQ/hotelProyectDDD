package checkIn.values;

import co.com.sofka.domain.generic.Identity;

public final class HuespedId extends Identity {

    public HuespedId(String value) {
        super(value);
    }

    public HuespedId() {
    }

    public static HuespedId of(String value){
        return new HuespedId(value);
    }

}
