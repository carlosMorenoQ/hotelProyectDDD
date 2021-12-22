package checkOut.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.generic.ValueObject;

public class CamareraId extends Identity {

    public CamareraId(String value) {
        super(value);
    }

    public CamareraId() {
    }

    public static CamareraId of(String value){
        return new CamareraId(value);
    }
}
