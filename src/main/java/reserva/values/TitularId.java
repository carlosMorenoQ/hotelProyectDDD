package reserva.values;

import co.com.sofka.domain.generic.Identity;

public class TitularId extends Identity {

    public TitularId(String value) {
        super(value);
    }

    public TitularId() {
    }

    public static TitularId of(String value) {
        return new TitularId(value);
    }
}
