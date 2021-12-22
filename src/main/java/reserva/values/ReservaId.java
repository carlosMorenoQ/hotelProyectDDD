package reserva.values;

import co.com.sofka.domain.generic.Identity;

public class ReservaId extends Identity {

    public ReservaId(String value) {
        super(value);
    }

    public ReservaId() {
    }

    public static ReservaId of(String value){
        return new ReservaId(value);
    }

}
